package model.cliente;

import java.rmi.RemoteException;

import com.gvt.www.ws.eai.oss.inventory.api.Account;
import com.gvt.www.ws.eai.oss.inventory.api.Address;
import com.gvt.www.ws.eai.oss.inventory.api.InventoryAccountResponse;
import com.gvt.www.ws.eai.oss.inventory.api.Item;
import com.gvt.www.ws.eai.oss.inventory.api.Param;
import com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetProxy;

import bean.ossturbonet.oss.gvt.com.AccessInfo;
import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import br.com.gvt.oss.inventory.service.impl.InventoryImplProxy;
import entidades.cadastro.Cadastro;
import entidades.cadastro.CadastroGpon;
import entidades.cliente.Cliente;
import entidades.cliente.InventarioProdutos;
import entidades.cliente.produto.ProdutoBanda;
import entidades.cliente.produto.ProdutoLinha;
import entidades.cliente.produto.ProdutoTv;
import exception.ossturbonet.oss.gvt.com.DataNotFoundException;
import exception.ossturbonet.oss.gvt.com.OSSTurbonetException;
import model.factory.CadastroFactory;

public class ClienteServico{

	private InventoryImplProxy invService;

	private OSSTurbonetProxy osstbService;


	public ClienteServico() {
		this.invService = new InventoryImplProxy();
		this.osstbService = new OSSTurbonetProxy();
	}

	/**
	 * M�todo respons�vel por buscar o cadastro do cliente utilizando WebServices de IT
	 * Consultas:
	 *  - Designador;
	 *  - Designador de Acesso;
	 * @return Cliente
	 * @author G0042204
	 * @throws RemoteException 
	 * @throws OSSTurbonetException 
	 * @throws DataNotFoundException 
	 * @throws Exception 
	 */
	public Cliente consultarCadastro(Cliente cliente) throws DataNotFoundException, OSSTurbonetException, RemoteException{

		// Aciona m�todo para obter designador
		String designador = this.getDesignatorByAccessDesignator(cliente.getInstancia()).trim();	

		// Consulta Designador de Acesso
		String designadorAcesso = this.getAccessDesignator(designador);

		// Sets
		cliente.setDesignador(designador);
		cliente.setDesignadorAcesso(designadorAcesso);
		//cliente.setCadastro(this.consultarCadastroTbs(cliente));

		return cliente;
	}

	public InventarioProdutos consultarProdutos(String instancia) throws RemoteException{

		return  this.getProdutosContratados(instancia);
	}

	/**
	 * M�todo realiza tratativa de cadastro GPON/Met�lico
	 * @param cliente
	 * @return 
	 * @return
	 * @throws Exception
	 */
	public Cadastro consultarCadastroTbs(Cliente cliente) throws Exception{

		GetInfoOut info = this.getInfo(cliente);

		Cadastro preCad = CadastroFactory.criar(info.getTechnology());

		preCad.setCadastro(info);

		// Bloco especifico para GPON (consulta de Infos de OLT/ONT/Porta L�gica
		if (preCad instanceof CadastroGpon) {
			CadastroGpon cadastro = (CadastroGpon) preCad;
			cadastro.setCadastroGpon(this.getAccessInfo(cliente));			
			return cadastro;
		}

		return preCad;
	}

	/**
	 * Retorna Invent�rio de Produtos do cliente
	 * @param instancia
	 * @return
	 * @throws RemoteException
	 */
	public InventarioProdutos getProdutosContratados(String instancia) throws RemoteException{

		InventoryAccountResponse retorno = this.getAccountItems(instancia);

		return this.tratarProdutos(retorno);
	}

