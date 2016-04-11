package entidades.configuracoes;

import java.util.ArrayList;
import java.util.List;

import entidades.parametros.Parametro;

public class PortaFxs implements ConfiguracaoLinha{
	
	private Integer id;
	
	private Parametro status;
	
	private Parametro instancia;
	
	private Parametro porta;
	
	private Parametro proxyServerIp;
	
	private Parametro outboundProxyIp;

	private Parametro userAgentDomain;
	
	private Parametro registraServer;

	public PortaFxs() {
	
	}
	
	@Override
	public List<Parametro> getParametros() {
		
		ArrayList<Parametro> conf = new ArrayList<Parametro>();
		
		conf.add(status);
		conf.add(instancia);
		conf.add(porta);
		conf.add(proxyServerIp);
		conf.add(outboundProxyIp);
		conf.add(userAgentDomain);
		conf.add(registraServer);
		
		return conf;
	}
	

	public Parametro getInstancia() {
		return instancia;
	}

	public void setInstancia(Parametro instancia) {
		this.instancia = instancia;
	}

	public Parametro getPorta() {
		return porta;
	}

	public void setPorta(Parametro porta) {
		this.porta = porta;
	}

	public Parametro getProxyServerIp() {
		return proxyServerIp;
	}

	public void setProxyServerIp(Parametro proxyServerIp) {
		this.proxyServerIp = proxyServerIp;
	}

	public Parametro getOutboundProxyIp() {
		return outboundProxyIp;
	}

	public void setOutboundProxyIp(Parametro outboundProxyIp) {
		this.outboundProxyIp = outboundProxyIp;
	}

	public Parametro getUserAgentDomain() {
		return userAgentDomain;
	}

	public void setUserAgentDomain(Parametro userAgentDomain) {
		this.userAgentDomain = userAgentDomain;
	}

	public Parametro getRegistraServer() {
		return registraServer;
	}

	public void setRegistraServer(Parametro registraServer) {
		this.registraServer = registraServer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer integer) {
		this.id = integer;
	}

	public Parametro getStatus() {
		return status;
	}

	public void setStatus(Parametro status) {
		this.status = status;
	}

}
