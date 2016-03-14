package model.banda;

import java.rmi.RemoteException;

import com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetProxy;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import entidades.cliente.Cliente;
import exception.ossturbonet.oss.gvt.com.DataNotFoundException;
import exception.ossturbonet.oss.gvt.com.OSSTurbonetException;

public class BandaServico {

	private OSSTurbonetProxy osstbService;

	public BandaServico() {
		this.osstbService = new OSSTurbonetProxy();
	}

	/**
	 * Função referente ao informações TBS - WiseTool
	 * Depende da consulta de produtos contratados - Informações do Cliente (Siebel 8) - Cliente Servico
	 * @param cliente
	 * @return GetInfoOut
	 * @throws DataNotFoundException
	 * @throws OSSTurbonetException
	 * @throws RemoteException
	 * @author G0042204
	 */
	public GetInfoOut getInfo(Cliente cliente) throws DataNotFoundException, OSSTurbonetException, RemoteException{

		return this.osstbService.getInfo(cliente.getDesignador(), cliente.getDesignador(), "URA", "URA", cliente.getDesignador(), "URA", cliente.getDownloadCrm(), cliente.getUploadCrm());
	}

	/**
	 * Função resposavel por resolver Instancia em Designador
	 * @param instancia
	 * @return
	 * @throws DataNotFoundException
	 * @throws OSSTurbonetException
	 * @throws RemoteException
	 * @author G0042204
	 */
	public String getDesignatorByAccessDesignator(String instancia) throws DataNotFoundException, OSSTurbonetException, RemoteException{

		return this.osstbService.getDesignatorByAccessDesignator(instancia);
	}

}
