package model.banda.metalico;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;

public abstract class DslamMetalico extends DslamGerenciavel{

	private GetInfoOut tbs;
	
	public DslamMetalico() {
		// TODO Auto-generated constructor stub
	}

	public GetInfoOut getTbs() {
		return tbs;
	}

	public void setTbs(GetInfoOut tbs) {
		this.tbs = tbs;
	}
}
