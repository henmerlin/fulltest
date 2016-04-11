package model.factory;

import entidades.banda.BandaInterface;
import entidades.banda.gpon.alcatel.Alcatel;
import entidades.banda.gpon.zhone.Zhone;
import entidades.banda.metalico.keymile.Suad;
import entidades.banda.metalico.keymile.Suvd;
import entidades.credenciais.Credencial;
import model.banda.BandaServicoInterface;
import model.banda.gpon.alcatel.AlcatelServico;
import model.banda.gpon.zhone.ZhoneServico;
import model.banda.metalico.keymile.SuadServico;
import model.banda.metalico.keymile.SuvdServico;

public class BandaFactory {

	// Keymile


	// Metalico
	// Suad
	private final static String SUAD1 = "SUAD1";
	private final static String SUAD3 = "SUAD3";

	//Suvd
	private final static String SUVD3 = "SUVD3";
	private final static String SUVD11 = "SUVD11";


	// Zhone
	// GPON
	private final static String GPON_CARD8 = "GPON_CARD8";

	
	// Alcatel
	// GPON
	private final static String GPON_CARD = "GPON_CARD";

	public BandaFactory() {

	}

	public static BandaInterface criar(String modeloDslam) throws Exception{

		if(
				modeloDslam.equalsIgnoreCase(BandaFactory.SUAD1) || 
				modeloDslam.equalsIgnoreCase(BandaFactory.SUAD3)
				){
			return new Suad();
		}else if (
				modeloDslam.equalsIgnoreCase(BandaFactory.GPON_CARD8) ||
				modeloDslam.equalsIgnoreCase(BandaFactory.GPON_CARD8)
				){
			return new Zhone();
		}else if (
				modeloDslam.equalsIgnoreCase(BandaFactory.GPON_CARD) ||
				modeloDslam.equalsIgnoreCase(BandaFactory.GPON_CARD)
				){
			return new Alcatel();
		}else if (
				modeloDslam.equalsIgnoreCase(BandaFactory.SUVD3) ||
				modeloDslam.equalsIgnoreCase(BandaFactory.SUVD11)
				){
			return new Suvd();
		}else{
			throw new Exception("DSLAM não implementado.");
		}
	}


	public static BandaServicoInterface criarServico(String modeloDslam) throws Exception{

		if(
				modeloDslam.equalsIgnoreCase(BandaFactory.SUAD1) || 
				modeloDslam.equalsIgnoreCase(BandaFactory.SUAD3)
				){
			return new SuadServico();
		}else if (
				modeloDslam.equalsIgnoreCase(BandaFactory.GPON_CARD8) ||
				modeloDslam.equalsIgnoreCase(BandaFactory.GPON_CARD8)
				){
			return new ZhoneServico();
		}else if (
				modeloDslam.equalsIgnoreCase(BandaFactory.GPON_CARD) ||
				modeloDslam.equalsIgnoreCase(BandaFactory.GPON_CARD)
				){
			return new AlcatelServico();
		}else if (
				modeloDslam.equalsIgnoreCase(BandaFactory.SUVD3) ||
				modeloDslam.equalsIgnoreCase(BandaFactory.SUVD11)
				){
			return new SuvdServico();
		}else{
			throw new Exception("DSLAM não implementado.");
		}

	}

	//	public Credencial createCredencial(String modeloDslam) throws Exception{
	//
	//		if(modeloDslam.equalsIgnoreCase(BandaFactory.ZHONE)){
	//			return BandaFactory.zhoneCredencial();
	//		}else if (modeloDslam.equalsIgnoreCase(BandaFactory.KEYMILE)) {
	//			return BandaFactory.keymileCredencial();
	//		}else{
	//			throw new Exception("DSLAM não implementado.");
	//		}
	//	}


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