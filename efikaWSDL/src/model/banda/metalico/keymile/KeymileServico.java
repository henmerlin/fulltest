package model.banda.metalico.keymile;


import java.math.BigInteger;

import java.util.ArrayList;


import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import entidades.banda.BandaInterface;
import entidades.banda.metalico.keymile.Keymile;
import entidades.banda.metalico.keymile.configs.Srvc;
import entidades.banda.metalico.keymile.configs.Vcc;
import entidades.banda.parametros.DiaTabelaHistorico;
import entidades.banda.parametros.TabelaHistorico;
import model.banda.metalico.DslamMetalico;
import model.factory.BandaFactory;
import model.telnet.ComandoTelnet;
import model.telnet.ExecutionType;
import util.TelnetUtil;

public class KeymileServico extends DslamMetalico{

	public KeymileServico() {
		this.getTelnet().setMode(ExecutionType.KEYMILE);
		this.getTelnet().setAuth(BandaFactory.keymileCredencial());
		// Auth
		this.getSocket().setMode(ExecutionType.KEYMILE);
		this.getSocket().setAuth(BandaFactory.keymileCredencial());
	}

	/**
	 * Retorna:
	 * Velocidade do canal, em kbps;
	 * Sinal ruído da porta, em dB;
	 * Atenuação da porta, em dB; 
	 * @param cadastro
	 * @return
	 * @throws Exception 
	 */
	public TabelaHistorico consultarTabelaHistorico() throws Exception {

		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdHistoryTable()));


		ArrayList<String> retorno = (ArrayList<String>) this.getSocket().run();

		TabelaHistorico tabela = new TabelaHistorico();

		//Resync
		Integer posicaoResync = TelnetUtil.posicaoArrayDeSubString(retorno, "Near End Full Init Count", 1);

		// Pacotes
		Integer posicaoPcktsDown = TelnetUtil.posicaoArrayDeSubString(retorno, "Out Unicast Packets", 1);
		Integer posicaoPcktsUp = TelnetUtil.posicaoArrayDeSubString(retorno, "In Unicast Packets", 1);

		// CRC
		Integer posicaoCrcDown = TelnetUtil.posicaoArrayDeSubString(retorno, "Near End ES", 1);
		Integer posicaoCrcUp = TelnetUtil.posicaoArrayDeSubString(retorno, "Far End ES", 1);


		//FEC
		Integer posicaoFecDown = TelnetUtil.posicaoArrayDeSubString(retorno, "Near End FECS", 1);
		Integer posicaoFecUp = TelnetUtil.posicaoArrayDeSubString(retorno, "Far End FECS", 1);


		String interval = "\\ # Interval";

		for (int i = 1; i < 8; i++) {

			DiaTabelaHistorico dia = new DiaTabelaHistorico();

			dia.setResync(new BigInteger(TelnetUtil.tratamentoStringKeymile(interval, retorno.get(posicaoResync + i))));

			dia.setPcktsDown(new BigInteger(TelnetUtil.tratamentoStringKeymile(interval, retorno.get(posicaoPcktsDown + i))));
			dia.setPcktsUp(new BigInteger(TelnetUtil.tratamentoStringKeymile(interval, retorno.get(posicaoPcktsUp + i))));

			dia.setCrcDown(new BigInteger(TelnetUtil.tratamentoStringKeymile(interval, retorno.get(posicaoCrcDown + i))));
			dia.setCrcUp(new BigInteger(TelnetUtil.tratamentoStringKeymile(interval, retorno.get(posicaoCrcUp + i))));

			dia.setFecDown(new BigInteger(TelnetUtil.tratamentoStringKeymile(interval, retorno.get(posicaoFecDown + i))));
			dia.setFecUp(new BigInteger(TelnetUtil.tratamentoStringKeymile(interval, retorno.get(posicaoFecUp + i))));

			dia.setData(TelnetUtil.formatarDateDeMenosParametro(i));

			tabela.getDias().add(dia);
		}
		
		return tabela;
	}


	public BandaInterface consultarBridges(BandaInterface banda) throws Exception {
		
		Keymile keymile = (Keymile) banda;

		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdLsChanVccs()));
		
		ArrayList<String> retorno = (ArrayList<String>) this.getSocket().run();

		for (String string : retorno) {
			
			Vcc vcc1 = this.tratamentoVcc("1", string);
			if(vcc1 != null){
				keymile.setAutenticacao(vcc1);
			}
			
			Vcc vcc2 = this.tratamentoVcc("2", string);
			if(vcc2 != null){
				keymile.setVoip(vcc2);
			}		
			
			Vcc vcc3 = this.tratamentoVcc("3", string);
			if(vcc3 != null){
				keymile.setVideo(vcc3);
			}
			
			Vcc vcc4 = this.tratamentoVcc("4", string);
			if(vcc4 != null){
				keymile.setMultitela(vcc4);
			}
			
		}

		return keymile;
	}
	
	public Vcc tratamentoVcc(String idVcc, String linha) throws Exception{
		
		if(linha.trim().contentEquals("interface-" + idVcc) || linha.trim().contentEquals("vcc-" + idVcc)){

			Vcc vcc = new Vcc();
			Srvc srvc = new Srvc();
			vcc.setSeq(new Integer(idVcc));
			
			// Limpa buffer de comandos
			this.getSocket().getComandos().clear();				
			this.getSocket().getComandos().add(new ComandoTelnet(this.srvcs(linha.trim())));
	
			ArrayList<String> retConsultaVcc = (ArrayList<String>) this.getSocket().run();
	
			String serviceString = TelnetUtil.tratamentoStringKeymile("\\ # ServicesCurrentConnected", retConsultaVcc.get(TelnetUtil.posicaoArrayDeSubString(retConsultaVcc, "ServicesCurrentConnected", 1)));
			
			
			Integer inicio = serviceString.indexOf("srvc-")+5;
			Integer fim = serviceString.indexOf(";");
			
			String idService = serviceString.substring(inicio, fim);

			//System.out.println(serviceString);
			
			srvc.setSrvc(idService);
				
			// Limpa buffer de comandos
			this.getSocket().getComandos().clear();
			this.getSocket().getComandos().add(new ComandoTelnet(this.cmdSrvcDetail(srvc.getSrvc())));
			
			ArrayList<String> retorno2 = (ArrayList<String>) this.getSocket().run();
				
		
			srvc.setCvid(TelnetUtil.tratamentoStringKeymile("\\ # CVID", retorno2.get(TelnetUtil.posicaoArrayDeSubString(retorno2, "CVID", 1))));
			srvc.setcTagPriority(TelnetUtil.tratamentoStringKeymile("\\ # CTagPriority", retorno2.get(TelnetUtil.posicaoArrayDeSubString(retorno2, "CTagPriority", 1))));
			srvc.setsTagPriority(TelnetUtil.tratamentoStringKeymile("\\ # STagPriority", retorno2.get(TelnetUtil.posicaoArrayDeSubString(retorno2, "STagPriority", 1))));
			srvc.setSvid(TelnetUtil.tratamentoStringKeymile("\\ # Svid", retorno2.get(TelnetUtil.posicaoArrayDeSubString(retorno2, "Svid", 1))));
			srvc.setVlanHandling(TelnetUtil.tratamentoStringKeymile("\\ # VlanHandling", retorno2.get(TelnetUtil.posicaoArrayDeSubString(retorno2, "VlanHandling", 1))));
			
			vcc.setService(srvc);
			
			return vcc;
		}	
			
		return null;
	}
	
	/**
	 * Retorna o estado administrativo da porta 
	 * @param tbs
	 * @return
	 */
	public String cmdAdminStatus(){

		return "get /unit-" + this.getTbs().getSlot() + "/port-" + this.getTbs().getPortNumber() + "/main/administrativestatus";
	}

	/**
	 * Retorna o estado operacional da porta (Sincronismo)
	 * @param tbs
	 * @return String
	 */
	public String cmdOperStatus(){

		return "get /unit-" + this.getTbs().getSlot() + "/port-" + this.getTbs().getPortNumber() + "/main/operationalstatus";
	}

	/**
	 * Retorna a velocidade de sincronismo do canal
	 * @param tbs
	 * @return
	 */
	public String cmdChanStatus(){
		return "get /unit-" + this.getTbs().getSlot() + "/port-" + this.getTbs().getPortNumber() + "/chan-1/status/status";
	}

	/**
	 * Consulta detalhe do Service
	 * @param srvc
	 * @return
	 */
	public String cmdSrvcDetail(String srvc){
		return "get /services/packet/1to1doubletag/srvc-"+ srvc + "/cfgm/Service";
	}


	/**
	 * Retorna a lista de vccs do canal 
	 * @param tbs
	 * @return
	 */
	public String cmdLsChanVccs(){

		return "ls /unit-" + this.getTbs().getSlot() + "/port-" + this.getTbs().getPortNumber() + "/chan-1/";
	}


	/*
	 * Retorna srvcs das vccs do canal 	
	 */
	public String srvcs(String vcc){

		return "get /unit-" + this.getTbs().getSlot() + "/port-" + this.getTbs().getPortNumber() + "/chan-1/" + vcc + "/status/servicestatus";
	}

	/**
	 * Retorna tabela histórica da porta (resync, crc...) 	
	 * @param tbs
	 * @return
	 */
	public String cmdHistoryTable(){		
		return "get /unit-" + this.getTbs().getSlot() + "/port-" + this.getTbs().getPortNumber() + "/pm/history24htable";
	}
	/*
	 * Retorna tabela atual da porta (crc, fec...) 	
	 */
	public String cmdCurrentTable(){

		return "get /unit-" + this.getTbs().getSlot() + "/port-" + this.getTbs().getPortNumber() + "/pm/usercountertable";
	}
	/*
	 * Reseta tabela atual da porta (crc, fec...) 	
	 */
	public String cmdResetcurrentTable(){

		return "get /unit-" + this.getTbs().getSlot() + "/port-" + this.getTbs().getPortNumber() + "/pm/usercounterreset";
	}

	/*
	 * Retorna o mac comunicando-se com a interface de banda (mac do modem) 	
	 */
	public String macForwarding(GetInfoOut cadastro){

		/**
		 * 
		
		InfoTBS tbs = cadastro.getInfoTBS();
		//pegar interface da lista de interfaces/vccs

		String param = "interface-1/vcc-1";

		String comando1 = "set /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/" + param + "/cfgm/macsourcefilteringmode floodingprevention";
		String comando2 = "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/status/one2onemacforwardinglist";
		String comando3 = "set /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/" + param + "/cfgm/macsourcefilteringmode none";
 */
		
		return null;
	}
}
