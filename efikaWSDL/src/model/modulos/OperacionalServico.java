package model.modulos;

import entidades.cliente.Cliente;
import model.banda.BandaServico;
import model.cliente.ClienteServico;
import model.factory.LinhaFactory;
import model.linha.LinhaServico;
import model.linha.LinhaServicoInterface;

public class OperacionalServico implements OperacionalInterface{

	private LinhaServico servicoLinha;

	private BandaServico servicoBanda;

	private ClienteServico servicoCadastro;

	// Servi�o FullTest
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
		cliente = this.servicoLinha.consultar(cliente);

		this.servicoVoz = LinhaFactory.criarServico(cliente.getLinha().getTecnologia());

		cliente = this.servicoVoz.consultar(cliente);

		return cliente;
	}

}