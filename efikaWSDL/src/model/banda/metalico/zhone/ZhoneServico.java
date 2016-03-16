package model.banda.metalico.zhone;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;

public class ZhoneServico {

	public ZhoneServico() {
		
	}
	/*
	 * Retorna:
	 * 		bridges
	 * 	 	estado das bridges
	 * 		mac que comunica-se com as bridges
	 */
	public String bridgesPort(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando =  "bridge show vlan " + tbs.getPortAddrSequence()+100;
		
		return null;
	}

}
