package entidades.linha.ims;

import entidades.linha.LinhaInterface;

/**
 * Instância de exemplo:
 * 4133280564 - Rafael
 * @category Entidades
 * @author g0042204
 */
public class Sip extends Ims implements LinhaInterface{

	public Sip() {

	}

	@Override
	public String getNome() {
		return "IMS-SIP";
	}
}
