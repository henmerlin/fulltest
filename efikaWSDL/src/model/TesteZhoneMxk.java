package model;

import java.math.BigInteger;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.metalico.zhone.Combo;
import entidades.banda.metalico.zhone.Mxk;
import entidades.banda.parametros.TabelaParametrosMetalico;
import entidades.cadastro.Cadastro;
import entidades.cadastro.CadastroMetalico;
import model.banda.metalico.zhone.ComboServico;
import model.banda.metalico.zhone.MxkServico;


public class TesteZhoneMxk {

	public static void main(String[] args) throws Exception {


		try {
			MxkServico mxk = new MxkServico();	
			
			GetInfoOut get = new GetInfoOut();
			InfoTBS tbs = new InfoTBS();

			//1925172875		
			tbs.setIpDslam("10.211.167.53");
			tbs.setSlot(new BigInteger("11"));
			tbs.setPortNumber(new BigInteger("4"));
			tbs.setPortAddrSeq(new BigInteger("1292"));

			get.setInfoTBS(tbs);
			//mxk.setGetInfo(get);

			mxk.connect();

			Mxk banda = new Mxk();

			mxk.consultarBridges(banda);
			
			
			System.out.println(banda.getAutenticacao().getVc());
			System.out.println(banda.getTv().getVc());
			System.out.println(banda.getVoip().getVc());
			System.out.println(banda.getMulticast().getVc());
			
			mxk.disconnect();


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		

	}
}

