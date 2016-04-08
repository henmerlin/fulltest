package model;

import entidades.banda.parametros.TabelaParametrosGpon;
import model.banda.gpon.alcatel.AlcatelServico;


public class TesteAlcatel {

	public static void main(String[] args) throws Exception {
		
		
		try {
			
			AlcatelServico alcatel = new AlcatelServico();			
			TabelaParametrosGpon tabela = alcatel.consultarTabelaParametros();			

			System.out.println("Sinc Status -> " + tabela.getPortaAdmStatus());
			System.out.println("Profile -> " + tabela.getProfile());
			System.out.println("Potência OLT -> " + tabela.getPotenciaOLT());
			System.out.println("Potência ONT -> " + tabela.getPotenciaONT());
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		
	}
}

