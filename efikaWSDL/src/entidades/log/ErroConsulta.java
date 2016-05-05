package entidades.log;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="FULLTEST_LOG_ERRO_CONSULTA")
public class ErroConsulta extends LogConsulta{
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ErroConsulta() {

	}

	public ErroConsulta(String instancia, String login, String message) {
		super(instancia, login);
		this.message = message;
	}

}
