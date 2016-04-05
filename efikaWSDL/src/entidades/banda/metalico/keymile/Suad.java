package entidades.banda.metalico.keymile;

import entidades.banda.metalico.keymile.configs.Vcc;

public class Suad extends Keymile {
	
	private Vcc autenticacao;
	
	private Vcc voip;
	
	private Vcc video;
	
	private Vcc multicast;

	public Suad() {
		
	}

	public Vcc getAutenticacao() {
		return autenticacao;
	}

	public void setAutenticacao(Vcc autenticacao) {
		this.autenticacao = autenticacao;
	}

	public Vcc getVoip() {
		return voip;
	}

	public void setVoip(Vcc voip) {
		this.voip = voip;
	}

	public Vcc getVideo() {
		return video;
	}

	public void setVideo(Vcc video) {
		this.video = video;
	}

	public Vcc getMulticast() {
		return multicast;
	}

	public void setMulticast(Vcc multicast) {
		this.multicast = multicast;
	}
	
}
