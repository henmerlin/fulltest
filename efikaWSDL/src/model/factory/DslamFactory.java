package model.factory;

import entidades.credenciais.Credencial;

public class DslamFactory {


	private final static String ZHONE = "ZHONE";
	private final static String KEYMILE = "KEYMILE";


	public DslamFactory() {

	}

	public Credencial createCredencial(String dslam) throws Exception{

		if(dslam.equalsIgnoreCase(DslamFactory.ZHONE)){
			return this.zhoneCredencial();
		}else if (dslam.equalsIgnoreCase(DslamFactory.KEYMILE)) {
			return this.keymileCredencial();
		}else{
			throw new Exception("DSLAM não implementado.");
		}
	}


	/**
	 * Gera credencial Zhone
	 * @return Credencial
	 */
	public Credencial zhoneCredencial(){

		Credencial credencial = new Credencial();

		credencial.setUser("admin");
		credencial.setPass("zhone");

		return credencial;
	}

	/**
	 * Gera credencial Keymile
	 * @return Credencial
	 */
	public Credencial keymileCredencial(){

		Credencial credencial = new Credencial();

		credencial.setUser("manager");
		credencial.setPass("");

		return credencial;
	}

}