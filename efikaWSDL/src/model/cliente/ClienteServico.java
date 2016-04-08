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
import entidades.cadastro.CadastroMetalico;
import entidades.cliente.Cliente;
import entidades.cliente.InventarioProdutos;
import entidades.cliente.produto.ProdutoBanda;
import entidades.cliente.produto.ProdutoLinha;
import entidades.cliente.produto.ProdutoTv;
import exception.ossturbonet.oss.gvt.com.DataNotFoundException;
import exception.ossturbonet.oss.gvt.com.OSSTurbonetException;
import model.factory.CadastroFactory;
import model.factory.LinhaFactory;
import model.modulos.OperacionalInterface;

public class ClienteServico implements OperacionalInterface{

	private InventoryImplProxy invService;

	private OSSTurbonetProxy osstbService;


	public ClienteServico() {
		this.invService = new InventoryImplProxy();
		this.osstbService = new OSSTurbonetProxy();
	}

	/**
	 * Método responsável por buscar o cadastro do cliente utilizando WebServices de IT
	 * Consultas:
	 *  - Produtos contratados (parcial);
	 *  - Designador;
	 *  - Designador de Acesso;
	 * @return Cliente
	 * @author G0042204
	 */
	public Cliente consultarCadastro(Cliente cliente) throws Exception{

		// Consulta Produtos Contratados
		InventarioProdutos inventario = this.getProdutosContratados(cliente.getInstancia());

		// Aciona método para obter designador
		String designador = this.getDesignatorByAccessDesignator(cliente.getInstancia()).trim();	

		// Consulta Designador de Acesso
		String designadorAcesso = this.getAccessDesignator(designador);

		// Sets
		cliente.setInventario(inventario);
		cliente.setDesignador(designador);
		cliente.setDesignadorAcesso(designadorAcesso);
		
		
		
		cliente.setCadastro(this.consultarCadastroTbs(cliente));
		
		return cliente;
	}
	
	/**
	 * Método realizada a tratativa de cadastro GPON/Metálico
	 * @param cliente
	 * @return
	 * @throws Exception
	 */
	public Cadastro consultarCadastroTbs(Cliente cliente) throws Exception{
		
		GetInfoOut info = this.getInfo(cliente);
		
		Cadastro preCad = CadastroFactory.criar(info.getTechnology());
		
		preCad.setCadastro(info);
		
		
		// Bloco especifico para GPON (consulta de Infos de OLT/ONT/Porta Lógica
		if (preCad instanceof CadastroGpon) {
			
			CadastroGpon cadastro = (CadastroGpon) preCad;
			cadastro.setCadastroGpon(this.getAccessInfo(cliente));			
			
			return cadastro;
		}
		
		return preCad;
	}



	/**
	 * Retorna Inventário de Produtos do cliente
	 * @param instancia
	 * @return
	 * @throws RemoteException
	 */
	public InventarioProdutos getProdutosContratados(String instancia) throws RemoteException{

		InventoryAccountResponse retorno = this.getAccountItems(instancia);

		return this.tratarProdutos(retorno);
	}

	/**
	 * Método resposável pelo tratamento do Retorno do servico getAccountItems
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

		throw new Exception("Não possui o produto contratado.");
	}


	/**
	 * Consulta do Webservice ao Inventário de Produtos do cliente
	 * @param designador
	 * @return
	 * @throws RemoteException
	 */
	public InventoryAccountResponse getAccountItems(String instancia) throws RemoteException{

		return this.invService.getAccountItems(null, null, instancia, null, true);
	}

	/**
	 * Função referente ao informações TBS - WiseTool
	 * Depende da consulta de produtos contratados - Informações do Cliente (Siebel 8) - Cliente Servico
	 * @param cliente
	 * @return GetInfoOut
	 * @throws DataNotFoundException
	 * @throws OSSTurbonetException
	 * @throws RemoteException
	 * @author G0042204
	 */
	public GetInfoOut getInfo(Cliente cliente) throws DataNotFoundException, OSSTurbonetException, RemoteException{
		return this.osstbService.getInfo(cliente.getDesignador(), this.getAccessDesignator(cliente.getDesignador()), "URA", "URA", cliente.getDesignador(), "URA", cliente.getInventario().getBanda().getDownloadCrm(), cliente.getInventario().getBanda().getUploadCrm());
	}
	
	/**
	 * Função referente ao informações GPON TBS - WiseTool
	 * Depende da consulta de produtos contratados - Informações do Cliente (Siebel 8) - Cliente Servico
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
	 * Função resposavel por resolver Instancia em Designador
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
