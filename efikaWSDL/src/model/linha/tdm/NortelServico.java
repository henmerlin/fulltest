package model.linha.tdm;


import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import entidades.cliente.Cliente;
import entidades.parametros.Configuracao;
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


	@Override
	public Cliente getConfiguracao(Cliente cliente) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Cliente consultar(Cliente cliente) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
