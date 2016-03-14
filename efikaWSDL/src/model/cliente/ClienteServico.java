package model.cliente;

import br.com.gvt.oss.inventory.service.impl.InventoryImplProxy;

public class ClienteServico {
	
	@SuppressWarnings("unused")
	private InventoryImplProxy invService;
	
	public ClienteServico() {
		this.invService = new InventoryImplProxy();
	}

}
