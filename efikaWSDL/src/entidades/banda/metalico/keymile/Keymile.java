package entidades.banda.metalico.keymile;

import entidades.banda.Banda;
import entidades.banda.BandaInterface;
import entidades.banda.metalico.keymile.configs.Srvc;
import entidades.banda.metalico.keymile.configs.Vcc;

public class Keymile extends Banda implements BandaInterface{
		
	private Vcc autenticacao;
	
	private Vcc voip;
	
	private Vcc video;
	
	private Vcc multitela;
	

	public Keymile() {
		
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


	public Vcc getMultitela() {
		return multitela;
	}


	public void setMultitela(Vcc multitela) {
		this.multitela = multitela;
	}

}
