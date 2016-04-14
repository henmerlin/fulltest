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
		
		this.getParametros().add(new Parametro("Pot�ncia ONT", this.potenciaONT.toString()));
		this.getParametros().add(new Parametro("Pot�ncia OLT", this.potenciaOLT.toString()));
		
	}
}
