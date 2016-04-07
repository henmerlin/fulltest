package model.banda.metalico.zhone;

import java.math.BigInteger;
import java.util.ArrayList;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.parametros.TabelaParametrosMetalico;
import model.telnet.ComandoTelnet;
import model.telnet.ExecutionType;
import util.TelnetUtil;

public class MxkServico extends ZhoneServico{

	public MxkServico() {
		
	}
	/*
	 * Retorna:
	 * 		estado da porta
	 * 	 	velocidade de sincronismo (up e down)
	 * 	 	snr (up e down)
	 * 		atn (up e down)
	 * 		pacotes recebidos
	 * 		pacotes enviados
	 * 		crc (up ou down ou a media dos dois, desconhecido)
	 */
	
	public TabelaParametrosMetalico consultarTabelaParametros() throws Exception{

		InfoTBS tbs = new InfoTBS();

		tbs.setIpDslam("10.171.33.102");
		tbs.setSlot(new BigInteger("16"));
		tbs.setPortNumber(new BigInteger("22"));
		tbs.setPortAddrSeq(new BigInteger("1430"));
		
		this.getTelnet().setIp(tbs.getIpDslam());
		
		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdPortStatus(tbs)));
		this.getTelnet().getComandos().add(new ComandoTelnet("A"));
		
		this.getTelnet().setMode(ExecutionType.ZHONE_MXK);
		
		ArrayList<String> retorno = (ArrayList<String>) this.getTelnet().run();
		
		TabelaParametrosMetalico tabela = new TabelaParametrosMetalico();

		TelnetUtil.debugger(retorno);

		return tabela;
	}
	
	public String cmdPortStatus(InfoTBS tbs){
		
		return "dslstat 1/" + tbs.getSlot() + "/" + tbs.getPortNumber() + "/0/vdsl -v";
	}
	/*
	 * Retorna o profile de down da porta
	 */
	public String profileDown(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando = "get vdsl-co-config 1/" + tbs.getSlot() + "/" +tbs.getPortNumber();
		
		return null;
	}
	/*
	 * Retorna o profile de up da porta
	 */
	public String cmdProfileUp(InfoTBS tbs){
				
		return "get vdsl-cpe-config 1/" + tbs.getSlot() + "/" +tbs.getPortNumber();
	}
	/*
	 * Retorna a modulação da porta
	 */
	public String cmdModulacao(InfoTBS tbs){
					
		return "get vdsl-config 1/" + tbs.getSlot() + "/" +tbs.getPortNumber();
	}

}
