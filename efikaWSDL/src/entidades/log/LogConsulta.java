package entidades.log;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class LogConsulta {
	
	@Id
	@GeneratedValue
	private Integer id;

	private String instancia;
	
	private String login;
	
	private Date data;
	
	public LogConsulta() {
	
	}

	public LogConsulta(String instancia, String login) {
		this.instancia = instancia;
		this.login = login;
		this.data = new Date();
	}

	public String getInstancia() {
		return instancia;
	}

	public void setInstancia(String instancia) {
		this.instancia = instancia;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
