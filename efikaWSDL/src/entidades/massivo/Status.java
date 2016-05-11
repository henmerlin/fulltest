package entidades.massivo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="FULLTEST_STATUS")
public class Status {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@NotEmpty
	private String nome;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="status")
	private List<Lote> lotes;
	
	public Status() {

	}
	
	public Status(Integer id) {
		this.id = id;
	}
	
	public Status(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
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

	public List<Lote> getLotes() {
		return lotes;
	}

	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}
}
