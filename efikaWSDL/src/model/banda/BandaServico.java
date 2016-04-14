package model.banda;

import java.rmi.RemoteException;

import com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetProxy;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import entidades.banda.BandaInterface;
import entidades.cadastro.Cadastro;
import entidades.cliente.Cliente;
import exception.ossturbonet.oss.gvt.com.DataNotFoundException;
import exception.ossturbonet.oss.gvt.com.OSSTurbonetException;
import model.factory.BandaFactory;

public class BandaServico {

	private OSSTurbonetProxy osstbService;

	public BandaServico() {
		this.osstbService = new OSSTurbonetProxy();
	}
	
	public BandaInterface construirBanda(Cadastro cadastro) throws Exception{
				
		BandaInterface banda = BandaFactory.criar(cadastro.getCadastro().getInfoTBS().getDslamVendor());
		
		return banda;
	}	

	public BandaInterface construirBandaServico(Cadastro cadastro) throws Exception{
				
		BandaInterface banda = BandaFactory.criar(cadastro.getCadastro().getInfoTBS().getDslamVendor());
		
		return banda;
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

		return this.osstbService.getInfo(cliente.getDesignador(), this.getAccessDesignator(cliente.getDesignador()), "URA", "URA", cliente.getDesignador(), "URA", cliente.getInventario().getBanda().getDownloadCrm(), cliente.getInventario().getBanda().getUploadCrm());
	}
	
	public String getAccessDesignator(String designador) throws DataNotFoundException, OSSTurbonetException, RemoteException{
		return this.osstbService.getAccessDesignator(designador);
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
