package entidades.massivo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lote {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String nome;
	
	private Date horaIntegracao;
	
	public Lote() {
		
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

}
