package controllers;


import java.io.IOException;

import entidades.linha.LinhaInterface;
import model.factory.LinhaFactory;
import model.linha.LinhaServico;

public class Teste {
	
	public static void main(String[] args) {
		
		LinhaServico service = new LinhaServico();

		try {
			
			String instancia = "4130222839";
			String equipamento = service.consultarNrEquipamento(instancia);
			
			String central = service.consultarCentral(equipamento);
			
			LinhaFactory fabrica = new LinhaFactory();
			
			LinhaInterface linha = fabrica.criar(central);

			
			
			System.out.println(equipamento);
			System.out.println(central);

			
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			
		

	}

}
