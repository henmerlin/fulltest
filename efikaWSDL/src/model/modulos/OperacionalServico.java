package model.modulos;

import entidades.cliente.Cliente;
import model.banda.BandaServico;
import model.banda.BandaServicoInterface;
import model.cliente.ClienteServico;
import model.factory.BandaFactory;
import model.factory.LinhaFactory;
import model.linha.LinhaServico;
import model.linha.LinhaServicoInterface;

public class OperacionalServico{
	
	private LinhaServico servicoLinha;

	private BandaServico servicoBanda;

	private ClienteServico servicoCadastro;

	// Servi�o FullTest
	private LinhaServicoInterface servicoVoz;

	private BandaServicoInterface servicoBandaEsp;

	public OperacionalServico() {
		this.servicoCadastro = new ClienteServico();
		this.servicoBanda = new BandaServico();
		this.servicoLinha = new LinhaServico();
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

		// Inicializa objetos v2
		cliente = this.initObjects_2(cliente);

		// Consulta Configura��es Linha
		cliente = this.servicoVoz.consultarConfiguracoes(cliente);

		// Repassa cadastro para atributo do ServicoBanda (diminui��o de depedencia)
		this.servicoBandaEsp.setCadastro(cliente.getCadastro());
			
		//this.servicoBandaEsp.connect();
		
		// Consultar Tabela de Par�metros (polimorfico)
		//cliente.getBanda().setParametros(this.servicoBandaEsp.consultarTabelaParametros());
		
		//this.servicoBandaEsp.disconnect();

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
	public Cliente realizarCorrecoesLinha(Cliente cliente) throws Exception{

		// Realiza as Corre��es			
		this.servicoVoz.realizarCorrecoes(cliente);

		return cliente;
	}
	
	
	public Cliente consultarCadastro(Cliente cliente) throws Exception{
		return this.servicoCadastro.consultarCadastro(cliente);
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

	public Cliente initObjects_2(Cliente cliente) throws Exception{

		// Constro� Objeto Banda de acordo com cadastro
		cliente.setBanda(this.servicoBanda.construirBanda(cliente.getCadastro()));

		this.servicoBandaEsp = BandaFactory.criarServico(cliente.getCadastro().getCadastro().getInfoTBS().getDslamVendor());

		return cliente;
	}
}