package model.linha;

import entidades.cliente.Cliente;
import model.modulos.OperacionalInterface;

public interface LinhaServicoInterface extends OperacionalInterface{

	public Cliente consultarConfiguracoes(Cliente cliente) throws Exception;
	
}
