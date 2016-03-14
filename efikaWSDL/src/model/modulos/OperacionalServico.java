package model.modulos;



import java.rmi.RemoteException;

import entidades.linha.LinhaInterface;
import model.factory.LinhaFactory;
import model.linha.LinhaServico;
import model.linha.LinhaServicoInterface;

public class OperacionalServico {

	private LinhaServico linhaSrvc;
	
	@SuppressWarnings("unused")
	private LinhaServicoInterface srcTecnologia;

	public OperacionalServico() {
		this.linhaSrvc = new LinhaServico();
	}

	public LinhaInterface construirLinha(String instancia) throws Exception{
		
		
		try {
			String central = this.linhaSrvc.consultarCentral(instancia);
			return LinhaFactory.criar(this.linhaSrvc.consultarCentral(instancia));
		} catch (RemoteException e) {
			throw new Exception(e.getMessage());
		}
		
	}



}
