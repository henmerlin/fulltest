package entidades.banda.metalico.keymile;

import entidades.banda.Banda;
import entidades.banda.BandaInterface;
import entidades.banda.metalico.keymile.configs.Srvc;
import entidades.banda.metalico.keymile.configs.Vcc;

public class Keymile extends Banda implements BandaInterface{
	
	private Srvc autenticacao;
	
	private Srvc voip;
	
	private Srvc video;
	
	private Srvc multitela;
	
	private Vcc autenticacao_vcc;
	
	private Vcc voip_vcc;
	
	private Vcc video_vcc;
	
	private Vcc multitela_vcc;
	
	
	public Keymile() {
		
	}


	public Srvc getAutenticacao() {
		return autenticacao;
	}

	public void setAutenticacao(Srvc autenticacao) {
		this.autenticacao = autenticacao;
	}


	public Srvc getVoip() {
		return voip;
	}


	public void setVoip(Srvc voip) {
		this.voip = voip;
	}


	public Srvc getVideo() {
		return video;
	}


	public void setVideo(Srvc video) {
		this.video = video;
	}


	public Srvc getMultitela() {
		return multitela;
	}


	public void setMultitela(Srvc multitela) {
		this.multitela = multitela;
	}


	public Vcc getAutenticacao_vcc() {
		return autenticacao_vcc;
	}


	public void setAutenticacao_vcc(Vcc autenticacao_vcc) {
		this.autenticacao_vcc = autenticacao_vcc;
	}


	public Vcc getVoip_vcc() {
		return voip_vcc;
	}


	public void setVoip_vcc(Vcc voip_vcc) {
		this.voip_vcc = voip_vcc;
	}


	public Vcc getVideo_vcc() {
		return video_vcc;
	}


	public void setVideo_vcc(Vcc video_vcc) {
		this.video_vcc = video_vcc;
	}


	public Vcc getMultitela_vcc() {
		return multitela_vcc;
	}


	public void setMultitela_vcc(Vcc multitela_vcc) {
		this.multitela_vcc = multitela_vcc;
	}
}
