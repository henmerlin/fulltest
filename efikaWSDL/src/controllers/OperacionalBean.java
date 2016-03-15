package controllers;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.faces.bean.ManagedBean;

import entidades.cliente.Cliente;
import exception.ossturbonet.oss.gvt.com.DataNotFoundException;
import exception.ossturbonet.oss.gvt.com.OSSTurbonetException;
import model.banda.BandaServico;
import model.cliente.ClienteServico;
import model.factory.LinhaFactory;
import model.linha.LinhaServico;
import model.linha.LinhaServicoInterface;
import util.JSFUtil;

@ManagedBean
public class OperacionalBean {

	private Cliente cliente;

	private LinhaServico servicoLinha;

	private BandaServico servicoBanda;

	private ClienteServico servicoCliente;
	
	// Serviço FullTest
	private LinhaServicoInterface srcLinha;
	

	public OperacionalBean() {
		this.cliente = new Cliente();
		this.servicoLinha = new LinhaServico();
		this.servicoBanda = new BandaServico();
		this.servicoCliente = new ClienteServico();
	}

	public void consultar(){

		try {

			// Recupera instancia
			String instancia = this.cliente.getInstancia();

			// Aciona método para obter designador
			String designador = this.servicoBanda.getDesignatorByAccessDesignator(instancia);	
			
			// Consulta Designador de Acesso
			String designadorAcesso = this.servicoBanda.getAccessDesignator(designador);
			
			// Consulta Tipo de Central
			String central = this.servicoLinha.getCentral(instancia);
			
			// Sets
			this.cliente.setDesignador(designador);	
			this.cliente.setDesignadorAcesso(designadorAcesso);
			
			
			// Inicializa cria as Entidades e Servicos 
			this.srcLinha = LinhaFactory.criarServico(central);
			this.cliente.setLinha( LinhaFactory.criar(central));

			this.cliente = this.servicoCliente.consultar(this.cliente);
			this.cliente.setLinha(this.servicoLinha.consultar(this.cliente.getInstancia()));

			this.cliente.getLinha().setConfiguracoes(this.srcLinha.getConfiguracao(cliente));


		} catch (DataNotFoundException e) {
			JSFUtil.addErrorMessage(e.getMessage());
		} catch (OSSTurbonetException e) {
			JSFUtil.addErrorMessage("Designador não encontrado!");
		} catch (RemoteException e) {
			JSFUtil.addErrorMessage(e.getMessage());
		} catch (IOException e) {
			JSFUtil.addErrorMessage(e.getMessage());
		} catch (Exception e) {
			JSFUtil.addErrorMessage(e.getMessage());

		}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
