package controllers;

import javax.faces.bean.ManagedBean;

import entidades.cliente.Cliente;
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
			String designador = this.servicoBanda.getDesignatorByAccessDesignator(instancia);			
			this.cliente.setDesignador(designador);
			this.cliente = this.servicoCliente.consultar(this.cliente);
			this.cliente.setLinha(this.servicoLinha.consultar(this.cliente.getInstancia()));
			
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
