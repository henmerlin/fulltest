package model.linha;


import java.rmi.RemoteException;

import com.gvt.www.uraservices.GetSwitchInfoOut;
import com.gvt.www.uraservices.UraServicesProxy;


public class LinhaServico {
	
	private UraServicesProxy uraservice;

	public LinhaServico() {
		this.uraservice = new UraServicesProxy();
	}

	public UraServicesProxy getUraservice() {
		return uraservice;
	}

	public void setUraservice(UraServicesProxy uraservice) {
		this.uraservice = uraservice;
	}
	
	public GetSwitchInfoOut consultarCentral(String instancia) throws RemoteException{
		
		return uraservice.getInfoSwitch(instancia);
	}
	
}
