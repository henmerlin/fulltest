package model;

import entidades.cliente.Cliente;
import model.modulos.OperacionalServico;

public class Teste {

	public static void main(String[] args) throws Exception {
		
		
		
		
		try {
			
		
			OperacionalServico fulltest = new OperacionalServico();
			
			Cliente cliente = new Cliente();
			
			cliente.setInstancia("1630105408");
			
			fulltest.consultar(cliente);
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			


	}
}

