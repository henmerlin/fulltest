package model.banda.metalico.keymile;


import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.parametros.DiaTabelaHistorico;
import entidades.banda.parametros.TabelaHistorico;
import model.banda.metalico.DslamGerenciavel;
import model.factory.BandaFactory;
import model.telnet.ComandoTelnet;
import model.telnet.ExecutionType;
import util.JSFUtil;
import util.TelnetUtil;

public class KeymileServico extends DslamGerenciavel{

	public KeymileServico() {
		this.getTelnet().setMode(ExecutionType.KEYMILE);
		this.getTelnet().setAuth(BandaFactory.keymileCredencial());
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

		// InfoTBS tbs = cadastro.getInfoTBS();
		InfoTBS tbs = new InfoTBS();

		tbs.setIpDslam("10.141.13.179");
		tbs.setSlot(new BigInteger("16"));
		tbs.setPortNumber(new BigInteger("12"));

		this.getTelnet().setAuth(BandaFactory.keymileCredencial());

		this.getTelnet().setIp(tbs.getIpDslam());

		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdHistoryTable(tbs)));

		
		ArrayList<String> retorno = (ArrayList<String>) this.getTelnet().run();

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
	
	
	/**
	 * Retorna o estado administrativo da porta 
	 * @param tbs
	 * @return
	 */
	public String cmdAdminStatus(InfoTBS tbs){
				
		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/main/administrativestatus";
	}

	/**
	 * Retorna o estado operacional da porta (Sincronismo)
	 * @param tbs
	 * @return String
	 */
	public String cmdOperStatus(InfoTBS tbs){

		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/main/operationalstatus";
	}
	
	/**
	 * Retorna a velocidade de sincronismo do canal
	 * @param tbs
	 * @return
	 */
	public String cmdChanStatus(InfoTBS tbs){
		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/status/status";
	}
	
	/**
	 * Consulta detalhe do Service
	 * @param srvc
	 * @return
	 */
	public String cmdSrvcDetail(String srvc){
		return "get /services/packet/1to1doubletag/"+ srvc + "/cfgm/Service";
	}
	
	
	/**
	 * Retorna a lista de vccs do canal 
	 * @param tbs
	 * @return
	 */
	public String cmdLsChanVccs(InfoTBS tbs){
		
		return "ls /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/";
	}
	
	
	/*
	 * Retorna srvcs das vccs do canal 	
	 */
	public String srvcs(InfoTBS tbs, String vcc){
		
		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/" + vcc + "/status/servicestatus";
	}
	
	/**
	 * Retorna tabela histórica da porta (resync, crc...) 	
	 * @param tbs
	 * @return
	 */
	public String cmdHistoryTable(InfoTBS tbs){		
		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/pm/history24htable";
	}
	/*
	 * Retorna tabela atual da porta (crc, fec...) 	
	 */
	public String cmdCurrentTable(InfoTBS tbs){

		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/pm/usercountertable";
	}
	/*
	 * Reseta tabela atual da porta (crc, fec...) 	
	 */
	public String cmdResetcurrentTable(InfoTBS tbs){
		
		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/pm/usercounterreset";
	}
	
	/*
	 * Retorna o mac comunicando-se com a interface de banda (mac do modem) 	
	 */
	public String macForwarding(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		//pegar interface da lista de interfaces/vccs
		
		String param = "interface-1/vcc-1";
		
		String comando1 = "set /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/" + param + "/cfgm/macsourcefilteringmode floodingprevention";
		String comando2 = "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/status/one2onemacforwardinglist";
		String comando3 = "set /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/" + param + "/cfgm/macsourcefilteringmode none";
		
		return null;
	}
}
