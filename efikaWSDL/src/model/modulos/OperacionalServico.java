package model.modulos;


import model.linha.LinhaServico;
import model.linha.LinhaServicoInterface;

public class OperacionalServico {

	private LinhaServico linhaSrvc;
	
	@SuppressWarnings("unused")
	private LinhaServicoInterface srcTecnologia;

	public OperacionalServico() {
		this.linhaSrvc = new LinhaServico();
	}
	
	public void consultar(){

	}

}
