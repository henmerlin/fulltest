package entidades.parametros;

public class Configuracao {
	
	private String nome;
	
	private String valor;
	
	public Configuracao() {
	
	}
	
	public Configuracao(String nome, String valor) {
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
