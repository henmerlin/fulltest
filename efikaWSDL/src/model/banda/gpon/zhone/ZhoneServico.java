package model.banda.gpon.zhone;

import java.util.ArrayList;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.parametros.TabelaParametrosGpon;
import entidades.cadastro.Cadastro;
import entidades.cadastro.CadastroGpon;
import model.banda.metalico.DslamGerenciavel;
import model.factory.BandaFactory;
import model.telnet.ComandoTelnet;
import model.telnet.ExecutionType;
import util.TelnetUtil;

public class ZhoneServico extends DslamGerenciavel{

	public ZhoneServico() {
		this.getTelnet().setMode(ExecutionType.ZHONE_GPON);
		this.getTelnet().setAuth(BandaFactory.zhoneCredencial());
	}
	
	public TabelaParametrosGpon consultarTabelaParametros() throws Exception{

		Cadastro cadastro = new CadastroGpon();
		
		InfoTBS tbs = cadastro.getCadastro().getInfoTBS();
						
		// 1633360314 - INSTANCIA GPON-- TA DIFICI
		tbs.setIpDslam("10.214.57.251");
		
//		tbs.setSlot(new BigInteger("8"));
//		tbs.setPortNumber(new BigInteger("30"));
//		tbs.setPortAddrSeq(new BigInteger("126"));
		
		this.getTelnet().setIp(tbs.getIpDslam());
		
		/*
		 * e agora Jos�? o InfoTBS � de metalico T_T'
		 */

		this.getTelnet().getComandos().add(new ComandoTelnet("lst"));
		this.getTelnet().getComandos().add(new ComandoTelnet("a"));

		ArrayList<String> retorno = (ArrayList<String>) this.getTelnet().run();

		TabelaParametrosGpon tabela = new TabelaParametrosGpon();

		TelnetUtil.debugger(retorno);

		return tabela;
	}
	
//	public String cmdTaxadeErros(InfoTBS tbs){
//		return "port stats 1-" + tbs.getSlot() + "-" + tbs.get +;
//	}
	
	

}
