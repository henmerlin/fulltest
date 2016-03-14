package model.cliente;

import java.rmi.RemoteException;

import com.gvt.www.ws.eai.oss.inventory.api.Account;
import com.gvt.www.ws.eai.oss.inventory.api.Address;
import com.gvt.www.ws.eai.oss.inventory.api.InventoryAccountResponse;
import com.gvt.www.ws.eai.oss.inventory.api.Item;
import com.gvt.www.ws.eai.oss.inventory.api.Param;

import br.com.gvt.oss.inventory.service.impl.InventoryImplProxy;
import entidades.cliente.Cliente;

public class ClienteServico {

	private InventoryImplProxy invService;

	public ClienteServico() {
		this.invService = new InventoryImplProxy();
	}

	public Cliente consultar(Cliente cliente) throws RemoteException{

		InventoryAccountResponse inventario = this.getAccountItems(cliente.getInstancia());

		return cliente =  this.tratarProdutos(cliente, inventario);
	}
	
	/**
	 * Método resposável pelo tratamento do Retorno do servico getAccountItems
	 * @param cliente
	 * @param inventario
	 * @author G0042204
	 * @return
	 */
	public Cliente tratarProdutos(Cliente cliente, InventoryAccountResponse inventario){

		Account account = inventario.getAccounts(0);

		Address[] listaProdutos = account.getAddress();

		for (Address address : listaProdutos) {

			Item[] itens = address.getItems();

			for (Item itemExterno : itens) {

				Item[] itensInternos = itemExterno.getItems();

				for (Item item : itensInternos) {
					
					Param[] parametros = item.getParam();

					for (Param param : parametros) {

						String upString = "Upstream";
						String downString = "Downstream";
						
						// Velocidade Downstream
						if (param.getName().equalsIgnoreCase(downString)) {
							cliente.setDownloadCrm(param.getValue());
						}	
						
						// Velocidade Upstream
						if (param.getName().equalsIgnoreCase(upString)) {
							cliente.setUploadCrm(param.getValue());
						}	
					}

				}
			}
		}

		return cliente;
	}


	public InventoryAccountResponse getAccountItems(String designador) throws RemoteException{

		return this.invService.getAccountItems(null, null, designador, null, false);
	}
}
