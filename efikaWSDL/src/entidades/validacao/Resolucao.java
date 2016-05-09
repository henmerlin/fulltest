package entidades.validacao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
}
