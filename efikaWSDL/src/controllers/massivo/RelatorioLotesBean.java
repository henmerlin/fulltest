package controllers.massivo;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import entidades.massivo.Lote;
import entidades.validacao.ParecerTeste;
import model.massivo.RelatorioLotesServico;

@ManagedBean
@ViewScoped
public class RelatorioLotesBean {

	private List<ParecerTeste> parecer;
	
	private Lote lote;

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

	public void tabelaRelatorio() {

		this.parecer = this.relatorioLotesServico.listaTestesLoteEspecifico(this.lote);	
				
	}
	
	public String tabelaRelatorio2(ParecerTeste parecerTeste, Boolean acao) {
		
		ParecerTeste parecerTeste2 = new ParecerTeste();
		
		try {
			
			parecerTeste2 = this.relatorioLotesServico.listaTesteEspecifico(parecerTeste);
			
			if (acao) {
				
				return parecerTeste2.getResolucao().getNome();
				
			}else{
				
				String precessado = parecerTeste2.getTeste().getProcessado().toString();
				
				return precessado;
				
			}			
			
			
		} catch (Exception e) {
			
			return "Não testado";

		}		
		
	}
	
	

	public List<ParecerTeste> getParecer() {
		return parecer;
	}

	public void setParecer(List<ParecerTeste> parecer) {
		this.parecer = parecer;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

}
