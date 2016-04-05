package model.banda.metalico;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import entidades.banda.parametros.TabelaParametrosInter;

public interface DslamMetalicoInterface {
	
	public TabelaParametrosInter consultarTabelaParametros(GetInfoOut cadastro);

}
