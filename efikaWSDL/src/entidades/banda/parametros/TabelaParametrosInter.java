package entidades.banda.parametros;

import java.util.List;

import entidades.parametros.Parametro;

public interface TabelaParametrosInter {
	
	public List<Parametro> listarParametros();
	
	public String getSincronismoStatus();

	public String getPortaAdmStatus();
	
	public String getProfile();
	
}
