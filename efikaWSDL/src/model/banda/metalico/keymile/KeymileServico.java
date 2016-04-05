package model.banda.metalico.keymile;

import java.sql.Array;
import java.util.List;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;

public class KeymileServico {

	public KeymileServico() {
		
	}
	
	/*
	 * Retorna o estado administrativo da porta 	
	 */
	public String cmdAdminStatus(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando =  "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/main/administrativestatus";
		
		return comando;
	}
	/*
	 * Retorna o estado operacional da porta 	
	 */
	public String cmdOperStatus(InfoTBS tbs){

		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/main/operationalstatus";
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
	/*
	 * Retorna tabela histórica da porta (resync, crc...) 	
	 */
	public String historyTable(InfoTBS tbs){
		
		
		String comando = "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/pm/history24htable";
		
		return null;
	}
	/*
	 * Retorna tabela atual da porta (crc, fec...) 	
	 */
	public String currentTable(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando = "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/pm/usercountertable";
		
		return null;
	}
	/*
	 * Reseta tabela atual da porta (crc, fec...) 	
	 */
	public void resetcurrentTable(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando = "/unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/pm/usercounterreset";
		
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
