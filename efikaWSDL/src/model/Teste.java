package model;

import entidades.cliente.Cliente;
import model.modulos.OperacionalServico;

public class Teste {
		
	public static void main(String[] args) {

		OperacionalServico fullteste = new OperacionalServico();
		
		try {
			Cliente oi = fullteste.consultarInstancia("4130222839");
			
			System.out.println(oi.getLinha().getInfoInstancia().getOperadora());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
