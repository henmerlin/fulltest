package model;

import entidades.banda.parametros.TabelaParametrosGpon;
import entidades.banda.parametros.TabelaParametrosMetalico;

public class Teste {

	public static void main(String[] args) throws Exception {
		
		
		TabelaParametrosMetalico gpon = new TabelaParametrosMetalico();
		
		System.out.println(gpon.getName());
		
		
//		
//		try {
//			
//			SuvdServico suvd = new SuvdServico();	
//			GetInfoOut get = new GetInfoOut();
//			
//			InfoTBS tbs = new InfoTBS();
//			tbs.setIpDslam("10.141.249.209");
//			tbs.setSlot(new BigInteger("7"));
//			tbs.setPortNumber(new BigInteger("26"));
//			
//			get.setInfoTBS(tbs);
//			suvd.setGetInfo(get);
//			
//			suvd.connect();
//			
//			TabelaParametrosInter oi = suvd.consultarTabelaParametros();
//			TabelaHistorico tabela = suvd.consultarTabelaHistorico();
//			
//			System.out.println(tabela.getDias().get(0).getPcktsDown());
//			System.out.println(oi.getPortaAdmStatus());
//			
//			suvd.disconnect();
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
			


	}
}

