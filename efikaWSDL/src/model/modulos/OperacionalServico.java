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

		this.servicoCadastro = new ClienteServico();

		this.servicoLinha = new LinhaServico();
		
		//this.servicoBanda = new BandaServico();
	}

	/**
	 * Inicio fluxo FullTest 1/X
	 * @param cliente
	 * @return
	 * @throws Exception
	 */
	public Cliente consultar(Cliente cliente) throws Exception{

		// Inicializa objetos
		cliente = this.initObjects(cliente);

		// Consultas de Cadastro
		cliente = this.servicoCadastro.consultarCadastro(cliente);	

		// Consulta Configura��es
		cliente = this.servicoVoz.consultarConfiguracoes(cliente);

		// Sets nos erros de configura��o encontrados
		cliente.getLinha().setConfigErrors(this.servicoVoz.validarConfiguracoes(cliente));

		return cliente;
	}

	/**
	 * Corre��o do fluxo FullTest 2/X
	 * @param cliente
	 * @return
	 * @throws Exception
	 */
	public Cliente realizarCorrecoes(Cliente cliente) throws Exception{

		// Realiza as Corre��es
		this.servicoVoz.realizarCorrecoes(cliente);

		return cliente;
	}


	/**
	 * Prepara Objetos de acordo com o cadastro e produto contratado
	 * @param cliente
	 * @return
	 * @throws Exception
	 */
	public Cliente initObjects(Cliente cliente) throws Exception{

		// Constro� Objeto Linha de acordo com cadastro
		cliente.setLinha(this.servicoLinha.construirLinha(cliente.getInstancia()));

		// Constro� servi�os de acordo com cadastro
		this.servicoVoz = LinhaFactory.criarServico(cliente.getLinha().getTecnologia());

		return cliente;
	}

}