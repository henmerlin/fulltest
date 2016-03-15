package model.linha;

import java.rmi.RemoteException;
import java.util.List;

import entidades.cliente.Cliente;
import entidades.parametros.Configuracao;

public interface LinhaServicoInterface {
	
	public List<Configuracao> getConfiguracao(Cliente cliente) throws RemoteException;
	
	
}
