package model.modulos;

import entidades.cliente.Cliente;
import model.cliente.ClienteServico;
import model.factory.LinhaFactory;
import model.linha.LinhaServico;
import model.linha.LinhaServicoInterface;

public class OperacionalServico implements OperacionalInterface{

	private LinhaServico servicoLinha;

	//private BandaServico servicoBanda;

	private ClienteServico servicoCadastro;

	// Serviço FullTest
	private LinhaServicoInterface servicoVoz;

	public OperacionalServico() {
		this.servicoLinha = new LinhaServico();
		//this.servicoBanda = new BandaServico();
		this.servicoCadastro = new ClienteServico();
	}

	/**
	 * Inicio do FullTest
	 */
	public Cliente consultar(Cliente cliente) throws Exception{
		
		// Inicializa objetos
		cliente = this.initObjects(cliente);
		
		// Consultas de Cadastro
		cliente = this.servicoCadastro.consultarCadastro(cliente);	
	
		// Consulta Configurações
		cliente = this.servicoVoz.consultarConfiguracoes(cliente);
		
		cliente.getLinha().setConfigErrors(this.servicoVoz.validarConfiguracoes(cliente));

		return cliente;
	}
	
	public Cliente initObjects(Cliente cliente) throws Exception{
		
		// Constroí Objeto Linha de acordo com cadastro
		cliente.setLinha(this.servicoLinha.construirLinha(cliente.getInstancia()));
		
		// Constroí serviços de acordo com cadastro
		this.servicoVoz = LinhaFactory.criarServico(cliente.getLinha().getTecnologia());
		
		return cliente;
	}

}