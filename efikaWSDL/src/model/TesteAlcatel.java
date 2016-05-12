package model;

import entidades.cliente.Cliente;
import model.modulos.OperacionalServico;

public class TesteAlcatel {

	public static void main(String[] args) throws Exception {

		try {

			OperacionalServico ft = new OperacionalServico();
			
			Cliente cliente = ft.consultarInstancia("4133280564");
			System.out.println(ft.validarConectividade(cliente).getNome());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}
}

