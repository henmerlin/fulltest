package controllers.operacional;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import controllers.LoginBean;
import entidades.cliente.Cliente;
import entidades.log.Consulta;
import entidades.log.ErroConsulta;
import model.modulos.LogServico;
import model.modulos.OperacionalServico;
import util.JSFUtil;

@Named("operacionalBean")
@ViewScoped
public class OperacionalBean implements Serializable {

	private static final long serialVersionUID = 8013724459314458226L;

	private Cliente cliente;

	private OperacionalServico operacional;

	@EJB
	private LogServico log;

	@Inject
	private LoginBean sessao;

	public OperacionalBean() {
		this.cliente = new Cliente();
		this.operacional = new OperacionalServico();
		this.log = new LogServico();
	}

	public void consultar() {
		
		this.cliente.setLinha(null);
		this.cliente.setBanda(null);
		
		try {
			// Log
			this.log.log(new Consulta(this.cliente.getInstancia(), this.sessao.getUsuario().getLogin()));
			// Inicio do fluxo de consulta
			this.cliente = this.operacional.consultar(this.cliente);

		} catch (Exception e) {
			JSFUtil.addErrorMessage(e.getMessage());
			this.log.log(
					new ErroConsulta(this.cliente.getInstancia(), this.sessao.getUsuario().getLogin(), e.getMessage()));
		}
	}

	public void realizarCorrecoesLinha() {
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

	public OperacionalServico getOperacional() {
		return operacional;
	}

	public void setOperacional(OperacionalServico operacional) {
		this.operacional = operacional;
	}

	public LoginBean getSessao() {
		return sessao;
	}

	public void setSessao(LoginBean sessao) {
		this.sessao = sessao;
	}
}
