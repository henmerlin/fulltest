package model;

import entidades.cliente.Cliente;
import model.modulos.OperacionalServico;

public class TesteAlcatel {

	public static void main(String[] args) throws Exception {

		try {

			OperacionalServico ft = new OperacionalServico();
			
			Cliente cliente = ft.consultarInstancia("7130436364");
			System.out.println(ft.validarConectividade(cliente).getId());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}
}

