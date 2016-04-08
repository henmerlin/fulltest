package model;

import entidades.banda.parametros.TabelaParametrosGpon;
import model.banda.gpon.zhone.ZhoneServico;


public class TesteZhoneGpon {

	public static void main(String[] args) throws Exception {
		
		
		try {
			
			ZhoneServico gpon = new ZhoneServico();			
			TabelaParametrosGpon tabela = gpon.consultarTabelaParametros();					


			
//			System.out.println("Adm Status -> " + tabela.getPortaAdmStatus());
//			System.out.println("Sinc Status -> " + tabela.getSincronismoStatus());
//			System.out.println("Modulação -> " + tabela.getModulacao());
//			System.out.println("Perfil -> " + tabela.getProfile());
//			System.out.println("Vel. Download -> " + tabela.getDownload());
//			System.out.println("Vel. Upload -> " + tabela.getUpload());
//			System.out.println("SnrDown  -> " + tabela.getSnrDown());
//			System.out.println("SnrUp -> " + tabela.getSnrUp());
//			System.out.println("AtnDown  -> " + tabela.getAtnDown());
//			System.out.println("AtnUp -> " + tabela.getAtnUp());
			
						

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		
	}
}

