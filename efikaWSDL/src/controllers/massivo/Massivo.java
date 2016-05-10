package controllers.massivo;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import controllers.LoginBean;
import model.massivo.MassivoServico;
import util.JSFUtil;

@ManagedBean
@ViewScoped
public class Massivo implements Serializable{
	
	private static final long serialVersionUID = 1790902486343207456L;

	@Inject
	private LoginBean sessao;
	
	@EJB
	private MassivoServico massivoServico;

	public Massivo() {

	}	
	
	public void uploadFile(FileUploadEvent event) {
		
		UploadedFile file = event.getFile();
		
		try {
			
			this.massivoServico.salvaLote(file, sessao.getUsuario());
			
		} catch (Exception e) {
			
			JSFUtil.addErrorMessage(e.getMessage());
			
		}
		
	}
	
	public LoginBean getSessao() {
		return sessao;
	}
	
	public void setSessao(LoginBean sessao) {
		this.sessao = sessao;
	}

}
