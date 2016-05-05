package model.linha;

import java.util.List;

import entidades.cliente.Cliente;

public interface LinhaServicoInterface{

	public Cliente consultarConfiguracoes(Cliente cliente) throws Exception;
	
	public List<String> validarConfiguracoes(Cliente cliente);

	public List<String> validarConfiguracoesLogicas(Cliente cliente);
		
	public void realizarCorrecoes(Cliente cliente) throws Exception;
	
}
