package model.modulos;

import entidades.cliente.Cliente;
import entidades.linha.LinhaInterface;
import model.banda.BandaServico;
import model.cliente.ClienteServico;
import model.factory.LinhaFactory;
import model.linha.LinhaServico;
import model.linha.LinhaServicoInterface;

public class OperacionalServico {


	private LinhaServico servicoLinha;

	private BandaServico servicoBanda;

	private ClienteServico servicoCliente;

	// Serviço FullTest
	private LinhaServicoInterface servicoVoz;

	public OperacionalServico() {
		this.servicoLinha = new LinhaServico();
		this.servicoBanda = new BandaServico();
		this.servicoCliente = new ClienteServico();
	}


	public Cliente consultar(Cliente cliente) throws Exception{

		// Recupera instancia
		String instancia = cliente.getInstancia();

		// Aciona método para obter designador
		String designador = this.servicoBanda.getDesignatorByAccessDesignator(instancia);	

		// Consulta Designador de Acesso
		String designadorAcesso = this.servicoBanda.getAccessDesignator(designador);

		// Consulta Tipo de Central
		String central = this.servicoLinha.getCentral(instancia);

		// Sets
		cliente.setDesignador(designador);	
		cliente.setDesignadorAcesso(designadorAcesso);

		// Inicializa cria as Entidades e Servicos 
		this.servicoVoz = LinhaFactory.criarServico(central);
		
		LinhaInterface linha = this.servicoLinha.construirLinha(instancia);
		
		
		cliente.setLinha(linha);
		
		cliente.getLinha().setInstancia(instancia);

		cliente = this.servicoCliente.consultar(cliente);
		
		cliente.setLinha(this.servicoLinha.consultar(instancia));

		return cliente;
	}

}
