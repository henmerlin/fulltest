package model.telnet;

public class ComandoTelnet {
	
	private String sintaxe;
		
	public ComandoTelnet() {

	}
	
	public ComandoTelnet(String sintaxe) {
		this.sintaxe = sintaxe;
	}
	
	public String getSintaxe() {
		return sintaxe;
	}

	public void setSintaxe(String sintaxe) {
		this.sintaxe = sintaxe;
	}

}
