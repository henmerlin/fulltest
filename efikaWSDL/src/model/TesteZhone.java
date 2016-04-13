package model;

import entidades.banda.parametros.TabelaParametrosMetalico;
import entidades.cadastro.Cadastro;
import entidades.cadastro.CadastroMetalico;
import model.banda.metalico.zhone.ComboServico;


public class TesteZhone {

	public static void main(String[] args) throws Exception {
		
		ComboServico combo = new ComboServico();
		
		try {
			Cadastro metalico = new CadastroMetalico();
					
			//TabelaParametrosMetalico tabela = combo.consultarTabelaParametros(metalico);			
			
			combo.consultarBridges(metalico);
			
			combo.disconnect();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		
	}
}

