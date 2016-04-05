package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import entidades.cliente.Cliente;
import model.modulos.OperacionalServico;
import util.JSFUtil;

@ViewScoped
@ManagedBean
public class OperacionalBean {

	private Cliente cliente;	

	private OperacionalServico operacional;
		
	
	public OperacionalBean() {
		this.cliente = new Cliente();
		this.operacional = new OperacionalServico();
	}

	public void consultar(){
				
		try {
			this.cliente = this.operacional.consultar(this.cliente);
		} catch (Exception e) {
			JSFUtil.addErrorMessage(e.getMessage());
		}
	}
	
	public void realizarCorrecoes(){

		try {
			this.cliente = this.operacional.realizarCorrecoes(this.cliente);
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
