package controllers;

import java.rmi.RemoteException;

import model.linha.fulltest.LinhaService;

public class Teste {
	
	public static void main(String[] args) {
		
		
		
		
		LinhaService service = new LinhaService();
		
		try {
			String instancia = "4130222839";
			String oi = service.consultarCentral(instancia);
			System.out.println(oi);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
