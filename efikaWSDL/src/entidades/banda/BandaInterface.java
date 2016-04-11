package entidades.banda;

import java.util.List;

import entidades.banda.parametros.TabelaParametrosInter;
import entidades.parametros.Parametro;

public interface BandaInterface {
	
	public List<Parametro> listarParametros();
	
	public TabelaParametrosInter getParametros();
	
	public void setParametros(TabelaParametrosInter tabela);


}
