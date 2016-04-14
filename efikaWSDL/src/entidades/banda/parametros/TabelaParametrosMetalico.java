package entidades.banda.parametros;

import java.util.ArrayList;
import java.util.List;

import entidades.parametros.Parametro;

public class TabelaParametrosMetalico extends TabelaParametros implements TabelaParametrosInter{
	
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
	public Parametro getParam(int index) {
		return this.getParametros().get(index);
	}
	
	
	@Override
	public void listarParametros() {
		
		List<Parametro> param = new ArrayList<Parametro>();
		
		param.add(new Parametro("Download", this.download.toString()));
		param.add(new Parametro("Upload", this.upload.toString()));
		param.add(new Parametro("Modulação", this.modulacao.toString()));
		param.add(new Parametro("Sinal Ruído Download", this.snrDown.toString()));
		param.add(new Parametro("Atenuação Download", this.atnDown.toString()));
		param.add(new Parametro("Atenuação Upload", this.atnUp.toString()));
		
		this.setParametros(param);
				
	}

	@Override
	public TabelaParametrosMetalico getTabelaMetalico() {
		return this;
	}

	@Override
	public TabelaParametrosMetalicoVdsl getTabelaMetalicoVdsl() {
		//throw new Exception("Não foi possivel exibir a tabela de parâmetros");
		return null;
	}

	@Override
	public TabelaParametrosGpon getTabelaParametrosGpon() {
		// TODO Auto-generated method stub
		return null;
	}	

}
