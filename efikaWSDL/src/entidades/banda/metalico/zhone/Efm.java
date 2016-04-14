package entidades.banda.metalico.zhone;

import entidades.banda.metalico.zhone.configs.Bridge;

public class Efm extends Zhone {

	
	private Bridge autenticacao;

	private Bridge voip;

	private Bridge tv;

	private Bridge multicast;


	public Efm() {

	}


	public Bridge getAutenticacao() {
		return autenticacao;
	}


	public void setAutenticacao(Bridge autenticacao) {
		this.autenticacao = autenticacao;
	}


	public Bridge getVoip() {
		return voip;
	}


	public void setVoip(Bridge voip) {
		this.voip = voip;
	}


	public Bridge getTv() {
		return tv;
	}


	public void setTv(Bridge tv) {
		this.tv = tv;
	}


	public Bridge getMulticast() {
		return multicast;
	}


	public void setMulticast(Bridge multicast) {
		this.multicast = multicast;
	}

}
