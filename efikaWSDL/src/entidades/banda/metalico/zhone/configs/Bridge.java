package entidades.banda.metalico.zhone.configs;

public class Bridge {
	
	private String slot;
	
	private String port;
	
	private String endSeqPort;
		
	private String vc;
	
	private String rin;
	
	public Bridge() {
		
	}	

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getEndSeqPort() {
		return endSeqPort;
	}

	public void setEndSeqPort(String endSeqPort) {
		this.endSeqPort = endSeqPort;
	}

	public String getRin() {
		return rin;
	}

	public void setRin(String rin) {
		this.rin = rin;
	}

	public String getVc() {
		return vc;
	}

	public void setVc(String vc) {
		this.vc = vc;
	}

}
