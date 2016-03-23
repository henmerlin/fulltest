package model.linha.tdm;



import entidades.cliente.Cliente;

import model.linha.LinhaServicoInterface;
import model.telnet.Telnet;

public class NortelServico extends TdmServico implements LinhaServicoInterface{
	
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

	@Override
	public Cliente consultarConfiguracoes(Cliente cliente) {
		
		return cliente;
	}
}
