package entidades.correcao;

public enum AcaoCorretiva{

	FXS("FXS");

	private String nome;

	private AcaoCorretiva(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
	
}