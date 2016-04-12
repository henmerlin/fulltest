package model;

import entidades.cadastro.Cadastro;
import entidades.cadastro.CadastroMetalico;
import model.banda.metalico.keymile.SuadServico;

public class Teste {

	public static void main(String[] args) throws Exception {
		
		
		SuadServico suad = new SuadServico();	
			
		Cadastro cadastro = new CadastroMetalico();
		
		suad.consultarBridges(cadastro);


	}
}

