package model.linha;


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
	
	/**
	 * 
	 * @param instancia
	 */
	public void consultar(String instancia){
		
		String comando = "qdn " + instancia;
		
		
	
		
	}
	
}
