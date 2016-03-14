package controllers;

import javax.faces.bean.ManagedBean;

import entidades.cliente.Cliente;
import model.modulos.OperacionalServico;
import util.JSFUtil;

@ManagedBean
public class OperacionalBean {

	private Cliente cliente;
	
	private OperacionalServico servico;

	public OperacionalBean() {
		this.cliente = new Cliente();
		this.servico = new OperacionalServico();
	}

	public void consultar(){
		
		
		try {
			this.cliente.setLinha(this.servico.construirLinha(this.cliente.getInstancia()));
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
