package entidades.log;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="FULLTEST_LOG_CONSULTA")
public class Consulta extends LogConsulta{
	
	public Consulta() {
	
	}

	public Consulta(String instancia, String login) {
		super(instancia, login);
	}

}
