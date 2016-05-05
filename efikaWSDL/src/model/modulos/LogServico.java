package model.modulos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entidades.log.Consulta;
import entidades.log.ErroConsulta;

@Stateless
public class LogServico {

	@PersistenceContext(unitName="vu")  
	private EntityManager entityManager;

	public LogServico() {

	}

	public void log(Consulta log) {
		this.entityManager.persist(log);
	}

	public void log(ErroConsulta log) {
		this.entityManager.persist(log);
	}
}
