package model.linha.ims;


import model.linha.LinhaServico;
import model.telnet.Telnet;

public class ImsServico extends LinhaServico{
	
	private Telnet telnet;
		
	public ImsServico() {
		this.telnet = new Telnet();
	}
	
	
	public void consultar() {

		
	}
	
	public Telnet getTelnet() {
		return telnet;
	}


	public void setTelnet(Telnet telnet) {
		this.telnet = telnet;
	}

}
