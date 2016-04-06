package entidades.banda.parametros;

public class TabelaParametrosMetalico extends TabelaParametros{
	
	private Double download;
	
	private Double upload;
	
	private Double snrDown;
	
	private Double snrUp;
	
	private Double atnDown;
	
	private Double atnUp;
	
	private String modulacao;
		
	public TabelaParametrosMetalico() {

	}

	public Double getDownload() {
		return download;
	}

	public void setDownload(Double download) {
		this.download = download;
	}

	public Double getUpload() {
		return upload;
	}

	public void setUpload(Double upload) {
		this.upload = upload;
	}

	public Double getSnrDown() {
		return snrDown;
	}

	public void setSnrDown(Double snrDown) {
		this.snrDown = snrDown;
	}

	public Double getSnrUp() {
		return snrUp;
	}

	public void setSnrUp(Double snrUp) {
		this.snrUp = snrUp;
	}

	public Double getAtnDown() {
		return atnDown;
	}

	public void setAtnDown(Double atnDown) {
		this.atnDown = atnDown;
	}

	public Double getAtnUp() {
		return atnUp;
	}

	public void setAtnUp(Double atnUp) {
		this.atnUp = atnUp;
	}

	public String getModulacao() {
		return modulacao;
	}

	public void setModulacao(String modulacao) {
		this.modulacao = modulacao;
	}

	@Override
	public void listarParametros() {
		// TODO Auto-generated method stub
		
	}
}
