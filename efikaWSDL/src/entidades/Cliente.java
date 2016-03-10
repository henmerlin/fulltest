package entidades;

import entidades.banda.BandaInterface;
import entidades.linha.LinhaInterface;

public class Cliente {
	
	private String instancia;
	
	private LinhaInterface linha;

	private BandaInterface banda;

	public Cliente() {
		
	}

	public String getInstancia() {
		return instancia;
	}

	public void setInstancia(String instancia) {
		this.instancia = instancia;
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
