package model.factory;

import entidades.credenciais.Credencial;
import entidades.linha.LinhaInterface;
import entidades.linha.tdm.Nortel;

/**
 * 
 * @category Factory Method
 * @author G0042204
 */
public final class LinhaFactory {

	private final static String NORTEL = "TDM-H248";
	
	
	/**
	 * M�todo utilizado para criar entidade Linha de acordo com t�cnologia
	 * @param tecnologia
	 * @return Objeto filho de Linha
 	 * @throws Exception
	 */
	/*public Nortel criar(String tecnologia) throws Exception{
		
		if(tecnologia.equalsIgnoreCase(LinhaFactory.NORTEL)){
			return new Linha();
		}else{
			throw new Exception("T�cnologia de voz n�o implementada.");
		}
	}*/
	

	/**
	 * M�todo utilizado para criar entidade Credencial de acordo com tipo
	 * @param tipo
	 * @return Credencial utilizada para autentica��o Telnet / Servi�o
	 * @throws Exception Linha n�o implementada
	 */
	public Credencial createCredencial(String tipo) throws Exception{

		if(tipo.equalsIgnoreCase(LinhaFactory.NORTEL)){
			return this.nortelCredencial();
		}else{
			throw new Exception("T�cnologia de voz n�o implementada.");
		}
	}
	
	
	/**
	 * Implementar login ciclico (verificar com Gerente de Projeto);
	 * @return
	 * @author G0042204
	 */
	public Credencial nortelCredencial(){
		
		Credencial credencial = new Credencial();

		credencial.setUser("admin");
		credencial.setPass("zhone");

		return credencial;
		
	}
	
}
