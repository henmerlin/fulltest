package entidades.linha;


import entidades.configuracoes.ConfiguracaoLinha;

public interface LinhaInterface {
	
	public String getInstancia();
	
	public void setInstancia(String instancia);
	
	public String getNome();
	
	public String getTecnologia();

	public void setTecnologia(String tecnologia);
	
	public ConfiguracaoLinha getConfiguracao();

	public void setConfiguracao(ConfiguracaoLinha configuracao);

}
