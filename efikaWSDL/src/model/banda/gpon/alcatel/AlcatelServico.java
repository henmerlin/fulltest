package model.banda.gpon.alcatel;

import java.util.ArrayList;

import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.parametros.TabelaParametrosGpon;
import model.banda.metalico.DslamGerenciavel;
import model.factory.BandaFactory;
import model.telnet.ComandoTelnet;
import model.telnet.ExecutionType;
import util.TelnetUtil;

public class AlcatelServico extends DslamGerenciavel{

	public AlcatelServico() {

		this.getTelnet().setMode(ExecutionType.ALCATEL_GPON);
		this.getTelnet().setAuth(BandaFactory.alcatelCredencial());
	}

	public TabelaParametrosGpon consultarTabelaParametros() throws Exception {		

		/*Cadastro cadastro = new CadastroGpon();

		InfoTBS tbs = cadastro.getCadastro().getInfoTBS();*/		

		InfoTBS tbs = new InfoTBS();

		tbs.setIpDslam("10.214.57.11");		

		this.getTelnet().setIp(tbs.getIpDslam());

		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdGetMacinPort()));

		ArrayList<String> retorno = (ArrayList<String>) this.getTelnet().run();

		TabelaParametrosGpon tabela = new TabelaParametrosGpon();
		
		/*String profileDown = TelnetUtil.tratamentoStringAlcatel(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "NGLT_Default", 2)));
		String profileUP = TelnetUtil.tratamentoStringAlcatel(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "bandwidth-profile", 1)));

		tabela.setProfile(profileDown + " - " + profileUP);*/
		
		//tabela.setPotenciaONT(new Double(TelnetUtil.tratamentoStringAlcatel2(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "-", 1)))));
		
		//System.out.println(tabela.getPotenciaOLT());
		
		TelnetUtil.debugger(retorno);

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

}
