package entidades.linha.ims;

import entidades.configuracoes.ModemSip;
import entidades.linha.LinhaInterface;

/**
 * Instância de exemplo:
 * 4133280564 - Rafael
 * @category Entidades
 * @author g0042204
 */
public class Sip extends Ims implements LinhaInterface{

	private ModemSip modem;
	
	public Sip() {
		this.modem = new ModemSip();
	}

	@Override
	public String getNome() {
		return "IMS-SIP";
	}

	public ModemSip getModem() {
		return modem;
	}

	public void setModem(ModemSip modem) {
		this.modem = modem;
	}

}
