package model;

import java.util.List;

import entidades.banda.parametros.DiaTabelaHistorico;
import entidades.banda.parametros.TabelaHistorico;
import model.banda.metalico.keymile.SuvdServico;


public class Teste {

	public static void main(String[] args) throws Exception {



		try {

			SuvdServico suvd = new SuvdServico();

			TabelaHistorico tabela1 = suvd.consultarTabelaHistorico();
			
			List<DiaTabelaHistorico> dias = tabela1.getDias();
			
			for (DiaTabelaHistorico diaTabelaHistorico : dias) {
				System.out.println(diaTabelaHistorico.getResync());
			}
			
		
			//TabelaParametrosMetalico tabela = (TabelaParametrosMetalico) tabela1;

//			System.out.println(" ");
//			System.out.println("SUVD");
//			System.out.println(" ");
//
//			System.out.println("Adm Status -> " + tabela.getPortaAdmStatus());
//			System.out.println("Sinc Status -> " + tabela.getSincronismoStatus());
//			System.out.println("Modulação -> " + tabela.getModulacao());
//			System.out.println("Perfil -> " + tabela.getProfile());
//			System.out.println("Vel. Download -> " + tabela.getDownload());
//			System.out.println("Vel. Upload -> " + tabela.getUpload());
//			System.out.println("SnrDown -> " + tabela.getSnrDown());
//			System.out.println("SnrUp -> " + tabela.getSnrUp());
//			System.out.println("AtnDown -> " + tabela.getAtnDown());
//			System.out.println("AtnUp -> " + tabela.getAtnUp());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}




	}
}

