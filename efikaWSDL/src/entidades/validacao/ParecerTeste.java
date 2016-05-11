package entidades.validacao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import entidades.massivo.Teste;

@Entity
@Table(name="FULLTEST_PARECER_TESTE")
public class ParecerTeste {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@NotNull
	@ManyToOne
	private Teste teste;

	@NotEmpty
	@ManyToOne
	private Verificacao verificacao;
	
	@NotEmpty
	@ManyToOne
	private Resolucao resolucao;	
	
	public ParecerTeste() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Teste getTeste() {
		return teste;
	}

	public void setTeste(Teste teste) {
		this.teste = teste;
	}

	public Verificacao getVerificacao() {
		return verificacao;
	}

	public void setVerificacao(Verificacao verificacao) {
		this.verificacao = verificacao;
	}

	public Resolucao getResolucao() {
		return resolucao;
	}

	public void setResolucao(Resolucao resolucao) {
		this.resolucao = resolucao;
	}

}

