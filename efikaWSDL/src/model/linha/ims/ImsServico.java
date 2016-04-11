package model.linha.ims;


import java.rmi.RemoteException;

import br.com.gvt.www.oss.necservice.ConsultElement;
import entidades.linha.LinhaInterface;
import entidades.parametros.Parametro;
import model.linha.LinhaServico;

public class ImsServico extends LinhaServico{
	

	public ImsServico() {

	}
	
	public Parametro consultarRegistroCentral(String instancia, LinhaInterface linha) throws RemoteException{

		String reg = null;
		
		for (ConsultElement consultElement : super.consultarElemento(instancia, linha)) {
			
			String init = "<IMSUSERST>";
			String finit = "</IMSUSERST>";
			
			int inicio = consultElement.getElementAnswer().indexOf(init);
			int fim = consultElement.getElementAnswer().indexOf(finit);
			
			reg = (String) consultElement.getElementAnswer().subSequence(inicio + init.length(), fim);
			
			break;
		}
		
		return new Parametro("Registro IMS", resolverStatusRegCentral(reg));
	}
	
	public static String resolverStatusRegCentral(String string){
		
		if (string.equalsIgnoreCase("1")) {
			return "Registrado";
		}else if (string.equalsIgnoreCase("0")) {
			return "Não registrado";
		}else{
			return "Perdeu o registro recentemente";
		}
	}
	
}
