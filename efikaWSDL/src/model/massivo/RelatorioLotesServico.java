package model.massivo;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entidades.massivo.Lote;
import entidades.massivo.Teste;
import entidades.validacao.ParecerTeste;

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
	
	@SuppressWarnings("unchecked")
	public List<ParecerTeste> listaTestesLoteEspecifico(Lote lote) {
		
		try {
			
			Query query = this.entityManager.createQuery("FROM ParecerTeste p WHERE p.teste.lote =:param1 AND p.verificacao.id = 1");
			query.setParameter("param1", lote);
			return query.getResultList();
			
		} catch (Exception e) {
			
			return new ArrayList<ParecerTeste>();
			
		}
		
	}
	
	public ParecerTeste listaTesteEspecifico(ParecerTeste parecerTeste) throws Exception {
		
		try {
			
			Query query = this.entityManager.createQuery("FROM ParecerTeste p WHERE p.teste =:param1 AND p.verificacao.id = 2");
			query.setParameter("param1", parecerTeste.getTeste());
			
			return (ParecerTeste) query.getSingleResult();
			
		} catch (Exception e) {
			
			throw new Exception("Cód. erro Parecer: 2.");
			
		}
		
	}

}
