package model.linha;

import entidades.cliente.Cliente;
import entidades.validacao.Resolucao;

public interface MassivoLinhaInterface{

	public Resolucao validarRegistroCentral(Cliente cliente);
	
	public Resolucao validarConectividade(Cliente cliente);

	
}
