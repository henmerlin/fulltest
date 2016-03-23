package model.linha.ims;



import com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagementProxy;
import entidades.cliente.Cliente;
import model.linha.LinhaServicoInterface;

public class V52Servico extends ImsServico implements LinhaServicoInterface {
	
	private ConfiguradorOnlineDeviceManagementProxy codService;
	
	public V52Servico() {
		this.codService = new ConfiguradorOnlineDeviceManagementProxy();
	}

	@Override
	public Cliente consultarConfiguracoes(Cliente cliente) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
