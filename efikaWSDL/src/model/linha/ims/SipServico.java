package model.linha.ims;

import java.rmi.RemoteException;

import com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagementProxy;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPIn;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPOut;

import model.linha.LinhaServicoInterface;

public class SipServico extends ImsServico implements LinhaServicoInterface {
	
	private ConfiguradorOnlineDeviceManagementProxy codService;
	
	public SipServico() {
		this.codService = new ConfiguradorOnlineDeviceManagementProxy();
	}
	
	public DiagnosticoSIPOut executarDiagnosticoSIP() throws RemoteException {
		
		DiagnosticoSIPIn in = new DiagnosticoSIPIn();
		
		return this.codService.executarDiagnosticoSIP(in);
	}

}
