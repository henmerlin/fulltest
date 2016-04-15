package model.banda.metalico.zhone;

import java.math.BigInteger;
import java.util.ArrayList;

import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.BandaInterface;
import entidades.banda.metalico.zhone.Mxk;
import entidades.banda.metalico.zhone.configs.Bridge;
import entidades.banda.parametros.TabelaParametrosMetalico;
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

	public TabelaParametrosMetalico consultarTabelaParametros() throws Exception{

		InfoTBS tbs = new InfoTBS();

		tbs.setIpDslam("10.221.146.61");
		tbs.setSlot(new BigInteger("16"));
		tbs.setPortNumber(new BigInteger("10"));
		tbs.setPortAddrSeq(new BigInteger("1418"));		

		this.getSocket().setIp(tbs.getIpDslam());

		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdPortStatus()));
		this.getSocket().getComandos().add(new ComandoTelnet("A"));

		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdModulacao()));

		this.getSocket().getComandos().add(new ComandoTelnet(this.profileDown()));

		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdProfileUp()));

		this.getSocket().setMode(ExecutionType.ZHONE_MXK);

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

	public String cmdPortStatus(){

		return "dslstat 1/" + this.getTbs().getSlot() + "/" + this.getTbs().getPortNumber() + "/0/vdsl -v";
	}
	/*
	 * Retorna o profile de down da porta
	 */
	public String profileDown(){

		return "get vdsl-co-config 1/" + this.getTbs().getSlot() + "/" + this.getTbs().getPortNumber() + "/0/vdsl";
	}
	/*
	 * Retorna o profile de up da porta
	 */
	public String cmdProfileUp(){

		return "get vdsl-cpe-config 1/" + this.getTbs().getSlot() + "/" + this.getTbs().getPortNumber() + "/0/vdsl";
	}
	/*
	 * Retorna a modulação da porta
	 */
	public String cmdModulacao(){	

		return "get vdsl-config  1/" + this.getTbs().getSlot() + "/" + this.getTbs().getPortNumber() + "/0/vdsl";

	}

	/**
	 * Comando de cria bridge 
	 * @param tbs
	 * @return
	 */
	public String cmdCriaBridge(Bridge bridge){

		String comando = null;

		Integer port100 = Integer.parseInt(bridge.getEndSeqPort()) + 100;

		Integer rin = null;

		if (bridge.getVc().equalsIgnoreCase("35")) {

			comando = "bridge add 1-" + bridge.getSlot() + "-" + bridge.getPort() + "-0/vdsl vc 0/35 downlink vlan 600 xlate-to " + port100 + " slan " + bridge.getRin() + " tagged";

		}else if (bridge.getVc().equalsIgnoreCase("36")) {

			rin = Integer.parseInt(bridge.getRin()) + 1000;

			comando = "bridge add 1-" + bridge.getSlot() + "-" + bridge.getPort() + "-0/vdsl vc 0/36 downlink vlan 601 xlate-to " + port100 + " slan " + rin + " tagged";

		}else if (bridge.getVc().equalsIgnoreCase("37")) {

			rin = Integer.parseInt(bridge.getRin()) + 3000;

			comando = "bridge add 1-" + bridge.getSlot() + "-" + bridge.getPort() + "-0/vdsl vc 0/37 downlink vlan 602 xlate-to " + port100 + " slan " + rin + " tagged cos 3 outcosall 3 scos 3 soutcosall 3";

		}else if (bridge.getVc().equalsIgnoreCase("38")) {

			comando = "bridge add 1-" + bridge.getSlot() + "-" + bridge.getPort() + "-0/vdsl vc 0/38 downlink vlan 4000 cos 4 outcosall 4 ipktrule 1 video 0/3";

		}

		return comando;
	}

	/**
	 * Comando de deleta bridge.
	 * @param tbs
	 * @return
	 */
	public String cmdDeletaBridge(Bridge bridge){

		Integer rin = null;

		String comando = "";

		BigInteger port100 = this.getTbs().getPortAddrSeq().add(new BigInteger("100"));

		if (bridge.getVc().equalsIgnoreCase("35")){

			rin = Integer.parseInt(bridge.getRin());

		}else if (bridge.getVc().equalsIgnoreCase("36")) {

			rin = Integer.parseInt(bridge.getRin()) + 1000;

		}else if (bridge.getVc().equalsIgnoreCase("37")) {

			rin = Integer.parseInt(bridge.getRin()) + 3000;

		}

		if (bridge.getVc().equalsIgnoreCase("38")){

			comando = "bridge delete 1-" + this.getTbs().getSlot() + "-" + this.getTbs().getPortNumber() + "-0/vdsl vc 0/38";

		}else{

			comando = "bridge delete 1-" + this.getTbs().getSlot() + "-" + this.getTbs().getPortNumber() + "-0/vdsl vc 0/" + bridge.getVc() + " vlan " + port100 + " slan " + rin;

		}

		return comando;

	}	

	public BandaInterface consultarBridges(BandaInterface banda) throws Exception {

		Mxk mxk = (Mxk) banda;

		this.getSocket().setMode(ExecutionType.ZHONE_MXK);

		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdBridgesPort()));		

		ArrayList<String> retorno = (ArrayList<String>) this.getSocket().run();		

		Integer contagem = TelnetUtil.contagemDeBridges(retorno);

		String showVlan = null;
		
		for (int i = 1; i < contagem; i++) {

			showVlan = TelnetUtil.tratamentoStringBridgeShowVlan(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "/bridge", i)));

			String[] split  = showVlan.split("-");

			if (split[6].equalsIgnoreCase("35")) {

				Bridge autenticacao = new Bridge();

				autenticacao.setSlot(split[1]);
				autenticacao.setPort(split[2]);								
				autenticacao.setRin(split[0].substring(0, 3));

				Integer enSeqPort = Integer.parseInt(split[7].substring(0, 4))-100;

				autenticacao.setEndSeqPort(Integer.toString(enSeqPort));				
				autenticacao.setVc("35");

				mxk.setAutenticacao(autenticacao);

			}else if (split[6].equalsIgnoreCase("36")) {

				Bridge voip = new Bridge();

				voip.setSlot(split[1]);
				voip.setPort(split[2]);
				voip.setRin(showVlan.substring(24, 27));
				voip.setEndSeqPort(showVlan.substring(20, 23));
				voip.setVc("36");

				mxk.setVoip(voip);

			}else if (split[6].equalsIgnoreCase("37")) {

				Bridge pvc = new Bridge();

				pvc.setSlot(split[1]);
				pvc.setPort(split[2]);
				pvc.setRin(showVlan.substring(24, 27));
				pvc.setEndSeqPort(showVlan.substring(20, 23));
				pvc.setVc("37");

				mxk.setTv(pvc);

			}else if (split[6].equalsIgnoreCase("38")) {

				Bridge multicast = new Bridge();

				multicast.setSlot(split[1]);
				multicast.setPort(split[2]);
				multicast.setRin(showVlan.substring(24, 27));
				multicast.setEndSeqPort(showVlan.substring(20, 23));
				multicast.setVc("38");

				mxk.setMulticast(multicast);

			}						
		}

		//TelnetUtil.debugger(retorno);

		return mxk;
	}
}
