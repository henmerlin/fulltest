package model.banda.metalico.keymile;

import java.sql.Array;
import java.util.List;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import model.factory.BandaFactory;
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
		
		telnet.setAuth(BandaFactory.keymileCredencial());
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
	 * Retorna a lista de vccs do canal 	
	 */
	public List<Array> chanVccs(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando =  "ls /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/";
		
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
