package model.banda;

import entidades.banda.parametros.TabelaParametrosInter;
import entidades.cadastro.Cadastro;

public interface BandaServicoInterface {
	
	
	public TabelaParametrosInter consultarTabelaParametros(Cadastro cadastro) throws Exception;
	
	

}
