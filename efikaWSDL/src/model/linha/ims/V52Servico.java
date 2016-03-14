package model.linha.ims;


import com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagementProxy;


import model.linha.LinhaServicoInterface;

public class V52Servico extends ImsServico implements LinhaServicoInterface {
	
	private ConfiguradorOnlineDeviceManagementProxy codService;
	
	public V52Servico() {
		this.codService = new ConfiguradorOnlineDeviceManagementProxy();
	}

}