	/**
	 * M�todo respos�vel pelo tratamento do Retorno do servico getAccountItems
	 * @param cliente
	 * @param inventario
	 * @author G0042204
	 * @return
	 */
	public InventarioProdutos tratarProdutos(InventoryAccountResponse inventario){

		Account account = inventario.getAccounts(0);

		Address[] listaProdutos = account.getAddress();

		InventarioProdutos produtos = new InventarioProdutos();

		for (Address address : listaProdutos) {

			Item[] itens = address.getItems();

			for (Item itemExterno : itens) {
				Item[] itensInternos = itemExterno.getItems();

				for (Item item : itensInternos) {

					Param[] parametros = item.getParam();

					try {
						ProdutoLinha linha = new ProdutoLinha();
						linha.setTecnologia(this.tratamentoProdutosParam(parametros, "TecnologiaVoz"));
						produtos.setLinha(linha);
					} catch (Exception e) {
						produtos.setLinha(null);
					}

					try {
						ProdutoBanda banda = new ProdutoBanda();
						banda.setDownloadCrm(this.tratamentoProdutosParam(parametros, "Downstream"));
						banda.setUploadCrm(this.tratamentoProdutosParam(parametros, "Upstream"));
						produtos.setBanda(banda);
					} catch (Exception e) {
						produtos.setBanda(null);
					}				

					try {
						ProdutoTv tv = new ProdutoTv();
						tv.setTipo(this.tratamentoProdutosParam(parametros, "TecnologiaTV"));
						produtos.setTv(tv);
					} catch (Exception e) {
						produtos.setTv(null);
					}						

				}
			}
		}

		return produtos;
	}

	public String tratamentoProdutosParam(Param[] parametros, String stringServico) throws Exception{

		for (Param param : parametros) {
			if (param.getName().equalsIgnoreCase(stringServico)) {
				return param.getValue();
			}	
		}

		throw new Exception("N�o possui o produto contratado.");
	}


	/**
	 * Consulta do Webservice ao Invent�rio de Produtos do cliente
	 * @param designador
	 * @return
	 * @throws RemoteException
	 */
	public InventoryAccountResponse getAccountItems(String instancia) throws RemoteException{

		return this.invService.getAccountItems(null, null, instancia, null, true);
	}

	/**
	 * Fun��o referente ao informa��es TBS - WiseTool
	 * Depende da consulta de produtos contratados - Informa��es do Cliente (Siebel 8) - Cliente Servico
	 * @param cliente
	 * @return GetInfoOut
	 * @throws DataNotFoundException
	 * @throws OSSTurbonetException
	 * @throws RemoteException
	 * @author G0042204
	 */
	public GetInfoOut getInfo(Cliente cliente) throws DataNotFoundException, OSSTurbonetException, RemoteException{
		return this.osstbService.getInfo(cliente.getDesignador(), cliente.getDesignadorAcesso(), "wise", "wise", cliente.getInstancia(), "wise", "0", "0");
	}

	/**
	 * Fun��o referente ao informa��es GPON TBS - WiseTool
	 * Depende da consulta de produtos contratados - Informa��es do Cliente (Siebel 8) - Cliente Servico
	 * @param cliente
	 * @return GetInfoOut
	 * @throws DataNotFoundException
	 * @throws OSSTurbonetException
	 * @throws RemoteException
	 * @author G0042204
	 */
	public AccessInfo getAccessInfo(Cliente cliente) throws DataNotFoundException, OSSTurbonetException, RemoteException{
		return this.osstbService.getAccessInfo(cliente.getDesignadorAcesso(), cliente.getDesignador(), "0");
	}

	/**
	 * Utiliza OSSTurbonetProxy metodo getAccessDesignator
	 * para obter designador de acesso 
	 * @param designador
	 * @return
	 * @throws DataNotFoundException
	 * @throws OSSTurbonetException
	 * @throws RemoteException
	 */
	public String getAccessDesignator(String designador) throws DataNotFoundException, OSSTurbonetException, RemoteException{
		return this.osstbService.getAccessDesignator(designador);
	}

	/**
	 * Fun��o resposavel por resolver Instancia em Designador
	 * @param instancia
	 * @return
	 * @throws DataNotFoundException
	 * @throws OSSTurbonetException
	 * @throws RemoteException
	 * @author G0042204
	 */
	public String getDesignatorByAccessDesignator(String instancia) throws DataNotFoundException, OSSTurbonetException, RemoteException{

		return this.osstbService.getDesignatorByAccessDesignator(instancia);
	}
}
