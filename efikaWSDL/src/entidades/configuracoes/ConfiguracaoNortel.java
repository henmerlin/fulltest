package entidades.configuracoes;

import java.util.ArrayList;
import java.util.List;

public class ConfiguracaoNortel implements ConfiguracaoLinha{
	
	private Parametro custgroup;
	
	private Parametro ncos;
	
	private Parametro len;
	
	private List<Parametro> servicos;

	public ConfiguracaoNortel() {

	}

	public List<Parametro> getParametros(){

		ArrayList<Parametro> retorno = new ArrayList<Parametro>();

		retorno.add(custgroup);
		retorno.add(ncos);
		retorno.add(len);
		
		for (Parametro parametro : this.servicos) {
			retorno.add(parametro);
		}
		
		return retorno;
	}

	public Parametro getCustgroup() {
		return custgroup;
	}

	public void setCustgroup(Parametro custgroup) {
		this.custgroup = custgroup;
	}

	public Parametro getNcos() {
		return ncos;
	}

	public void setNcos(Parametro ncos) {
		this.ncos = ncos;
	}

	public Parametro getLen() {
		return len;
	}

	public void setLen(Parametro len) {
		this.len = len;
	}

	public List<Parametro> getServicos() {
		return servicos;
	}

	public void setServicos(List<Parametro> servicos) {
		this.servicos = servicos;
	}
}
