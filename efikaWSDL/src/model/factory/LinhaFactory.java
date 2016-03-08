package model.factory;

import entidades.credenciais.Credencial;
import entidades.linha.metalico.LinhaNortel;
import entidades.linha.metalico.Nortel;

/**
 * 
 * @category Factory Method
 * @author G0042204
 */
public final class LinhaFactory {

	private final static String NORTEL = "TDM-H248";
	
	
	/**
	 * Método utilizado para criar entidade Linha de acordo com técnologia
	 * @param tecnologia
	 * @return Objeto filho de Linha
 	 * @throws Exception
	 */
	public Nortel criar(String tecnologia) throws Exception{
		
		if(tecnologia.equalsIgnoreCase(LinhaFactory.NORTEL)){
			return new LinhaNortel();
		}else{
			throw new Exception("Técnologia de voz não implementada.");
		}
	}
	

	/**
	 * Método utilizado para criar entidade Credencial de acordo com tipo
	 * @param tipo
	 * @return Credencial utilizada para autenticação Telnet / Serviço
	 * @throws Exception Linha não implementada
	 */
	public Credencial createCredencial(String tipo) throws Exception{

		if(tipo.equalsIgnoreCase(LinhaFactory.NORTEL)){
			return this.nortelCredencial();
		}else{
			throw new Exception("Técnologia de voz não implementada.");
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
