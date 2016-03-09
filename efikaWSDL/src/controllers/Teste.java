package controllers;


import java.io.IOException;

import model.linha.fulltest.LinhaService;

public class Teste {
	
	public static void main(String[] args) {
		
		LinhaService service = new LinhaService();

		try {
			
			String instancia = "4130222839";
			String equipamento = service.consultarNrEquipamento(instancia);
			
			System.out.println(equipamento);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			
		

	}

}
