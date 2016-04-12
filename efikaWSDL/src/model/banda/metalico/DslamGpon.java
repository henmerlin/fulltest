package model.banda.metalico;

import bean.ossturbonet.oss.gvt.com.AccessInfo;

public abstract class DslamGpon extends DslamGerenciavel{

	private AccessInfo acessInfo;
	
	public DslamGpon() {
		acessInfo = new AccessInfo();
	}

	public AccessInfo getAcessInfo() {
		return acessInfo;
	}

	public void setAcessInfo(AccessInfo acessInfo) {
		this.acessInfo = acessInfo;
	}
	
}
