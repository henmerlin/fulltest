package model.banda.metalico;

import model.telnet.SocketClass;
import model.telnet.Telnet;

public abstract class DslamGerenciavel {
	
	private Telnet telnet;
	
	private SocketClass socket;
		
	
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
}
