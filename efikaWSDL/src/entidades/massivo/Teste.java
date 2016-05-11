package entidades.massivo;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import entidades.validacao.ParecerTeste;

@Entity
@Table(name="FULLTEST_TESTE")
public class Teste {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String instancia;
	
	private Boolean processado = false;
	
	@ManyToOne
	private Lote lote;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="teste")
	private List<ParecerTeste> pareceres;
	
	private Date dataEntrada;
	
	public Teste() {
		this.dataEntrada = new Date();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getInstancia() {
		return instancia;
	}

	public void setInstancia(String instancia) {
		this.instancia = instancia;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	public List<ParecerTeste> getPareceres() {
		return pareceres;
	}

	public void setPareceres(List<ParecerTeste> pareceres) {
		this.pareceres = pareceres;
	}

	public Boolean getProcessado() {
		return processado;
	}

	public void setProcessado(Boolean processado) {
		this.processado = processado;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
}
