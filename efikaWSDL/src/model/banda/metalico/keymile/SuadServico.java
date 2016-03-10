package model.banda.metalico.keymile;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import model.factory.DslamFactory;
import model.telnet.Telnet;

public class SuadServico {

	public SuadServico() {
		
	}
	/*
	 * Retorna:
	 * 	velocidade do canal, em kbps;
	 * 	sinal ruído da porta, em dB;
	 * 	atenuação da porta, em dB; 
	 * 
	 */
	public String consultarParametros(GetInfoOut cadastro) {
		
		InfoTBS tbs = cadastro.getInfoTBS();

		Telnet telnet = new Telnet();
		
		telnet.setAuth(DslamFactory.keymileCredencial());
		telnet.setIp(tbs.getIpDslam());
		
		String comando1 = "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/status/status";
		String comando2 = "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/status/snrmargin";
		String comando3 = "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/status/attenuation";
		
		
		return null;
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
	 * Retorna o estado operacional da porta 	
	 */
	public String chanSrvcs(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando =  "ls /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/";
		
		return null;
	}
	
	
}
