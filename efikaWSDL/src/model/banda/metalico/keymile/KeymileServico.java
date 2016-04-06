package model.banda.metalico.keymile;


import java.math.BigInteger;
import java.util.ArrayList;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.parametros.TabelaParametrosMetalico;
import entidades.banda.parametros.TabelaHistorico;
import model.factory.BandaFactory;
import model.telnet.ComandoTelnet;
import model.telnet.ExecutionType;
import model.telnet.Telnet;
import util.TelnetUtil;

public class KeymileServico {

	public KeymileServico() {
		
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

		tbs.setIpDslam("10.131.35.174");
		tbs.setSlot(new BigInteger("7"));
		tbs.setPortNumber(new BigInteger("35"));

		Telnet telnet = new Telnet();

		telnet.setAuth(BandaFactory.keymileCredencial());

		telnet.setIp(tbs.getIpDslam());

		telnet.getComandos().add(new ComandoTelnet(this.cmdHistoryTable(tbs)));

		telnet.setMode(ExecutionType.KEYMILE);

		ArrayList<String> retorno = (ArrayList<String>) telnet.run();

		TabelaHistorico tabela = new TabelaHistorico();

		//Resync
		tabela.setResyncHoje(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval0", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval0", 24)))));
		tabela.setResyncOntem(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval1", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval1", 24)))));
		tabela.setResyncAnteontem(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval2", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval2", 24)))));
		
		//Pckts
		tabela.setPcktsDownHoje(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval0", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval0", 15)))));
		tabela.setPcktsDownOntem(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval1", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval1", 15)))));
		tabela.setPcktsDownAnteontem(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval2", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval2", 15)))));
		tabela.setPcktsUpHoje(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval0", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval0", 12)))));
		tabela.setPcktsUpOntem(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval1", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval1", 12)))));
		tabela.setPcktsUpAnteontem(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval2", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval2", 12)))));
		
		//CRC
		
		tabela.setCrcDownHoje(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval0", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval0", 20)))));
		tabela.setCrcDownOntem(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval1", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval1", 20)))));
		tabela.setCrcDownAnteontem(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval2", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval2", 20)))));
		tabela.setCrcUpHoje(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval0", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval0", 27)))));
		tabela.setCrcUpOntem(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval1", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval1", 27)))));
		tabela.setCrcUpAnteontem(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval2", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval2", 27)))));
		
		//FEC
		
		tabela.setFecDownHoje(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval0", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval0", 19)))));
		tabela.setFecDownOntem(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval1", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval1", 19)))));
		tabela.setFecDownAnteontem(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval2", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval2", 19)))));
		tabela.setFecUpHoje(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval0", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval0", 26)))));
		tabela.setFecUpOntem(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval1", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval1", 26)))));
		tabela.setFecUpAnteontem(new BigInteger(TelnetUtil.tratamentoStringKeymile("\\ # Interval2", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Interval2", 26)))));
		
		// Debugger
		//TelnetUtil.debugger(retorno);

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
	

	/*
	 * Retorna a velocidade de sincronismo do canal
	 * @param tbs
	 * @return String
	 */
	
	public String cmdChanStatus(InfoTBS tbs){
		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/status/status";
	}
	
	
	/*
	 * Retorna a lista de vccs do canal 	
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
