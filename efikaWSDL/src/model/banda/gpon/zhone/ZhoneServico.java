package model.banda.gpon.zhone;

import java.util.ArrayList;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.BandaInterface;
import entidades.banda.parametros.TabelaParametrosGpon;
import entidades.cadastro.Cadastro;
import entidades.cadastro.CadastroGpon;
import model.banda.BandaServicoInterface;
import model.banda.metalico.DslamGerenciavel;
import model.factory.BandaFactory;
import model.telnet.ComandoTelnet;
import model.telnet.ExecutionType;
import util.TelnetUtil;

public class ZhoneServico extends DslamGerenciavel implements BandaServicoInterface{

	public ZhoneServico() {
		this.getTelnet().setMode(ExecutionType.ZHONE_GPON);
		this.getTelnet().setAuth(BandaFactory.zhoneCredencial());
	}
	
	public TabelaParametrosGpon consultarTabelaParametros(Cadastro cadastro) throws Exception {

//		Cadastro cadastro = new CadastroGpon();
//		
//		InfoTBS tbs = cadastro.getCadastro().getInfoTBS();
		
		InfoTBS tbs = new InfoTBS();
		
		
		// 1633360314 - INSTANCIA GPON-- TA DIFICI
		tbs.setIpDslam("10.214.57.251");

		this.getTelnet().setIp(tbs.getIpDslam());
		
		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdConsultarConexaoFisica()));
		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdVerificarSage()));


		ArrayList<String> retorno = (ArrayList<String>) this.getTelnet().run();
		
		
		TabelaParametrosGpon tabela = new TabelaParametrosGpon();

		String linha = retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Power", 1) + 1);
		
		Integer limite1 = linha.indexOf(" ", 1);
		Integer limite2 = linha.indexOf(" ", limite1 + 1);
		Integer limite3 = linha.indexOf(" ", limite2 + 1);
		Integer limite4 = linha.indexOf(" ", limite3 + 1);
		Integer limite5 = linha.indexOf(" ", limite4 + 1);
		Integer limite6 = linha.indexOf(" ", limite5 + 1);
		Integer limite7 = linha.indexOf(" ", limite6 + 1);
		Integer limite8 = linha.indexOf(" ", limite7 + 1);
		
		String linha2 = retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Number", 1) + 1);
		
		Integer limit1 = linha2.indexOf(" ", 1);
		Integer limit2 = linha2.indexOf(" ", limit1 + 1);
		Integer limit3 = linha2.indexOf(" ", limit2 + 1);
		Integer limit4 = linha2.indexOf(" ", limit3 + 1);
		Integer limit5 = linha2.indexOf(" ", limit4 + 1);
		Integer limit6 = linha2.indexOf(" ", limit5 + 1);
		
		String resultado = (String) retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Power", 1) + 2);
		
		String resultado2 = (String) retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Number", 1) + 2);
		
		
		String oltpower = (String) resultado.substring(limite5, limite6);
		String ontpower = (String) resultado.substring(limite6, limite7);
		String sinc = (String) resultado.substring(limite2, limite3);
		String admstatus = (String) resultado.substring(limite8, resultado.length());
		
		String sage = (String) resultado2.substring(limit2, limit3).trim();
		
		tabela.setPotenciaONT(new Double(ontpower.trim().substring(0, ontpower.trim().length()-3)));
		tabela.setPotenciaOLT(new Double(oltpower.trim().substring(0, oltpower.trim().length()-3)));
		tabela.setSincronismoStatus(sinc.trim());
		tabela.setPortaAdmStatus(admstatus.trim());
		
		System.out.println(sage);
		//TelnetUtil.debugger(retorno);

		return tabela;
	}
	
	public String cmdConsultarConexaoFisica(){
		
		Integer slot = 1;
		Integer olt = 1;
		Integer logica = 2;
		
		return "onu status " + slot +"/"+ olt +"/"+logica;
	}
	
	public String cmdVerificarSage(){
		
		Integer slot = 1;
		Integer olt = 1;
		Integer logica = 2;
		
		return "onu inventory 1-" + slot +"-"+ olt +"-"+logica;
	}
	
	public String cmdLocalizarSage(){
		
		String sage = "000049F7";
		
		
		return "onu find fsan " + sage;
	}	
	

	@Override
	public BandaInterface consultarBridges(BandaInterface banda) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
