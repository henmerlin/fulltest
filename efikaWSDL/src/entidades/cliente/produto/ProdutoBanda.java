package entidades.cliente.produto;

public class ProdutoBanda extends Produto{
	
	private String downloadCrm;
	
	private String uploadCrm;
	
	public ProdutoBanda() {

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
