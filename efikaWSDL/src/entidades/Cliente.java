package entidades;

import entidades.banda.BandaInterface;
import entidades.linha.LinhaInterface;

public class Cliente {
	
	private LinhaInterface linha;

	private BandaInterface banda;
	

	public Cliente() {
		
	}

	public BandaInterface getBanda() {
		return banda;
	}

	public void setBanda(BandaInterface banda) {
		this.banda = banda;
	}

	public LinhaInterface getLinha() {
		return linha;
	}

	public void setLinha(LinhaInterface linha) {
		this.linha = linha;
	}
	
	

}
