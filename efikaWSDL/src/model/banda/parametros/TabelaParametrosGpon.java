package model.banda.parametros;

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
}
