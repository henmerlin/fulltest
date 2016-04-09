package model;

import entidades.banda.parametros.TabelaParametrosGpon;
import model.banda.gpon.zhone.ZhoneServico;


public class TesteZhoneGpon {

	public static void main(String[] args) throws Exception {
		
		
		try {

			ZhoneServico gpon = new ZhoneServico();			
			TabelaParametrosGpon tabela = gpon.consultarTabelaParametros();					

			System.out.println("Sincronismo -> " + tabela.getSincronismoStatus());
			System.out.println("AdmStatus -> " + tabela.getPortaAdmStatus() + " (sera q e esse mesmo?)");
			System.out.println("Potencia ONT -> " + tabela.getPotenciaONT());			
			System.out.println("Potencia OLT -> " + tabela.getPotenciaOLT());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		
	}
}

