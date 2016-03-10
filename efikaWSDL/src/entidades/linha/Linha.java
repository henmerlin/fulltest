package entidades.linha;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import entidades.servicos.ServicoLinha;

public class Linha {
	
	@NotEmpty
	private String instancia;
	
	private List<ServicoLinha> servicos;
	
	
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

}
