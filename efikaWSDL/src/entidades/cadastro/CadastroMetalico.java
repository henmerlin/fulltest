package entidades.cadastro;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;

public class CadastroMetalico implements Cadastro{

	private GetInfoOut cadastro;
	
	public CadastroMetalico() {

	}

	public GetInfoOut getCadastro() {
		return cadastro;
	}

	public void setCadastro(GetInfoOut cadastro) {
		this.cadastro = cadastro;
	}

	@Override
	public Boolean isGpon() {
		
		if (this instanceof CadastroGpon) {
			return true;
		}
		
		return false;
	}
}
