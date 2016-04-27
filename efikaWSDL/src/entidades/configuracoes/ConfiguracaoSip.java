package entidades.configuracoes;

import java.util.ArrayList;
import java.util.List;

import entidades.parametros.Parametro;

public class ConfiguracaoSip extends ConfiguracaolIms implements ConfiguracaoLinha{
	
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
	
	private PortaFxs fxs;
	
	public ConfiguracaoSip() {

	}

	public List<Parametro> getParametros(){

		ArrayList<Parametro> retorno = new ArrayList<Parametro>();

		retorno.add(this.getRegistro());
		
		if(serialNumber != null){
			retorno.add(serialNumber);
		}
		
		if(mac != null){
			retorno.add(mac);
		}
		
		if(tipo != null){
			retorno.add(tipo);
		}
		
		if(statusCpe != null){
			retorno.add(statusCpe);
		}
		
		if(status != null){
			retorno.add(status);
		}
		
		if(dn != null){
			retorno.add(dn);
		}
		
		if(authUser != null){
			retorno.add(authUser);
		}
		
		if(outboundProxy != null){
			retorno.add(outboundProxy);
		}
		
		if(proxyServer != null){
			retorno.add(proxyServer);
		}
		
		if(registrarServer != null){
			retorno.add(registrarServer);
		}
		
		if(userAgentDomain != null){
			retorno.add(userAgentDomain);
		}
		
		if(ipAddress != null){
			retorno.add(ipAddress);
		}			

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

	public PortaFxs getFxs() {
		return fxs;
	}

	public void setFxs(PortaFxs fxs) {
		this.fxs = fxs;
	}
}
