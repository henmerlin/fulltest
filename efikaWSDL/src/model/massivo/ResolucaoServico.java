package model.massivo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import entidades.validacao.Resolucao;

@Stateless
public class ResolucaoServico {
	
	@PersistenceContext(unitName="vu")  
	private EntityManager entityManager;

	public ResolucaoServico() {
		
	}
	
	public Resolucao consultarPorId(Integer id){
		
		try {
			Query query = this.entityManager.createQuery("FROM Resolucao r WHERE r.id =:param1");
			query.setParameter("param1", id);
			return (Resolucao) query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

}
