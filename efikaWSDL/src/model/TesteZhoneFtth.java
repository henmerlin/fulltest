package model;

import entidades.banda.parametros.TabelaParametrosMetalico;
import entidades.cadastro.Cadastro;
import entidades.cadastro.CadastroMetalico;
import model.banda.metalico.zhone.EfmServico;


public class TesteZhoneFtth {

	public static void main(String[] args) throws Exception {
		
		
		try {
			
			Cadastro metalico = new CadastroMetalico();
			
			EfmServico ftth = new EfmServico();
			TabelaParametrosMetalico tabela = (TabelaParametrosMetalico) ftth.consultarTabelaParametros(metalico);			
			
			System.out.println("Adm Status -> " + tabela.getPortaAdmStatus());
			System.out.println("Sinc Status -> " + tabela.getSincronismoStatus());
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

