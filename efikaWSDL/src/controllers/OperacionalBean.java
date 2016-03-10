package controllers;

import javax.faces.bean.ManagedBean;

import entidades.Cliente;
import model.modulos.OperacionalServico;

@ManagedBean
public class OperacionalBean {

	private Cliente cliente;
	
	private OperacionalServico servico;

	public OperacionalBean() {
		this.cliente = new Cliente();
		this.servico = new OperacionalServico();
	}

	public void consultar(){
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
