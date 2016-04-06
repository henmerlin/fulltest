package model.banda.metalico.zhone;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.parametros.TabelaParametrosMetalico;

public class ComboServico extends ZhoneServico{

	public ComboServico() {
		
	}
	/*
	 * Retorna:
	 * 		estado da porta
	 * 	 	velocidade de sincronismo (up e down)
	 * 		snr (up e down)
	 * 		atn (up e down)
	 * 		pacotes recebidos
	 * 		pacotes enviados
	 * 		crc up e down
	 * 		fec up e down
	 */
	public TabelaParametrosMetalico consultarTabelaParametros(){
		
		TabelaParametrosMetalico tabela = new TabelaParametrosMetalico();
		
		return tabela;
	}
	
	
	public String portStatus(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando1 = "dslstat 1/" + tbs.getSlot() + "/" + tbs.getPortNumber() + "/0/adsl -v";
		String comando2 = "A";
		
		return null;
	}
	/*
	 * Retorna o profile de down da porta
	 */
	public String profileDown(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando = "get adsl-co-profile 1/" + tbs.getSlot() + "/" +tbs.getPortNumber();
		
		return null;
	}
	/*
	 * Retorna o profile de up da porta
	 */
	public String profileUp(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando = "get adsl-cpe-profile 1/" + tbs.getSlot() + "/" +tbs.getPortNumber();
		
		return null;
	}
	/*
	 * Retorna a modulação da porta
	 */
	public String modulacao(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando = "get adsl-profile 1/" + tbs.getSlot() + "/" +tbs.getPortNumber();
		
		return null;
	}
}
