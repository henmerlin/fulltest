package entidades.linha;

import org.hibernate.validator.constraints.NotEmpty;
import entidades.configuracoes.ConfiguracaoLinha;

public class Linha{
	
	@NotEmpty
	private String instancia;
	
	private String tecnologia;
	
	private ConfiguracaoLinha configuracao;
	
	public Linha() {

	}
	
	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	public String getInstancia() {
		return instancia;
	}


	public void setInstancia(String instancia) {
		this.instancia = instancia;
	}

	public ConfiguracaoLinha getConfiguracao() {
		return configuracao;
	}

	public void setConfiguracao(ConfiguracaoLinha configuracao) {
		this.configuracao = configuracao;
	}	
}
