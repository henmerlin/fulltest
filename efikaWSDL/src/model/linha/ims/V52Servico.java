package model.linha.ims;


import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagementProxy;

import entidades.cliente.Cliente;
import entidades.parametros.Configuracao;
import model.linha.LinhaServicoInterface;

public class V52Servico extends ImsServico implements LinhaServicoInterface {
	
	private ConfiguradorOnlineDeviceManagementProxy codService;
	
	public V52Servico() {
		this.codService = new ConfiguradorOnlineDeviceManagementProxy();
	}

	@Override
	public Cliente getConfiguracao(Cliente cliente) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}



}
