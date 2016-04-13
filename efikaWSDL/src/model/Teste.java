package model;

import java.math.BigInteger;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.parametros.TabelaHistorico;
import entidades.banda.parametros.TabelaParametrosInter;
import model.banda.metalico.keymile.SuvdServico;

public class Teste {

	public static void main(String[] args) throws Exception {
		
		
		
		
		try {
			
			SuvdServico suvd = new SuvdServico();	
			GetInfoOut get = new GetInfoOut();
			
			InfoTBS tbs = new InfoTBS();
			tbs.setIpDslam("10.141.249.209");
			tbs.setSlot(new BigInteger("7"));
			tbs.setPortNumber(new BigInteger("26"));
			
			get.setInfoTBS(tbs);
			suvd.setGetInfo(get);
			
			suvd.connect();
			
			TabelaParametrosInter oi = suvd.consultarTabelaParametros();
			TabelaHistorico tabela = suvd.consultarTabelaHistorico();
			
			System.out.println(tabela.getDias().get(0).getPcktsDown());
			System.out.println(oi.getPortaAdmStatus());
			
			suvd.disconnect();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			


	}
}

