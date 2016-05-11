package controllers.massivo;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import entidades.massivo.Lote;
import model.massivo.RelatorioLotesServico;

@ManagedBean
@ViewScoped
public class RelatorioLotesBean {
	
	@EJB
	private RelatorioLotesServico relatorioLotesServico;

	public RelatorioLotesBean() {
		
	}
	
	
	public List<Lote> listarLotes() {
		
		return this.relatorioLotesServico.listarLotes();
		
	}
	
	public Integer buscaStatusLote(Lote lote, Boolean acao) {
		
		return this.relatorioLotesServico.buscaStatusLote(lote, acao).size();
		
	}
	
	

}
