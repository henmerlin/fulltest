package entidades.linha;

import java.util.List;

import entidades.parametros.Configuracao;

public interface LinhaInterface {
	
	public String getInstancia();
	
	public void setInstancia(String instancia);
	
	public String getNome();
	
	public List<Configuracao> getConfiguracoes();

	public void setConfiguracoes(List<Configuracao> configuracoes);
	
		
}
