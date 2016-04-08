package entidades.cadastro;

import bean.ossturbonet.oss.gvt.com.AccessInfo;

public class CadastroGpon extends CadastroMetalico implements Cadastro{

	private AccessInfo cadastroGpon;

	public CadastroGpon() {

	}

	public AccessInfo getCadastroGpon() {
		return cadastroGpon;
	}

	public void setCadastroGpon(AccessInfo cadastroGpon) {
		this.cadastroGpon = cadastroGpon;
	}
}
