package entidades.linha.ims;

import entidades.configuracoes.ConfiguracaoLinha;
import entidades.linha.LinhaInterface;

/**
 * Instância de exemplo:
 * 4133280564 - Rafael
 * @category Entidades
 * @author g0042204
 */
public class Sip extends Ims implements LinhaInterface{
	
	private ConfiguracaoLinha configuracaoModem;

	public Sip() {

	}

	@Override
	public String getNome() {
		return "IMS-SIP";
	}

	public ConfiguracaoLinha getConfiguracaoModem() {
		return configuracaoModem;
	}

	public void setConfiguracaoModem(ConfiguracaoLinha configuracaoModem) {
		this.configuracaoModem = configuracaoModem;
	}
}
