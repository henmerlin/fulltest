package entidades.configuracoes;

import java.util.ArrayList;
import java.util.List;

import entidades.parametros.Parametro;

public class ConfiguracaoV52 extends ConfiguracaolIms implements ConfiguracaoLinha{
	
	
	public ConfiguracaoV52() {

	}

	public List<Parametro> getParametros(){

		ArrayList<Parametro> retorno = new ArrayList<Parametro>();

		retorno.add(this.getRegistro());
		

		return retorno;
	}

}
