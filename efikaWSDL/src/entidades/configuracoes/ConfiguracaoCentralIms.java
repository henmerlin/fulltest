package entidades.configuracoes;

import java.util.ArrayList;
import java.util.List;

public class ConfiguracaoCentralIms implements ConfiguracaoLinha{

	private Parametro registro;

	public ConfiguracaoCentralIms() {

	}

	public List<Parametro> getParametros(){

		ArrayList<Parametro> retorno = new ArrayList<Parametro>();
		

		return retorno;
	}

	public Parametro getRegistro() {
		return registro;
	}

	public void setRegistro(Parametro registro) {
		this.registro = registro;
	}
}
