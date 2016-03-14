package entidades.cliente;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import entidades.banda.BandaInterface;
import entidades.linha.LinhaInterface;

public class Cliente {
	
	@NotEmpty
	@Length(min=10, max=12, message="Instância inválida!")
	private String instancia;
	
	private String designador;
	
	private String downloadCrm;
	
	private String uploadCrm;
	
	private LinhaInterface linha;

	private BandaInterface banda;

	public Cliente() {
		
	}

	public String getInstancia() {
		return instancia;
	}

	public void setInstancia(String instancia) {
		this.instancia = instancia;
	}
	public BandaInterface getBanda() {
		return banda;
	}

	public void setBanda(BandaInterface banda) {
		this.banda = banda;
	}

	public LinhaInterface getLinha() {
		return linha;
	}

	public void setLinha(LinhaInterface linha) {
		this.linha = linha;
	}

	public String getDesignador() {
		return designador;
	}

	public void setDesignador(String designador) {
		this.designador = designador;
	}

	public String getDownloadCrm() {
		return downloadCrm;
	}

	public void setDownloadCrm(String downloadCrm) {
		this.downloadCrm = downloadCrm;
	}

	public String getUploadCrm() {
		return uploadCrm;
	}

	public void setUploadCrm(String uploadCrm) {
		this.uploadCrm = uploadCrm;
	}
}
