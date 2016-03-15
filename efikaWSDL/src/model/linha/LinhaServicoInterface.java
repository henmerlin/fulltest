package model.linha;

import java.rmi.RemoteException;

import entidades.cliente.Cliente;

public interface LinhaServicoInterface {
	
	public Cliente getConfiguracao(Cliente cliente) throws RemoteException;
	
	
}
