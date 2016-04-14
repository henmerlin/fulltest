package entidades.banda.parametros;

import entidades.parametros.Parametro;

public class TabelaParametrosGpon extends TabelaParametros implements TabelaParametrosInter{
		
	private Double potenciaONT;
	
	private Double potenciaOLT;
	
	
	public TabelaParametrosGpon() {

	}
	
	public Double getPotenciaONT() {
		return potenciaONT;
	}

	public void setPotenciaONT(Double potenciaONT) {
		this.potenciaONT = potenciaONT;
	}

	public Double getPotenciaOLT() {
		return potenciaOLT;
	}

	public void setPotenciaOLT(Double potenciaOLT) {
		this.potenciaOLT = potenciaOLT;
	}

	@Override
	public void listarParametros() {
		
		this.getParametros().add(new Parametro("Potência ONT", this.potenciaONT.toString()));
		this.getParametros().add(new Parametro("Potência OLT", this.potenciaOLT.toString()));
		
	}

	@Override
	public TabelaParametrosMetalico getTabelaMetalico() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TabelaParametrosMetalicoVdsl getTabelaMetalicoVdsl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TabelaParametrosGpon getTabelaParametrosGpon() {
		return this;
	}

}
