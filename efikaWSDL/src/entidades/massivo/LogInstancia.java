package entidades.massivo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LogInstancia {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String instancia;
	
	private Date horaAcao;
	
	private Boolean status;

	public LogInstancia() {
		
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

	public Date getHoraAcao() {
		return horaAcao;
	}

	public void setHoraAcao(Date horaAcao) {
		this.horaAcao = horaAcao;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}	

}
