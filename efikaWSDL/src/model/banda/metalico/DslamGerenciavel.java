package model.banda.metalico;

import java.io.IOException;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.cadastro.Cadastro;
import model.telnet.SocketClass;
import model.telnet.Telnet;

public abstract class DslamGerenciavel {
	
	private Telnet telnet;
	
	private SocketClass socket;
	
	private Cadastro cadastro;

	public DslamGerenciavel() {
		this.telnet = new Telnet();
		this.socket = new SocketClass();
	}
		

	public Telnet getTelnet() {
		return telnet;
	}

	public void setTelnet(Telnet telnet) {
		this.telnet = telnet;
	}
	
	public SocketClass getSocket() {
		return socket;
	}

	public void setSocket(SocketClass socket) {
		this.socket = socket;
	}
	
	public InfoTBS getTbs() {
		return this.getCadastro().getCadastro().getInfoTBS();
	}

	public GetInfoOut getGetInfo() {
		return this.getCadastro().getCadastro();
	}
	
	public void disconnect() throws IOException{
		this.getSocket().disconnect();
	}
	
	public void connect() throws Exception{
		this.getSocket().setIp(this.getTbs().getIpDslam());
		this.getSocket().init();
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}	
	
}
