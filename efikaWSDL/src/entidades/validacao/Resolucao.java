package entidades.validacao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="FULLTEST_RESOLUCAO")
public class Resolucao {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@NotEmpty
	private String nome;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="resolucao")
	private List<Validacao> validacoes;
	
	public Resolucao() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Validacao> getValidacoes() {
		return validacoes;
	}

	public void setValidacoes(List<Validacao> validacoes) {
		this.validacoes = validacoes;
	}
}
