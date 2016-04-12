package model.banda.metalico.zhone;

import java.math.BigInteger;
import java.util.ArrayList;

import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.metalico.zhone.configs.Bridge;
import entidades.banda.parametros.TabelaParametrosMetalico;
import entidades.cadastro.Cadastro;
import model.banda.BandaServicoInterface;
import model.telnet.ComandoTelnet;
import model.telnet.ExecutionType;
import util.TelnetUtil;

public class MxkServico extends ZhoneServico implements BandaServicoInterface{

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

	public TabelaParametrosMetalico consultarTabelaParametros(Cadastro cadastro) throws Exception{

		InfoTBS tbs = new InfoTBS();

		tbs.setIpDslam("10.221.146.61");
		tbs.setSlot(new BigInteger("16"));
		tbs.setPortNumber(new BigInteger("10"));
		tbs.setPortAddrSeq(new BigInteger("1418"));		

		this.getTelnet().setIp(tbs.getIpDslam());

		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdPortStatus(tbs)));
		this.getTelnet().getComandos().add(new ComandoTelnet("A"));
		
		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdModulacao(tbs)));
		
		this.getTelnet().getComandos().add(new ComandoTelnet(this.profileDown(tbs)));
		
		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdProfileUp(tbs)));

		this.getTelnet().setMode(ExecutionType.ZHONE_MXK);

		ArrayList<String> retorno = (ArrayList<String>) this.getTelnet().run();

		TabelaParametrosMetalico tabela = new TabelaParametrosMetalico();

		// Status Port
		tabela.setPortaAdmStatus(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "AdminStatus", 1))));
		tabela.setSincronismoStatus(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "LineStatus", 1))));

		// Velocidade Sincronizada
		tabela.setDownload(new Double(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "DslDownLineRate", 1)))) /1000);
		tabela.setUpload(new Double(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "DslUpLineRate", 1)))) /1000);

		// SNR
		tabela.setSnrDown(new Double(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "curSnrMargin", 2)))) /10);
		tabela.setSnrUp(new Double(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "DslLineSnrMgn", 1)))) /10);
		
		
		// ATN
		tabela.setAtnDown(new Double(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "currAtn", 2)))) /10);
		tabela.setAtnUp(new Double(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "DslLineAtn", 1)))) /10);
		
		// Modulação
		tabela.setModulacao(TelnetUtil.tratamentoStringZhoneDif(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "transmit-mode", 1))));
		
		//Profile da porta Down/Up
		Double profileDown = new Double(TelnetUtil.tratamentoStringZhoneDif(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "interleaveMaxTxRate", 1))));
		Double profileUp = new Double(TelnetUtil.tratamentoStringZhoneDif(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "interleaveMaxTxRate", 2))));
				
		tabela.setProfile(profileDown + " - " + profileUp);
				
		//System.out.println(tabela.getProfile());		
		
		TelnetUtil.debugger(retorno);
		
		return tabela;
	}

	public String cmdPortStatus(InfoTBS tbs){

		return "dslstat 1/" + tbs.getSlot() + "/" + tbs.getPortNumber() + "/0/vdsl -v";
	}
	/*
	 * Retorna o profile de down da porta
	 */
	public String profileDown(InfoTBS tbs){

		return "get vdsl-co-config 1/" + tbs.getSlot() + "/" + tbs.getPortNumber() + "/0/vdsl";
	}
	/*
	 * Retorna o profile de up da porta
	 */
	public String cmdProfileUp(InfoTBS tbs){

		return "get vdsl-cpe-config 1/" + tbs.getSlot() + "/" + tbs.getPortNumber() + "/0/vdsl";
	}
	/*
	 * Retorna a modulação da porta
	 */
	public String cmdModulacao(InfoTBS tbs){	
		
		return "get vdsl-config  1/" + tbs.getSlot() + "/" + tbs.getPortNumber() + "/0/vdsl";
		
	}

	@Override
	public void consultarBridges(Cadastro cadastro) throws Exception {
		
		InfoTBS tbs = new InfoTBS();
		//3330211625
		tbs.setIpDslam("10.131.97.3");
		tbs.setSlot(new BigInteger("3"));
		tbs.setPortNumber(new BigInteger("21"));
		tbs.setPortAddrSeq(new BigInteger("1117"));		

		this.getTelnet().setIp(tbs.getIpDslam());

		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdBridgesPort(tbs)));
		
		this.getTelnet().setMode(ExecutionType.ZHONE_MXK);
		
		ArrayList<String> retorno = (ArrayList<String>) this.getTelnet().run();
		
		Bridge bridge = new Bridge();
		
		String showVlan = TelnetUtil.tratamentoStringBridgeShowVlan(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "/bridge", 1)));
		String rin = showVlan.substring(0, 3);
		
		String[] split  = showVlan.split("-");
		
		bridge.setSlot(split[1]);
		bridge.setPort(split[2]);
		bridge.setEndSeqPort(split[7]);
		bridge.setVcAutenticacao(split[6]);
		bridge.setRin(rin);
		
		/*String showVlan2 = TelnetUtil.tratamentoStringBridgeShowVlan(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "/bridge", 2)));
		String rin3k = showVlan2.substring(0, 4);
		String[] split2  = showVlan2.split("-");
		bridge.setVcPvc(split2[6]);
		bridge.setRin3k(rin3k);
		
		System.out.println(bridge.getVcPvc());
		System.out.println(bridge.getRin3k());*/
		
		
		TelnetUtil.debugger(retorno);		
	}
	
	

}
