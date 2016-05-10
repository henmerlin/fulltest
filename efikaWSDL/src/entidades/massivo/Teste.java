package entidades.massivo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="FULLTEST_TESTE")
public class Teste {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String instancia;
	
	private Boolean status;
		
	@ManyToOne
	private Lote lote;
	
	public Teste() {
		
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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
