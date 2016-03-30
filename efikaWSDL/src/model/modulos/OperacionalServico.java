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

	// Servi�o FullTest
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
	
		// Consulta Configura��es
		cliente = this.servicoVoz.consultarConfiguracoes(cliente);
		
		cliente.getLinha().setConfigErrors(this.servicoVoz.validarConfiguracoes(cliente));
		
		this.servicoVoz.realizarCorrecoes(cliente);
		

		return cliente;
	}
	
	public Cliente initObjects(Cliente cliente) throws Exception{
		
		// Constro� Objeto Linha de acordo com cadastro
		cliente.setLinha(this.servicoLinha.construirLinha(cliente.getInstancia()));
		
		// Constro� servi�os de acordo com cadastro
		this.servicoVoz = LinhaFactory.criarServico(cliente.getLinha().getTecnologia());
		
		return cliente;
	}

}