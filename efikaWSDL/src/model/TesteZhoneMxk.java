package model;

import java.math.BigInteger;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.metalico.zhone.Mxk;
import entidades.banda.parametros.TabelaParametrosMetalico;
import entidades.cadastro.CadastroMetalico;
import model.banda.metalico.zhone.MxkServico;


public class TesteZhoneMxk {

	public static void main(String[] args) throws Exception {


		try {
			MxkServico mxk = new MxkServico();	

			GetInfoOut get = new GetInfoOut();
			InfoTBS tbs = new InfoTBS();

			//7536240889		
			tbs.setIpDslam("10.171.33.73");
			tbs.setSlot(new BigInteger("8"));
			tbs.setPortNumber(new BigInteger("23"));
			tbs.setPortAddrSeq(new BigInteger("1239"));

			get.setInfoTBS(tbs);			

			CadastroMetalico cadastro = new CadastroMetalico();

			cadastro.setCadastro(get);

			mxk.setCadastro(cadastro);

			mxk.connect();

			Mxk banda = new Mxk();

			TabelaParametrosMetalico tabela = mxk.consultarTabelaParametros();
			
			System.out.println("Adm Sinc: " + tabela.getPortaAdmStatus());
			System.out.println("Sinc: " + tabela.getSincronismoStatus());
			System.out.println("Modulação: " + tabela.getModulacao());
			System.out.println("Profile: " + tabela.getProfile());
			System.out.println("Down: " + tabela.getDownload());
			System.out.println("Up: " + tabela.getUpload());
			
			//mxk.consultarBridges(banda);			

			/*System.out.println(banda.getAutenticacao().getVc());
			System.out.println(banda.getTv().getVc());
			System.out.println(banda.getVoip().getVc());
			System.out.println(banda.getMulticast().getVc());*/

			mxk.disconnect();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		

	}
}

