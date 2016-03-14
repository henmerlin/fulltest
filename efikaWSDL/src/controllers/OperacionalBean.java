package controllers;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.faces.bean.ManagedBean;

import entidades.cliente.Cliente;
import exception.ossturbonet.oss.gvt.com.DataNotFoundException;
import exception.ossturbonet.oss.gvt.com.OSSTurbonetException;
import model.banda.BandaServico;
import model.cliente.ClienteServico;
import model.linha.LinhaServico;
import util.JSFUtil;

@ManagedBean
public class OperacionalBean {

	private Cliente cliente;

	private LinhaServico servicoLinha;

	private BandaServico servicoBanda;

	private ClienteServico servicoCliente;

	public OperacionalBean() {
		this.cliente = new Cliente();
		this.servicoLinha = new LinhaServico();
		this.servicoBanda = new BandaServico();
		this.servicoCliente = new ClienteServico();
	}

	public void consultar(){

		try {

			String instancia = this.cliente.getInstancia();

			// Aciona método para obter designador
			String designador = this.servicoBanda.getDesignatorByAccessDesignator(instancia);	

			this.cliente.setDesignador(designador);	

			this.cliente = this.servicoCliente.consultar(this.cliente);

			this.cliente.setLinha(this.servicoLinha.consultar(this.cliente.getInstancia()));

		} catch (DataNotFoundException e) {
			JSFUtil.addErrorMessage(e.getMessage());
		} catch (OSSTurbonetException e) {
			JSFUtil.addErrorMessage("Designador não encontrado!");
		} catch (RemoteException e) {
			JSFUtil.addErrorMessage("oi.");
		} catch (IOException e) {
			JSFUtil.addErrorMessage(e.getMessage());
		} catch (Exception e) {
			JSFUtil.addErrorMessage("Instância não encontrada!");

		}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
