package entidades.parametros;

import org.hibernate.validator.constraints.NotEmpty;

public class Parametro {
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private String valor;
	
	public Parametro() {

	}
	
	public Parametro(String nome, String valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
