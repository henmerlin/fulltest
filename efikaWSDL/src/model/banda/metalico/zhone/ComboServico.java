package model.banda.metalico.zhone;

import java.math.BigInteger;
import java.util.ArrayList;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.parametros.TabelaParametrosMetalico;
import model.telnet.ComandoTelnet;
import util.TelnetUtil;

public class ComboServico extends ZhoneServico{

	public ComboServico() {
				
	}
	/*
	 * Retorna:
	 * 		estado da porta
	 * 	 	velocidade de sincronismo (up e down)
	 * 		snr (up e down)
	 * 		atn (up e down)
	 * 		pacotes recebidos
	 * 		pacotes enviados
	 * 		crc up e down
	 * 		fec up e down
	 */
	public TabelaParametrosMetalico consultarTabelaParametros() throws Exception{
		
		InfoTBS tbs = new InfoTBS();

		tbs.setIpDslam("10.161.139.17");
		tbs.setSlot(new BigInteger("12"));
		tbs.setPortNumber(new BigInteger("34"));
		tbs.setPortAddrSeq(new BigInteger("226"));

		this.getTelnet().setIp(tbs.getIpDslam());

		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdPortStatus(tbs)));
		this.getTelnet().getComandos().add(new ComandoTelnet("A"));
	
		ArrayList<String> retorno = (ArrayList<String>) this.getTelnet().run();

		TabelaParametrosMetalico tabela = new TabelaParametrosMetalico();

		//TelnetUtil.debugger(retorno);

		return tabela;
		
	}
	
	
	public String cmdPortStatus(InfoTBS tbs){
				
		return "dslstat 1/" + tbs.getSlot() + "/" + tbs.getPortNumber() + "/0/adsl -v";
	}
	/*
	 * Retorna o profile de down da porta
	 */
	public String profileDown(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando = "get adsl-co-profile 1/" + tbs.getSlot() + "/" +tbs.getPortNumber();
		
		return null;
	}
	/*
	 * Retorna o profile de up da porta
	 */
	public String profileUp(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando = "get adsl-cpe-profile 1/" + tbs.getSlot() + "/" +tbs.getPortNumber();
		
		return null;
	}
	/*
	 * Retorna a modulação da porta
	 */
	public String modulacao(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando = "get adsl-profile 1/" + tbs.getSlot() + "/" +tbs.getPortNumber();
		
		return null;
	}
}
