package model.modulos;

import entidades.cliente.Cliente;
import model.banda.BandaServico;
import model.cliente.ClienteServico;
import model.linha.LinhaServico;
import model.linha.LinhaServicoInterface;

public class OperacionalServico implements OperacionalInterface{

	private LinhaServico servicoLinha;

	private BandaServico servicoBanda;

	private ClienteServico servicoCadastro;

	// Serviço FullTest
	private LinhaServicoInterface servicoVoz;

	public OperacionalServico() {
		this.servicoLinha = new LinhaServico();
		this.servicoBanda = new BandaServico();
		this.servicoCadastro = new ClienteServico();
	}

	/**
	 * Inicio do FullTest
	 */
	public Cliente consultar(Cliente cliente) throws Exception{
		
		cliente = this.servicoCadastro.consultar(cliente);		
		
		

		return cliente;
	}
	
}