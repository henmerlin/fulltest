package entidades.banda.metalico.keymile.configs;

public class Vcc {
	
	private Integer seq;
	
	private Srvc service;
	
	private String macSourceFilteringMode;
	
	public Vcc() {
	
	}

	public Vcc(Integer seq, Srvc service, String macSourceFilteringMode) {
		super();
		this.seq = seq;
		this.service = service;
		this.macSourceFilteringMode = macSourceFilteringMode;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Srvc getService() {
		return service;
	}

	public void setService(Srvc service) {
		this.service = service;
	}

	public String getMacSourceFilteringMode() {
		return macSourceFilteringMode;
	}

	public void setMacSourceFilteringMode(String macSourceFilteringMode) {
		this.macSourceFilteringMode = macSourceFilteringMode;
	}
}
