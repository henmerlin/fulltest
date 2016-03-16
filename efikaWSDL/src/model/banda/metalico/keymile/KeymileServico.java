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
	public String adminStatus(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando =  "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/main/administrativestatus";
		
		return null;
	}
	/*
	 * Retorna o estado operacional da porta 	
	 */
	public String operStatus(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando =  "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/main/operationalstatus";
		
		return null;
	}
	/*
	 * Retorna a lista de vccs do canal 	
	 */
	public List<Array> chanVccs(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando =  "ls /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/";
		
		return null;
	}
	/*
	 * Retorna srvcs das vccs do canal 	
	 */
	public String srvcs(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		//varrer array dos vccs executando...
		String param = "param";
		
		String comando = "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/" + param + "/status/servicestatus";
		
		return null;
	}
	/*
	 * Retorna tabela histórica da porta (resync, crc...) 	
	 */
	public String historyTable(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
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
