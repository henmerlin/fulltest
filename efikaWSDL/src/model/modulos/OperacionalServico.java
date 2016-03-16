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

	// Serviço FullTest
	@SuppressWarnings("unused")
	private LinhaServicoInterface servicoVoz;

	public OperacionalServico() {
		this.servicoLinha = new LinhaServico();
		this.servicoBanda = new BandaServico();
		this.servicoCadastro = new ClienteServico();
	}


	public Cliente consultar(Cliente cliente) throws Exception{
 
		// Recupera instancia
		String instancia = cliente.getInstancia();
		
		cliente = this.servicoCadastro.consultar(cliente);
		
		// Consulta Tipo de Central
		String central = this.servicoLinha.getCentral(instancia);

		// Inicializa cria as Entidades e Servicos 
		this.servicoVoz = LinhaFactory.criarServico(central);
				

		cliente = this.servicoVoz.consultar(cliente);
		

		return cliente;
	}

}