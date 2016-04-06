package model;

import entidades.banda.parametros.TabelaParametrosInter;
import entidades.banda.parametros.TabelaParametrosMetalico;
import model.banda.metalico.keymile.SuvdServico;


public class Teste {

	public static void main(String[] args) throws Exception {



		try {

			SuvdServico suvd = new SuvdServico();

			TabelaParametrosInter tabela1 = suvd.consultarTabelaParametros();
		
			TabelaParametrosMetalico tabela = (TabelaParametrosMetalico) tabela1;

			System.out.println(" ");
			System.out.println("SUAD");
			System.out.println(" ");

			System.out.println("Adm Status -> " + tabela.getPortaAdmStatus());
			System.out.println("Sinc Status -> " + tabela.getSincronismoStatus());
			System.out.println("Modulação -> " + tabela.getModulacao());
			System.out.println("Perfil -> " + tabela.getProfile());
			System.out.println("Vel. Download -> " + tabela.getDownload());
			System.out.println("Vel. Upload -> " + tabela.getUpload());
			System.out.println("SnrDown -> " + tabela.getSnrDown());
			System.out.println("SnrUp -> " + tabela.getSnrUp());
			System.out.println("AtnDown -> " + tabela.getAtnDown());
			System.out.println("AtnUp -> " + tabela.getAtnUp());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}




	}
}

