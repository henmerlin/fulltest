package model.banda.metalico;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import model.telnet.SocketClass;
import model.telnet.Telnet;

public abstract class DslamGerenciavel {
	
	private Telnet telnet;
	
	private SocketClass socket;
	
	private GetInfoOut getInfo;
	
	@SuppressWarnings("unused")
	private InfoTBS tbs;

	
	public DslamGerenciavel() {
		this.telnet = new Telnet();
		this.socket = new SocketClass();
	}

	public Telnet getTelnet() {
		return telnet;
	}

	public void setTelnet(Telnet telnet) {
		this.telnet = telnet;
	}
	
	public SocketClass getSocket() {
		return socket;
	}

	public void setSocket(SocketClass socket) {
		this.socket = socket;
	}
	
	public InfoTBS getTbs() {
		return this.getInfo.getInfoTBS();
	}

	public GetInfoOut getGetInfo() {
		return getInfo;
	}

	public void setGetInfo(GetInfoOut getInfo) {
		this.getInfo = getInfo;
	}
	
	
}
