package entidades.banda.metalico.keymile.configs;

public class Srvc {
		
	private String cvid;
	
	private String cTagPriority;
	
	private String svid;
	
	private String sTagPriority;
	
	private String vlanHandling;
	
	private String srvc;
	
	public Srvc() {

	}
	
	public Srvc(String cvid, String cTagPriority, String svid, String sTagPriority, String vlanHandling, String srvc) {
		super();
		this.cvid = cvid;
		this.cTagPriority = cTagPriority;
		this.svid = svid;
		this.sTagPriority = sTagPriority;
		this.vlanHandling = vlanHandling;
		this.srvc = srvc;
	}

	public String getCvid() {
		return cvid;
	}

	public void setCvid(String cvid) {
		this.cvid = cvid;
	}

	public String getcTagPriority() {
		return cTagPriority;
	}

	public void setcTagPriority(String cTagPriority) {
		this.cTagPriority = cTagPriority;
	}

	public String getSvid() {
		return svid;
	}

	public void setSvid(String svid) {
		this.svid = svid;
	}

	public String getsTagPriority() {
		return sTagPriority;
	}

	public void setsTagPriority(String sTagPriority) {
		this.sTagPriority = sTagPriority;
	}

	public String getVlanHandling() {
		return vlanHandling;
	}

	public void setVlanHandling(String vlanHandling) {
		this.vlanHandling = vlanHandling;
	}

	public String getSrvc() {
		return srvc;
	}

	public void setSrvc(String srvc) {
		this.srvc = srvc;
	}
}
