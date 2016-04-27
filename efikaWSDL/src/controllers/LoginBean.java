package controllers;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import model.modulos.UsuarioServico;
import util.JSFUtil;
import webservices.Usuario;

import java.io.IOException;
import java.io.Serializable;


@Named
@SessionScoped
public class LoginBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Usuario usuario;

	private Boolean logado;

	private UsuarioServico service;

	public LoginBean() {
		this.usuario = new Usuario();
		this.service = new UsuarioServico();
		this.logado = false;
	}

	public String validarLogin() {
		if (!this.logado){
			try {
				FacesContext.getCurrentInstance().getExternalContext().redirect("login.jsf");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;
	}

	public void logar() {

		try {		
			this.usuario = this.service.autenticaLogin(this.usuario.getLogin(), this.usuario.getSenha());
			this.logado = true;		
			FacesContext.getCurrentInstance().getExternalContext().redirect("index.jsf");

		} catch (Exception e) {
			JSFUtil.addErrorMessage(e.getMessage());
			this.usuario = new Usuario();
			this.logado = false;
		}

	} 

	public Usuario getUsuario() {
		return usuario;
	}
	
	public Boolean isAdmin(){
		
		return this.usuario.getNivel() > 7;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setLogado(Boolean logado) {
		this.logado = logado;
	}

	public Boolean getLogado(){
		return this.logado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public UsuarioServico getService() {
		return service;
	}

	public void setService(UsuarioServico service) {
		this.service = service;
	}
}
