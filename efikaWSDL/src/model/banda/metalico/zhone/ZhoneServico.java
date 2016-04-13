package model.banda.metalico.zhone;

import java.math.BigInteger;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import model.banda.metalico.DslamGerenciavel;
import model.factory.BandaFactory;
import model.telnet.ExecutionType;

public class ZhoneServico extends DslamGerenciavel{

	public ZhoneServico() {
		this.getSocket().setMode(ExecutionType.ZHONE);
		this.getSocket().setAuth(BandaFactory.zhoneCredencial());
	}
	/*
	 * Retorna:
	 * 		bridges
	 * 	 	estado das bridges
	 * 		mac que comunica-se com as bridges
	 */
	
	
	public String cmdBridgesPort(InfoTBS tbs){
		
		BigInteger cvid = tbs.getPortAddrSeq().add(new BigInteger("100"));
		
		return "bridge show vlan " + cvid;
	}
	

}
