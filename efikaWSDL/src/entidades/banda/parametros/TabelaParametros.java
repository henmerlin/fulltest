package entidades.banda.parametros;

import java.util.List;

import entidades.parametros.Parametro;

abstract class TabelaParametros implements TabelaParametrosInter{
	
	private String sincronismoStatus;
	
	private String portaAdmStatus;
	
	private String profile;
	
	private List<Parametro> parametros;
	
	public TabelaParametros() {
		
	}
	
	public String getSincronismoStatus() {
		return sincronismoStatus;
	}

	public void setSincronismoStatus(String sincronismoStatus) {
		this.sincronismoStatus = sincronismoStatus;
	}

	public String getPortaAdmStatus() {
		return portaAdmStatus;
	}

	public void setPortaAdmStatus(String portaAdmStatus) {
		this.portaAdmStatus = portaAdmStatus;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public List<Parametro> getParametros() {
		return parametros;
	}

	public void setParametros(List<Parametro> parametros) {
		this.parametros = parametros;
	}
	
	@Override
	public Parametro getParam(int index) {
		return this.parametros.get(index);
	}
	
	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}
}
