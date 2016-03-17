package entidades.configuracoes;

import java.util.ArrayList;
import java.util.List;

public class ConfiguracaoSip implements ConfiguracaoLinha{

	private Parametro serialNumber;

	private Parametro tipo;

	private Parametro mac;

	private Parametro statusCpe;

	private Parametro status;

	private Parametro dn;

	private Parametro authUser;

	private Parametro outboundProxy;

	private Parametro proxyServer;

	private Parametro registrarServer;

	private Parametro userAgentDomain;

	private Parametro ipAddress;

	public ConfiguracaoSip() {

	}

	public List<Parametro> getParametros(){

		ArrayList<Parametro> retorno = new ArrayList<Parametro>();

		if(serialNumber != null){
			retorno.add(serialNumber);
		}
		
		retorno.add(tipo);
		retorno.add(mac);
		retorno.add(statusCpe);
		retorno.add(status);
		retorno.add(dn);
		retorno.add(authUser);
		retorno.add(outboundProxy);
		retorno.add(proxyServer);
		retorno.add(registrarServer);
		retorno.add(userAgentDomain);
		retorno.add(ipAddress);

		return retorno;
	}

	public Parametro getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Parametro serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Parametro getTipo() {
		return tipo;
	}

	public void setTipo(Parametro tipo) {
		this.tipo = tipo;
	}

	public Parametro getMac() {
		return mac;
	}

	public void setMac(Parametro mac) {
		this.mac = mac;
	}

	public Parametro getStatusCpe() {
		return statusCpe;
	}

	public void setStatusCpe(Parametro statusCpe) {
		this.statusCpe = statusCpe;
	}

	public Parametro getStatus() {
		return status;
	}

	public void setStatus(Parametro status) {
		this.status = status;
	}

	public Parametro getDn() {
		return dn;
	}

	public void setDn(Parametro dn) {
		this.dn = dn;
	}

	public Parametro getAuthUser() {
		return authUser;
	}

	public void setAuthUser(Parametro authUser) {
		this.authUser = authUser;
	}

	public Parametro getOutboundProxy() {
		return outboundProxy;
	}

	public void setOutboundProxy(Parametro outboundProxy) {
		this.outboundProxy = outboundProxy;
	}

	public Parametro getProxyServer() {
		return proxyServer;
	}

	public void setProxyServer(Parametro proxyServer) {
		this.proxyServer = proxyServer;
	}

	public Parametro getRegistrarServer() {
		return registrarServer;
	}

	public void setRegistrarServer(Parametro registrarServer) {
		this.registrarServer = registrarServer;
	}

	public Parametro getUserAgentDomain() {
		return userAgentDomain;
	}

	public void setUserAgentDomain(Parametro userAgentDomain) {
		this.userAgentDomain = userAgentDomain;
	}

	public Parametro getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(Parametro ipAddress) {
		this.ipAddress = ipAddress;
	}
}
