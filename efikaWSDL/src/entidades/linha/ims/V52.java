package entidades.linha.ims;

import java.util.List;

import entidades.configuracoes.ConfiguracaoLinha;
import entidades.linha.LinhaInterface;
import entidades.parametros.Configuracao;

public class V52 extends Ims implements LinhaInterface{

	public V52() {
		
	}
	
	@Override
	public String getNome() {
		return "IMS-V5.2";
	}

	@Override
	public ConfiguracaoLinha getConfiguracao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setConfiguracao(ConfiguracaoLinha configuracao) {
		// TODO Auto-generated method stub
		
	}

}
