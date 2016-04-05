package model.banda.metalico.keymile;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import model.factory.BandaFactory;
import model.telnet.Telnet;

public class SuadServico {

	public SuadServico() {
		
	}

	/**
	 * Retorna:
	 * Velocidade do canal, em kbps;
	 * Sinal ruído da porta, em dB;
	 * Atenuação da porta, em dB; 
	 * @param cadastro
	 * @return
	 */
	public String consultarParametros(GetInfoOut cadastro) {
		
		InfoTBS tbs = cadastro.getInfoTBS();

		Telnet telnet = new Telnet();
		
		telnet.setAuth(BandaFactory.keymileCredencial());
		telnet.setIp(tbs.getIpDslam());
		
		String comando1 = "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/status/status";
		String comando2 = "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/status/snrmargin";
		String comando3 = "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/status/attenuation";
		
		return null;
	}
	/*
	 * Retorna o perfil do canal (profile) 	
	 */
	public String chanProfile(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando =  "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/cfgm/profilename";
		
		return null;
	}
	/*
	 * Retorna o perfil da porta (modulação) 	
	 */
	public String portProfile(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando =  "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/cfgm/portprofile";
		
		return null;
	}
	
}
