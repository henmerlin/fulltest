package entidades;

import entidades.banda.Banda;
import entidades.linha.Linha;

public class Cliente {
	
	private Banda banda;
	
	private Linha linha;

	public Cliente() {
		
	}

	public Banda getBanda() {
		return banda;
	}

	public void setBanda(Banda banda) {
		this.banda = banda;
	}

	public Linha getLinha() {
		return linha;
	}

	public void setLinha(Linha linha) {
		this.linha = linha;
	}
	
	

}
