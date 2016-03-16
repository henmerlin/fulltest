package model.banda.metalico.keymile;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import model.factory.BandaFactory;
import model.telnet.Telnet;

public class SuvdServico {

	public SuvdServico() {
		
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
		
		telnet.setAuth(BandaFactory.keymileCredencial());
		telnet.setIp(tbs.getIpDslam());
		
		String comando1 = "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/status/status";
		String comando2 = "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/status/bandstatus";
		
		return null;
	}
	/*
	 * Retorna o perfil do canal (profile) 	
	 */
	public String chanProfile(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando =  "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/cfgm/chanprofile";
		
		return null;
	}
	/*
	 * Retorna o perfil da porta (modulação) 	
	 */
	public String portProfile(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando =  "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/cfgm/portprofiles";
		
		return null;
	}
}
