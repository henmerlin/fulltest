package entidades.banda.parametros;

import entidades.parametros.Parametro;

public interface TabelaParametrosInter {
		
	public Parametro getParam(int index);
	
	public void listarParametros();
	
	public String getSincronismoStatus();

	public String getPortaAdmStatus();
	
	public String getProfile();
	
}
