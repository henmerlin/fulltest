package model.massivo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import entidades.validacao.Verificacao;

@Stateless
public class ValidacaoServico {
	
	@PersistenceContext(unitName="vu")  
	private EntityManager entityManager;

	public ValidacaoServico() {
		
	}
	
	public Verificacao consultarPorId(Integer id){
		
		try {
			Query query = this.entityManager.createQuery("FROM Validacao v WHERE v.id =:param1");
			query.setParameter("param1", id);
			return (Verificacao) query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

}
