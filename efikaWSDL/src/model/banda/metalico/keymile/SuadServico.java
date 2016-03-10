package model.banda.metalico.keymile;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import model.factory.DslamFactory;
import model.telnet.Telnet;

public class SuadServico {

	public SuadServico() {
		
	}
	
	public String consultarParametros(GetInfoOut cadastro) {
		
		InfoTBS tbs = cadastro.getInfoTBS();

		Telnet telnet = new Telnet();
		
		telnet.setAuth(DslamFactory.keymileCredencial());
		telnet.setIp(tbs.getIpDslam());
				
		
		return null;
	}

}
