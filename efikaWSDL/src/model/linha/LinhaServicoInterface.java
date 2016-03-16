package model.linha;

import java.rmi.RemoteException;

import entidades.cliente.Cliente;
import model.modulos.OperacionalInterface;

public interface LinhaServicoInterface extends OperacionalInterface{
	
	public Cliente getConfiguracao(Cliente cliente) throws RemoteException;
	
	
}
