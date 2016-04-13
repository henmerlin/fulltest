package model.banda.gpon.alcatel;

import java.util.ArrayList;

import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.BandaInterface;
import entidades.banda.parametros.TabelaParametrosGpon;
import entidades.cadastro.Cadastro;
import model.banda.BandaServicoInterface;
import model.banda.metalico.DslamGerenciavel;
import model.factory.BandaFactory;
import model.telnet.ComandoTelnet;
import model.telnet.ExecutionType;
import util.TelnetUtil;

public class AlcatelServico extends DslamGerenciavel implements BandaServicoInterface{

	public AlcatelServico() {

		this.getTelnet().setMode(ExecutionType.ALCATEL_GPON);
		this.getTelnet().setAuth(BandaFactory.alcatelCredencial());
	}

	public TabelaParametrosGpon consultarTabelaParametros(Cadastro cadastro) throws Exception {

		/*Cadastro cadastro = new CadastroGpon();

		InfoTBS tbs = cadastro.getCadastro().getInfoTBS();*/	
		
		InfoTBS tbs = new InfoTBS();

		tbs.setIpDslam("10.214.57.11");		

		this.getTelnet().setIp(tbs.getIpDslam());

		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdGetProfilePort()));
		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdGetPotencia()));
		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdGetPortStatus()));

		ArrayList<String> retorno = (ArrayList<String>) this.getTelnet().run();

		TabelaParametrosGpon tabela = new TabelaParametrosGpon();
		
		
		String profileDown = TelnetUtil.tratamentoStringAlcatel(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "NGLT_Default", 2)));
		String profileUP = TelnetUtil.tratamentoStringAlcatel(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "bandwidth-profile", 1)));

		tabela.setProfile(profileDown + " - " + profileUP);
		
		
		String linha = retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "rx-signal", 1));
		
		Integer limite1 = linha.indexOf("|", 1);
		Integer limite2 = linha.indexOf("|", limite1 + 1);
		Integer limite3 = linha.indexOf("|", limite2 + 1);
		Integer limite4 = linha.indexOf("|", limite3 + 1);
		Integer limite5 = linha.indexOf("|", limite4 + 1);
		Integer limite6 = linha.indexOf("|", limite5 + 1);
		
		
		String potencia = (String) retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "rx-signal", 1) + 3);
		
		String ret = (String) potencia.subSequence(limite1, limite2);
		String ret1 = (String) potencia.subSequence(limite6, potencia.length());

		
		tabela.setPotenciaONT(new Double(ret.trim()));
		tabela.setPotenciaOLT(new Double(ret1.trim()));
			
		tabela.setPortaAdmStatus(TelnetUtil.tratamentoStringAlcatel2(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Gpon::Inactive", 1))));
						
		/*System.out.println(this.cmdGetBridge());
		System.out.println(this.cmdGetSagePorta());
		System.out.println(this.cmdGetPotencia());*/
		
		//TelnetUtil.debugger(retorno);
		
		return tabela;

	}

	public String cmdListModemNaoAssoc(){

		return "show pon unprovision-onu";
	}

	public String cmdGetSagePorta(){

		Integer slot = 6;
		Integer olt = 1;
		Integer logica = 8;		
		
		return "show equipment ont interface 1/1/"+ slot +"/"+ olt +"/"+ logica;
	}
	
	public String cmdGetPotencia(){

		Integer slot = 6;
		Integer olt = 1;
		Integer logica = 8;	
		
		return "show equipment ont optics 1/1/"+ slot +"/"+ olt +"/"+ logica;
	}
	
	public String cmdGetBridge(){
		
		Integer slot = 6;
		Integer olt = 1;
		Integer logica = 8;

		return "info configure bridge port 1/1/"+ slot +"/"+ olt +"/"+ logica +"/4/1";
	}
	
	public String cmdGetMacinPort(){
		
		Integer slot = 6;
		Integer olt = 1;
		Integer logica = 8;

		return "show vlan bridge-port-fdb | match exact:1/1/"+ slot +"/"+ olt +"/"+ logica +"/4/1";
		
	}
	
	public String cmdGetProfilePort(){
		
		Integer slot = 6;
		Integer olt = 1;
		Integer logica = 8;	

		return "info configure qos interface 1/1/"+ slot +"/"+ olt +"/"+ logica +"/4/1 flat";
	}
	
	public String cmdGetPortStatus(){
		
		Integer slot = 6;
		Integer olt = 1;
		Integer logica = 8;	

		return "show equipment ont operational-data 1/1/"+ slot +"/"+ olt +"/" + logica + " xml";
	}

	@Override
	public BandaInterface consultarBridges(BandaInterface banda) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
