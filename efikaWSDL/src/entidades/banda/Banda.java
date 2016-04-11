package entidades.banda;

import java.util.List;

import entidades.banda.parametros.TabelaParametrosInter;
import entidades.parametros.Parametro;

public class Banda {
	
	private TabelaParametrosInter parametros;
	
	public Banda() {
	
	}

	public TabelaParametrosInter getParametros() {
		return parametros;
	}

	public void setParametros(TabelaParametrosInter parametros) {
		this.parametros = parametros;
	}
	
	
	public List<Parametro> listarParametros(){
		
		return null;
	}
}
