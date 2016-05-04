package controllers.operacional;

import java.io.Serializable;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import entidades.cliente.Cliente;
import model.modulos.OperacionalServico;
import util.JSFUtil;

@Named("operacionalBean")
@ViewScoped
public class OperacionalBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Cliente cliente;	

	private OperacionalServico operacional;

	public OperacionalBean() {
		this.cliente = new Cliente();
		this.operacional = new OperacionalServico();
	}

	public void consultar(){
		try {
			System.out.println("Consultar");
			this.cliente = this.operacional.consultar(this.cliente);
		} catch (Exception e) {
			JSFUtil.addErrorMessage(e.getMessage());
		}
	}

	public void realizarCorrecoesLinha(){
		try {
			this.operacional.realizarCorrecoesLinha(this.cliente);
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
