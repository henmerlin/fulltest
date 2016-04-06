package entidades.banda.parametros;

import java.util.ArrayList;
import java.util.List;

public class TabelaHistorico {
	
	private List<DiaTabelaHistorico> dias;
	
	public TabelaHistorico() {
		this.dias = new ArrayList<DiaTabelaHistorico>();
	}

	public List<DiaTabelaHistorico> getDias() {
		return dias;
	}

	public void setDias(List<DiaTabelaHistorico> dias) {
		this.dias = dias;
	}

}
