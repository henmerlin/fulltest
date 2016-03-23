package model.linha.ims;


import java.rmi.RemoteException;

import br.com.gvt.www.oss.necservice.ConsultElement;
import entidades.linha.LinhaInterface;
import model.linha.LinhaServico;

public class ImsServico extends LinhaServico{
	

	public ImsServico() {

	}
	
	public CharSequence consultarRegistroCentral(String instancia, LinhaInterface linha) throws RemoteException{

		CharSequence sipState = null;
		
		for (ConsultElement consultElement : super.consultarElemento(instancia, linha)) {
			
			String init = "<IMSUSERST>";
			String finit = "</IMSUSERST>";
			
			int inicio = consultElement.getElementAnswer().indexOf(init);
			int fim = consultElement.getElementAnswer().indexOf(finit);
			
			sipState = consultElement.getElementAnswer().subSequence(inicio + init.length(), fim);
			
			break;
		}
		
		return sipState;
	}
	
}
