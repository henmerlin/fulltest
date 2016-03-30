package model.linha;

import java.util.List;

import entidades.cliente.Cliente;
import model.modulos.OperacionalInterface;

public interface LinhaServicoInterface extends OperacionalInterface{

	public Cliente consultarConfiguracoes(Cliente cliente) throws Exception;
	
	public List<Exception> validarConfiguracoes(Cliente cliente);
	
	public void realizarCorrecoes(Cliente cliente) throws Exception;
	
}
