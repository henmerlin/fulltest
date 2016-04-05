package entidades.linha.tdm;

import entidades.linha.Linha;
import entidades.linha.LinhaInterface;

/**
 * Instância de exemplo:
 * 4130222839 - Henrique
 * @category Entidades
 * @author g0042204
 */
public class Nortel extends Linha implements LinhaInterface{
	

	public Nortel() {
		
	}

	@Override
	public String getNome() {

		return "TDM-H248";
	}

	@Override
	public String toString() {
		return "Nortel [getNome()=" + getNome() + "]";
	}
	
	
	
}
