package model;

import entidades.banda.parametros.TabelaHistorico;
import entidades.banda.parametros.TabelaParametrosMetalico;
import entidades.cadastro.Cadastro;
import entidades.cadastro.CadastroMetalico;
import model.banda.metalico.keymile.SuadServico;

public class Teste {

	public static void main(String[] args) throws Exception {
		
		
		SuadServico suad = new SuadServico();	
		
		try {
			
			Cadastro cadastro = new CadastroMetalico();
			
			TabelaParametrosMetalico oi = suad.consultarTabelaParametros(cadastro);
			
			TabelaHistorico tabela = suad.consultarTabelaHistorico();
			
			System.out.println(tabela.getDias().get(0).getPcktsDown());
			System.out.println(oi.getPortaAdmStatus());
			
			suad.disconnect();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			


	}
}

