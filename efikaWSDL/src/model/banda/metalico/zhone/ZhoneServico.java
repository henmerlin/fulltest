package model.banda.metalico.zhone;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import model.banda.metalico.DslamGerenciavel;
import model.factory.BandaFactory;
import model.telnet.ExecutionType;

public class ZhoneServico extends DslamGerenciavel{

	public ZhoneServico() {
		this.getTelnet().setMode(ExecutionType.ZHONE);
		this.getTelnet().setAuth(BandaFactory.zhoneCredencial());
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
