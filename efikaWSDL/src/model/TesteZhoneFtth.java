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
						

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		
	}
}

