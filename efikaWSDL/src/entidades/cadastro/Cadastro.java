package entidades.cadastro;

import bean.ossturbonet.oss.gvt.com.AccessInfo;
import bean.ossturbonet.oss.gvt.com.GetInfoOut;

public interface Cadastro {

	public GetInfoOut getCadastro();
	
	public AccessInfo getCadastroGpon();

	public void setCadastro(GetInfoOut cadastro);
	
	public Boolean isGpon();

}
