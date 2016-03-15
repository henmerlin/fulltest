package entidades.linha;


import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import entidades.parametros.Configuracao;
import entidades.servicos.ServicoLinha;

public class Linha {
	
	@NotEmpty
	private String instancia;
	
	private List<ServicoLinha> servicos;
	
	private List<Configuracao> configuracoes;
	
	public Linha() {

	}

	public String getInstancia() {
		return instancia;
	}


	public void setInstancia(String instancia) {
		this.instancia = instancia;
	}

	public List<ServicoLinha> getServicos() {
		return servicos;
	}


	public void setServicos(List<ServicoLinha> servicos) {
		this.servicos = servicos;
	}


	public List<Configuracao> getConfiguracoes() {
		return configuracoes;
	}


	public void setConfiguracoes(List<Configuracao> configuracoes) {
		this.configuracoes = configuracoes;
	}

}
