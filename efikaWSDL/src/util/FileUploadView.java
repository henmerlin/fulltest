package util;

import java.io.IOException;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import entidades.massivo.Lote;
import model.modulos.MassivoServico;

@ManagedBean
public class FileUploadView {
	
	@EJB
	private MassivoServico massivo;
	
	public FileUploadView() {
		this.massivo = new MassivoServico();
	}

	public void handleFileUpload(FileUploadEvent event) {
		
		UploadedFile file = event.getFile();
	
		try {
			
			Lote lote = this.massivo.criarLote(file);
			
			
			
			JSFUtil.addInfoMessage("Lote " + lote.getNome() + " carregado!");
						
		} catch (IOException e) {
			JSFUtil.addErrorMessage(e.getMessage());
		}
	}
}