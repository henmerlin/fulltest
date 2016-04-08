package model.factory;

import entidades.banda.BandaInterface;
import entidades.credenciais.Credencial;

public class BandaFactory {


	private final static String ZHONE = "ZHONE";
	private final static String KEYMILE = "KEYMILE";


	public BandaFactory() {

	}
	
	public static BandaInterface criar(String modeloDslam){
		

		
		return null;
	}

	public Credencial createCredencial(String modeloDslam) throws Exception{

		if(modeloDslam.equalsIgnoreCase(BandaFactory.ZHONE)){
			return BandaFactory.zhoneCredencial();
		}else if (modeloDslam.equalsIgnoreCase(BandaFactory.KEYMILE)) {
			return BandaFactory.keymileCredencial();
		}else{
			throw new Exception("DSLAM não implementado.");
		}
	}


	/**
	 * Gera credencial Zhone
	 * @return Credencial
	 */
	public static Credencial zhoneCredencial(){

		Credencial credencial = new Credencial();

		credencial.setUser("admin");
		credencial.setPass("zhone");

		return credencial;
	}

	/**
	 * Gera credencial Keymile
	 * @return Credencial
	 */
	public static Credencial keymileCredencial(){

		Credencial credencial = new Credencial();

		credencial.setUser("manager");
		credencial.setPass("");

		return credencial;
	}
	
	/**
	 * Gera credencial Alcatel
	 * @return Credencial
	 */
	public static Credencial alcatelCredencial(){

		Credencial credencial = new Credencial();

		credencial.setUser("co");
		credencial.setPass("#operco33");

		return credencial;
	}

}