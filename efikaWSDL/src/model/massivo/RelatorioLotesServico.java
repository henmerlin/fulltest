package model.massivo;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entidades.massivo.Lote;
import entidades.massivo.Teste;

@Stateless
public class RelatorioLotesServico {

	@PersistenceContext(unitName="vu")  
	private EntityManager entityManager;

	public RelatorioLotesServico() {

	}

	@SuppressWarnings("unchecked")
	public List<Lote> listarLotes() {

		try {

			Query query = this.entityManager.createQuery("FROM Lote l");
			query.setMaxResults(5);
			return query.getResultList();

		} catch (Exception e) {
			
			return new ArrayList<Lote>();

		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Teste> buscaStatusLote(Lote lote, Boolean acao) {
		
		try {
			
			Query query = this.entityManager.createQuery("FROM Teste t WHERE t.lote =:param1 AND t.processado =:param2");
			query.setParameter("param1", lote);
			query.setParameter("param2", acao);			
			return query.getResultList();
			
		} catch (Exception e) {
			
			return new ArrayList<Teste>();
			
		}
		
	}
	
	public void listaTestesLote() {
		
		Query query = this.entityManager.createQuery("FROM ParecerTeste p WHERE p.teste.");
		
	}

}
