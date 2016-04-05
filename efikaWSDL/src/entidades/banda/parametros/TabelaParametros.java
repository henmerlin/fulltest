package entidades.banda.parametros;

abstract class TabelaParametros{
	
	private String sincronismoStatus;
	
	private String portaAdmStatus;
	
	private String profile;
	
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
}
