package entidades.linha.ims;

import java.util.List;

import entidades.configuracoes.ConfiguracaoLinha;
import entidades.linha.LinhaInterface;

public class H248 extends Ims implements LinhaInterface{

	public H248() {
		
	}
	
	@Override
	public String getNome() {
		return "IMS-H248";
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
