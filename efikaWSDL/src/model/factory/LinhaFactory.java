package model.factory;

import entidades.linha.LinhaInterface;
import entidades.linha.ims.Sip;
import entidades.linha.ims.V52;
import entidades.linha.tdm.Nortel;
import model.linha.LinhaServicoInterface;
import model.linha.ims.SipServico;
import model.linha.ims.V52Servico;
import model.linha.tdm.NortelServico;

/**
 * 
 * @category Factory Method
 * @author G0042204
 */
public final class LinhaFactory {

	private final static String NORTEL = "TDM-H248";
	private final static String SIP = "IMS-SIP";
	private final static String SIP_GPON = "IMS-SIP(GPON)";	
	private final static String V52 = "IMS-V5.2";

	/**
	 * Método utilizado para criar entidade Linha de acordo com técnologia
	 * @param tecnologia
	 * @return Objeto filho de Linha
 	 * @throws Exception
	 */
	public static LinhaInterface criar(String tecnologia) throws Exception{
						
		if(tecnologia.equalsIgnoreCase(LinhaFactory.NORTEL)){
			return new Nortel();
		}else if (tecnologia.equalsIgnoreCase(LinhaFactory.SIP)) {
			return new Sip();
		}else if (tecnologia.equalsIgnoreCase(LinhaFactory.SIP_GPON)) {
			return new Sip();
		}else if (tecnologia.equalsIgnoreCase(LinhaFactory.V52)) {
			return new V52();
		}
		else{
			System.out.println(tecnologia);
			throw new Exception("Técnologia de voz não implementada.");
		}
	}
	
	public static LinhaServicoInterface criarServico(String tecnologia) throws Exception{
		
		if(tecnologia.equalsIgnoreCase(LinhaFactory.NORTEL)){
			return new NortelServico();
		}else if (tecnologia.equalsIgnoreCase(LinhaFactory.SIP)) {
			return new SipServico();
		}else if (tecnologia.equalsIgnoreCase(LinhaFactory.SIP_GPON)) {
			return new SipServico();
		}else if (tecnologia.equalsIgnoreCase(LinhaFactory.V52)) {
			return new V52Servico();
		}else{
			System.out.println(tecnologia);
			throw new Exception("Técnologia de voz não implementada.");
		}
	}
}
