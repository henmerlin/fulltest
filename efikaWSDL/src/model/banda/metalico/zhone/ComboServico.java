package model.banda.metalico.zhone;

import java.util.ArrayList;

import entidades.banda.BandaInterface;
import entidades.banda.metalico.zhone.Combo;
import entidades.banda.metalico.zhone.configs.Bridge;
import entidades.banda.parametros.TabelaParametrosMetalico;
import model.banda.BandaServicoInterface;
import model.telnet.ComandoTelnet;
import model.telnet.ExecutionType;
import util.TelnetUtil;

/**
 * Instancia para leitura (sem alteração):
 * 	3125265870
 * @author G0042204
 *
 */
public class ComboServico extends ZhoneServico implements BandaServicoInterface{

	public ComboServico() {

	}

	/**
	 * Retorna:
	 * 	estado da porta
	 * 	velocidade de sincronismo (up e down)
	 * 	snr (up e down)
	 * 	atn (up e down)
	 * 	pacotes recebidos
	 * 	pacotes enviados
	 * 	crc up e down
	 * 	fec up e down
	 * @return
	 * @throws Exception
	 */
	public TabelaParametrosMetalico consultarTabelaParametros() throws Exception{
				
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdPortStatus()));
		this.getSocket().getComandos().add(new ComandoTelnet("A"));

		this.getSocket().setMode(ExecutionType.ZHONE_SLOW);

		ArrayList<String> retorno = (ArrayList<String>) this.getTelnet().run();

		TabelaParametrosMetalico tabela = new TabelaParametrosMetalico();

		// Status Port
		tabela.setPortaAdmStatus(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "AdminStatus", 1))));
		tabela.setSincronismoStatus(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "LineStatus", 1))));

		// Velocidade Sincronizada
		tabela.setDownload(new Double(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "DslDownLineRate", 1)))) /1000);
		tabela.setUpload(new Double(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "DslUpLineRate", 1)))) /1000);

		// SNR
		tabela.setSnrDown(new Double(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "AdslAturCurrLineSnrMgn", 1)))) /10);
		tabela.setSnrUp(new Double(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "AdslAtucCurrLineSnrMgn", 1)))) /10);

		// ATN
		tabela.setAtnDown(new Double(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "AdslAturCurrLineAtn", 1)))) /10);
		tabela.setAtnUp(new Double(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "AdslAtucCurrLineAtn", 1)))) /10);

		// Execução dos outro comandos necessários
		ArrayList<ComandoTelnet> comandos = new ArrayList<ComandoTelnet>();

		comandos.add(new ComandoTelnet(this.cmdProfileDown()));
		comandos.add(new ComandoTelnet(this.cmdProfileUp()));
		comandos.add(new ComandoTelnet(this.cmdModulacao()));


		this.getTelnet().setComandos(comandos);

		this.getTelnet().setMode(ExecutionType.ZHONE);

		ArrayList<String> retorno1 = (ArrayList<String>) this.getTelnet().run();


		// Profile Download e Upload
		Double profileDown = new Double(TelnetUtil.tratamentoStringZhoneDif(retorno1.get(TelnetUtil.posicaoArrayDeSubString(retorno1, "fastMaxTxRate", 1))))/1000;
		Double profileUp =  new Double(TelnetUtil.tratamentoStringZhoneDif(retorno1.get(TelnetUtil.posicaoArrayDeSubString(retorno1, "fastMaxTxRate", 2))))/1000;

		tabela.setProfile(profileDown + " - " + profileUp);

		// Modulação
		tabela.setModulacao(TelnetUtil.tratamentoStringZhoneDif(retorno1.get(TelnetUtil.posicaoArrayDeSubString(retorno1, "adslTransmissionMode", 1))));

		TelnetUtil.debugger(retorno);		

		return tabela;
	}

	/**
	 * Retorna Estatísticas da Porta
	 * @param tbs
	 * @return
	 */
	public String cmdPortStatus(){
		return "dslstat 1/" + this.getTbs().getSlot() + "/" + this.getTbs().getPortNumber() + "/0/adsl -v";
	}


	/**
	 * Retorna o profile de down da porta
	 * @param tbs
	 * @return
	 */
	public String cmdProfileDown(){	
		return  "get adsl-co-profile 1/" + this.getTbs().getSlot() + "/" +this.getTbs().getPortNumber();
	}

	/**
	 * Retorna o profile de up da porta
	 * @param cadastro
	 * @return
	 */
	public String cmdProfileUp(){		
		return "get adsl-cpe-profile 1/" + this.getTbs().getSlot() + "/" + this.getTbs().getPortNumber();
	}

	/**
	 * Retorna a modulação da porta
	 * @param tbs
	 * @return
	 */
	public String cmdModulacao(){
		return "get adsl-profile 1/" + this.getTbs().getSlot() + "/" +this.getTbs().getPortNumber();
	}
	/**
	 * Comando de cria bridge.
	 * @param tbs
	 * @return
	 */
	
	public String cmdCriaBridge(Bridge bridge){

		String comando = null;

		Integer port100 = Integer.parseInt(bridge.getEndSeqPort()) + 100;

		Integer rin = null;

		if (bridge.getVc().equalsIgnoreCase("35")) {

			comando = "bridge add 1-" + bridge.getSlot() + "-" + bridge.getPort() + "-0/adsl vc 0/35 td 20 downlink vlan " + port100 + " slan " + bridge.getRin();

		}else if (bridge.getVc().equalsIgnoreCase("36")) {

			rin = Integer.parseInt(bridge.getRin()) + 1000;

			comando = "bridge add 1-" + bridge.getSlot() + "-" + bridge.getPort() + "-0/adsl vc 0/36 td 23 downlink vlan " + port100 + " slan " + rin + " cos 5 outcosall 5 scos 5 soutcosall 5";

		}else if (bridge.getVc().equalsIgnoreCase("37")) {

			rin = Integer.parseInt(bridge.getRin()) + 3000;

			comando = "bridge add 1-" + bridge.getSlot() + "-" + bridge.getPort() + "-0/adsl vc 0/37 td 21 downlink vlan " + port100 + " slan " + rin + " cos 3 outcosall 3 scos 3 soutcosall 3";

		}else if (bridge.getVc().equalsIgnoreCase("38")) {

			comando = "bridge add 1-" + bridge.getSlot() + "-" + bridge.getPort() + "-0/adsl vc 0/38 td 22 downlink vlan 4000 cos 4 outcosall 4";

		}

		return comando;

	}

	/**
	 * Comando de Deleta bridge.
	 * @param tbs
	 * @return
	 */
	public String cmdDeletaBridge(Bridge bridge){

		String comando = "bridge delete 1-" + bridge.getSlot() + "-" + bridge.getPort() + "-0/adsl vc " + bridge.getVc();		

		return comando;

	}

	/**
	 * Comando Alterar Profile de Download
	 * @param tbs
	 * @return
	 */
	public String cmdAlterarProfileDownload(){

		String comando = "update adsl-co-profile fastMaxTxRate=$down000 interleaveMaxTxRate=$down000 1/" + this.getTbs().getSlot() + "/"+ this.getTbs().getPortNumber();

		return comando;

	}

	/**
	 * Comando Alterar Profile de Upload
	 * @param tbs
	 * @return
	 */
	public String cmdAlterarProfileUp(){

		String comando = "update adsl-cpe-profile fastMaxTxRate=$up000 interleaveMaxTxRate=$up000 1/" + this.getTbs().getSlot() + "/"+ this.getTbs().getPortNumber();

		return comando;

	}

	public BandaInterface consultarBridges(BandaInterface banda) throws Exception {

		Combo combo = (Combo) banda;

		this.getSocket().setMode(ExecutionType.ZHONE);

		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdBridgesPort()));		

		ArrayList<String> retorno = (ArrayList<String>) this.getSocket().run();

		Integer contagem = TelnetUtil.contagemDeBridges(retorno);

		String showVlan = null;

		for (int i = 1; i < contagem; i++) {

			showVlan = TelnetUtil.tratamentoStringBridgeShowVlan2(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "/bridge", i)));			

			String[] split  = showVlan.split("-");	

			if (split[6].substring(0, 2).equalsIgnoreCase("35")) {

				Bridge autenticacao = new Bridge();

				autenticacao.setSlot(split[1]);
				autenticacao.setPort(split[2]);
				autenticacao.setRin(showVlan.substring(24, 27));

				Integer enSeqPort = Integer.parseInt(showVlan.substring(20, 23))-100;

				autenticacao.setEndSeqPort(Integer.toString(enSeqPort));
				autenticacao.setVc("35");

				combo.setAutenticacao(autenticacao);

				System.out.println(combo.getAutenticacao().getVc());

			}else if (split[6].substring(0, 2).equalsIgnoreCase("36")) {

				Bridge voip = new Bridge();

				voip.setSlot(split[1]);
				voip.setPort(split[2]);
				voip.setRin(showVlan.substring(24, 27));
				voip.setEndSeqPort(showVlan.substring(20, 23));
				voip.setVc("36");

				combo.setVoip(voip);

				System.out.println(combo.getVoip().getVc());

			}else if (split[6].substring(0, 2).equalsIgnoreCase("37")) {

				Bridge pvc = new Bridge();

				pvc.setSlot(split[1]);
				pvc.setPort(split[2]);
				pvc.setRin(showVlan.substring(24, 27));
				pvc.setEndSeqPort(showVlan.substring(20, 23));
				pvc.setVc("37");

				combo.setTv(pvc);

				System.out.println(combo.getTv().getVc());

			}else if (split[6].substring(0, 2).equalsIgnoreCase("38")) {

				Bridge multicast = new Bridge();

				multicast.setSlot(split[1]);
				multicast.setPort(split[2]);
				multicast.setRin(showVlan.substring(24, 27));
				multicast.setEndSeqPort(showVlan.substring(20, 23));
				multicast.setVc("38");

				combo.setMulticast(multicast);

				System.out.println(combo.getMulticast().getVc());

			}			
		}

		//TelnetUtil.debugger(retorno);

		return combo;
	}
	
}
