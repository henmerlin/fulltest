package model.linha;

import java.util.List;

import entidades.cliente.Cliente;

public interface LinhaServicoInterface{

	public Cliente consultarConfiguracoes(Cliente cliente) throws Exception;
	
	public List<Exception> validarConfiguracoes(Cliente cliente);
	
	public void realizarCorrecoes(Cliente cliente) throws Exception;
	
}
