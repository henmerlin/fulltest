package model.factory;

import entidades.cadastro.Cadastro;
import entidades.cadastro.CadastroGpon;
import entidades.cadastro.CadastroMetalico;

public class CadastroFactory {


	private final static String GPON = "GPON";
	private final static String ADSL = "ADSL";
	private final static String DSL = "DSL";

	public CadastroFactory() {

	}
	
	public static Cadastro criar(String technology) throws Exception{
		
		if(technology.equalsIgnoreCase(CadastroFactory.GPON)){
			return new CadastroGpon();
		}else if (technology.equalsIgnoreCase(CadastroFactory.ADSL)) {
			return new CadastroMetalico();
		}else if (technology.equalsIgnoreCase(CadastroFactory.DSL)) {
			return new CadastroMetalico();
		}else{
			return new CadastroMetalico();
		}
	}

}