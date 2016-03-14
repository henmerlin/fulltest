package entidades.cliente;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import entidades.banda.BandaInterface;
import entidades.linha.LinhaInterface;

public class Cliente {
	
	@NotEmpty
	@Length(min=10, max=12, message="Inst�ncia inv�lida!")
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
