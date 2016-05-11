package model.modulos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entidades.cliente.Cliente;
import entidades.validacao.Resolucao;
import model.banda.BandaServico;
import model.banda.BandaServicoInterface;
import model.cliente.ClienteServico;
import model.factory.BandaFactory;
import model.factory.LinhaFactory;
import model.linha.LinhaServico;
import model.linha.LinhaServicoInterface;
import model.linha.MassivoLinhaInterface;

@Stateless
public class OperacionalServico{

	private Cliente cliente;

	private LinhaServico servicoLinha;

	private BandaServico servicoBanda;

	private ClienteServico servicoCadastro;

	// Serviço FullTest
	private LinhaServicoInterface servicoVoz;

	@SuppressWarnings("unused")
	private BandaServicoInterface servicoBandaEsp;
	
	@PersistenceContext(unitName="vu")  
	private EntityManager em;

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

		// Consulta Serviço Contratado
		try {
			
			//cliente.setInventario(this.servicoCadastro.consultarProdutos(cliente.getInstancia()));

			// Consultas de Cadastro
			try {
				cliente = this.servicoCadastro.consultarCadastro(cliente);	

				// Inicializa objetos
				cliente = this.initObjects(cliente);

				// Inicializa objetos v2
				//cliente = this.initObjects_2(cliente);

				// Consulta Configurações Linha
				cliente = this.servicoVoz.consultarConfiguracoes(cliente);

				// Repassa cadastro para atributo do ServicoBanda (diminuição de depedencia)
				//this.servicoBandaEsp.setCadastro(cliente.getCadastro());

				//this.servicoBandaEsp.connect();

				// Consultar Tabela de Parâmetros (polimorfico)
				//cliente.getBanda().setParametros(this.servicoBandaEsp.consultarTabelaParametros());

				//this.servicoBandaEsp.disconnect();

				// Sets nos erros de configuração encontrados
				// this.servicoVoz.validarConfiguracoes(cliente);


			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("Falha ao consultar cadastro!");			
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Falha ao consultar produtos contratados!");			
		}	

		return cliente;
	}
	
	public Resolucao validarRegistroCentral(Cliente cliente){
		return ((MassivoLinhaInterface) this.servicoVoz).validarRegistroCentral(cliente);
	}
	
	public Cliente consultarInstancia(String instancia) throws Exception{
			Cliente cliente = new Cliente();
			cliente.setInstancia(instancia);
			return this.consultar(cliente);
	}
	/**
	 * Correção do fluxo FullTest 2/X
	 * @param cliente
	 * @return
	 * @throws Exception
	 */
	public void realizarCorrecoesLinha(Cliente cliente) throws Exception{

		System.out.println(cliente.getDesignador());
		
		try {
			// Realiza as Correções			
			this.servicoVoz.realizarCorrecoes(cliente);
		} catch (Exception e) {
			throw new Exception("[Linha] Erro ao realizar correções lógicas.");
		}
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

		// Constroí Objeto Linha de acordo com cadastro
		cliente.setLinha(this.servicoLinha.construirLinha(cliente.getInstancia()));

		// Constroí serviços de acordo com cadastro
		this.servicoVoz = LinhaFactory.criarServico(cliente.getLinha().getTecnologia());

		return cliente;
	}

	public Cliente initObjects_2(Cliente cliente) throws Exception{

		// Constroí Objeto Banda de acordo com cadastro
		cliente.setBanda(this.servicoBanda.construirBanda(cliente.getCadastro()));
		this.servicoBandaEsp = BandaFactory.criarServico(cliente.getCadastro().getCadastro().getInfoTBS().getDslamVendor());

		return cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}