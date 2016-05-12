package entidades.validacao;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import entidades.massivo.Teste;

@Entity
@Table(name="FULLTEST_PARECER_TESTE")
public class ParecerTeste {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne
	private Teste teste;

	@ManyToOne
	private Verificacao verificacao;
	
	@ManyToOne
	private Resolucao resolucao;	
	
	private Date data;
	
	public ParecerTeste() {
		this.data = new Date();
	}
	
	public ParecerTeste(Teste teste, Verificacao verificacao){
		this.teste = teste;
		this.verificacao = verificacao;
		this.data = new Date();
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}

