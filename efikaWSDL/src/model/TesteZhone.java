package model;

import java.math.BigInteger;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.metalico.zhone.Combo;
import entidades.banda.parametros.TabelaParametrosMetalico;
import entidades.cadastro.CadastroMetalico;
import model.banda.metalico.zhone.ComboServico;


public class TesteZhone {

	public static void main(String[] args) throws Exception {	
		
		try {
			ComboServico combo = new ComboServico();		
			
			GetInfoOut get = new GetInfoOut();
			
			InfoTBS tbs = new InfoTBS();
			
			//5532219304		
			tbs.setIpDslam("10.151.180.31");
			tbs.setSlot(new BigInteger("10"));
			tbs.setPortNumber(new BigInteger("42"));
			tbs.setPortAddrSeq(new BigInteger("186"));
			
			get.setInfoTBS(tbs);			
			
			CadastroMetalico cadastro = new CadastroMetalico();
			
			cadastro.setCadastro(get);
			
			combo.setCadastro(cadastro);
			
			combo.connect();
			
			Combo banda = new Combo();
			//combo.consultarBridges(banda);
			
			TabelaParametrosMetalico tabela = combo.consultarTabelaParametros();
			
			
			System.out.println(tabela.getProfile());
			
						
			combo.disconnect();			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		
	}
}

