package entidades.configuracoes;

public class ModemSip {
	
	private String serialNumber;
	
	private String tipo;
	
	private String mac;
	
	private String statusCpe;
	
	private String status;
	
	private String dn;
	
	private String authUser;
	
	private String outboundProxy;
	
	private String proxyServer;
	
	private String registrarServer;

	private String userAgentDomain;
	
	private String ipAddress;
	
	public ModemSip() {

	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getDn() {
		return dn;
	}

	public void setDn(String dn) {
		this.dn = dn;
	}

	public String getAuthUser() {
		return authUser;
	}

	public void setAuthUser(String authUser) {
		this.authUser = authUser;
	}

	public String getOutboundProxy() {
		return outboundProxy;
	}

	public void setOutboundProxy(String outboundProxy) {
		this.outboundProxy = outboundProxy;
	}

	public String getProxyServer() {
		return proxyServer;
	}

	public void setProxyServer(String proxyServer) {
		this.proxyServer = proxyServer;
	}

	public String getRegistrarServer() {
		return registrarServer;
	}

	public void setRegistrarServer(String registrarServer) {
		this.registrarServer = registrarServer;
	}

	public String getUserAgentDomain() {
		return userAgentDomain;
	}

	public void setUserAgentDomain(String userAgentDomain) {
		this.userAgentDomain = userAgentDomain;
	}

	public String getStatusCpe() {
		return statusCpe;
	}

	public void setStatusCpe(String statusCpe) {
		this.statusCpe = statusCpe;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
}
