package entidades.massivo;

import java.util.Date;
import java.util.List;

import javax.enterprise.inject.Default;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="FULLTEST_LOTE")
public class Lote {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String nome;
	
	private Date horaIntegracao;
	
	@ManyToOne
	private Status status;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="lote")
	private List<Teste> testes;

	public Lote() {
		
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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

	public Date getHoraIntegracao() {
		return horaIntegracao;
	}

	public void setHoraIntegracao(Date horaIntegracao) {
		this.horaIntegracao = horaIntegracao;
	}
	
	public List<Teste> getTestes() {
		return testes;
	}

	public void setTestes(List<Teste> testes) {
		this.testes = testes;
	}

}
