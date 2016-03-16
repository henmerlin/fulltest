package model.banda.metalico.zhone;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;

public class MxkServico {

	public MxkServico() {
		
	}
	/*
	 * Retorna:
	 * 		estado da porta
	 * 	 	velocidade de sincronismo (up e down)
	 * 	 	snr (up e down)
	 * 		atn (up e down)
	 * 		pacotes recebidos
	 * 		pacotes enviados
	 * 		crc (up ou down ou a media dos dois, desconhecido)
	 */
	public String portStatus(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando1 = "dslstat 1/" + tbs.getSlot() + "/" + tbs.getPortNumber() + "/0/vdsl -v";
		String comando2 = "A";
		
		return null;
	}
	/*
	 * Retorna o profile de down da porta
	 */
	public String profileDown(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando = "get vdsl-co-config 1/" + tbs.getSlot() + "/" +tbs.getPortNumber();
		
		return null;
	}
	/*
	 * Retorna o profile de up da porta
	 */
	public String profileUp(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando = "get vdsl-cpe-config 1/" + tbs.getSlot() + "/" +tbs.getPortNumber();
		
		return null;
	}
	/*
	 * Retorna a modulação da porta
	 */
	public String modulacao(GetInfoOut cadastro){
		
		InfoTBS tbs = cadastro.getInfoTBS();
		
		String comando = "get vdsl-config 1/" + tbs.getSlot() + "/" +tbs.getPortNumber();
		
		return null;
	}

}
