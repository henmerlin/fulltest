package entidades.parametros;

public class Configuracao {
	
	private String nome;
	
	private String valor;
	
	private String referencia;
	
	public Configuracao() {
	
	}
	
	public Configuracao(String nome, String valor, String referencia) {
		this.nome = nome;
		this.valor = valor;
		this.referencia = referencia;
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

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
}
