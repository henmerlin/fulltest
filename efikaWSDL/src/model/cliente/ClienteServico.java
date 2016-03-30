package model.cliente;

import java.rmi.RemoteException;

import com.gvt.www.ws.eai.oss.inventory.api.Account;
import com.gvt.www.ws.eai.oss.inventory.api.Address;
import com.gvt.www.ws.eai.oss.inventory.api.InventoryAccountResponse;
import com.gvt.www.ws.eai.oss.inventory.api.Item;
import com.gvt.www.ws.eai.oss.inventory.api.Param;
import com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetProxy;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import br.com.gvt.oss.inventory.service.impl.InventoryImplProxy;
import entidades.cliente.Cliente;
import entidades.cliente.InventarioProdutos;
import entidades.cliente.produto.ProdutoBanda;
import entidades.cliente.produto.ProdutoLinha;
import entidades.cliente.produto.ProdutoTv;
import exception.ossturbonet.oss.gvt.com.DataNotFoundException;
import exception.ossturbonet.oss.gvt.com.OSSTurbonetException;
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
	public Cliente consultarCadastro(Cliente cliente) throws RemoteException{
		
		// Consulta Produtos Contratados
		InventarioProdutos inventario = this.getProdutosContratados(cliente.getInstancia());
		
		// Aciona método para obter designador
		String designador = this.getDesignatorByAccessDesignator(cliente.getInstancia()).trim();	

		// Consulta Designador de Acesso
		String designadorAcesso = this.getAccessDesignator(designador);
		
		cliente.setInventario(inventario);
		cliente.setDesignador(designador);
		cliente.setDesignadorAcesso(designadorAcesso);

		return cliente;
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
		
		ProdutoLinha linha = new ProdutoLinha();
		ProdutoBanda banda = new ProdutoBanda();
		ProdutoTv tv = new ProdutoTv();
		
		for (Address address : listaProdutos) {
			
			Item[] itens = address.getItems();
			
			for (Item itemExterno : itens) {
				Item[] itensInternos = itemExterno.getItems();

				for (Item item : itensInternos) {

					Param[] parametros = item.getParam();

					for (Param param : parametros) {

						String upString = "Upstream";
						String downString = "Downstream";
						String tecnologiaTV = "TecnologiaTV";
						String tecnologiaVoz = "TecnologiaVoz";

						// Tecnologia Voz
						if (param.getName().equalsIgnoreCase(tecnologiaVoz)) {
							linha.setTecnologia(param.getValue());
						}							
														
						// Tecnologia Tv
						if (param.getName().equalsIgnoreCase(tecnologiaTV)) {
							tv.setTipo(param.getValue());
						}							
						
						// Velocidade Downstream
						if (param.getName().equalsIgnoreCase(downString)) {
							banda.setDownloadCrm(param.getValue());
						}	
						
						// Velocidade Upstream
						if (param.getName().equalsIgnoreCase(upString)) {
							banda.setUploadCrm(param.getValue());
						}					
					}
				}
			}
		}
		
		produtos.setBanda(banda);
	
		return produtos;
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
