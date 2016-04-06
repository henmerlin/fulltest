package model.banda.metalico;

import model.telnet.Telnet;

public abstract class DslamGerenciavel {
	
	private Telnet telnet;
	
	public DslamGerenciavel() {
		this.telnet = new Telnet();
	}

	public Telnet getTelnet() {
		return telnet;
	}

	public void setTelnet(Telnet telnet) {
		this.telnet = telnet;
	}
}
