package model.linha.tdm;


import model.linha.LinhaServico;
import model.linha.LinhaServicoInterface;
import model.telnet.Telnet;

public class NortelServico extends LinhaServico implements LinhaServicoInterface{
	
	private Telnet telnet;
		
	public NortelServico() {
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
