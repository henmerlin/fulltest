package model.factory;

import entidades.cadastro.Cadastro;
import entidades.cadastro.CadastroGpon;

public class CadastroFactory {


	private final static String GPON_CARD8 = "GPON_CARD8";

	public CadastroFactory() {

	}
	
	public static Cadastro criar(String dslamVendor) throws Exception{
		
		if(dslamVendor.equalsIgnoreCase(CadastroFactory.GPON_CARD8)){
			return new CadastroGpon();
		}else{
			throw new Exception("DSLAM não implementado.");
		}
	}

}