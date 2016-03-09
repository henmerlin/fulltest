package model.linha.fulltest;

import java.rmi.RemoteException;

import com.gvt.www.uraservices.GetSwitchInfoOut;
import com.gvt.www.uraservices.UraServicesProxy;

public class LinhaService{
	
	private UraServicesProxy uraService;
	
	public LinhaService() {
		this.uraService = new UraServicesProxy();
	}
	
	public String consultarCentral(String instancia) throws RemoteException {
				
		GetSwitchInfoOut oi = uraService.getInfoSwitch(instancia);
		return oi.getResultMessage();
	}
	
}	
