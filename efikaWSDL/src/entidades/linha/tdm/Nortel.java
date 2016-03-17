package entidades.linha.tdm;

import entidades.configuracoes.ConfiguracaoLinha;
import entidades.linha.Linha;
import entidades.linha.LinhaInterface;

/**
 * Instância de exemplo:
 * 4130222839 - Henrique
 * @category Entidades
 * @author g0042204
 */
public class Nortel extends Linha implements LinhaInterface{
	
	private String dn;
	
	private String len;
	
	private Integer ncos;
	
	private String custGroup;

	public Nortel() {
		
	}
	

	public String getDn() {
		return dn;
	}

	public void setDn(String dn) {
		this.dn = dn;
	}

	public String getLen() {
		return len;
	}

	public void setLen(String len) {
		this.len = len;
	}

	public Integer getNcos() {
		return ncos;
	}

	public void setNcos(Integer ncos) {
		this.ncos = ncos;
	}

	public String getCustGroup() {
		return custGroup;
	}

	public void setCustGroup(String custGroup) {
		this.custGroup = custGroup;
	}
	
	@Override
	public String getNome() {
		return "TDM-H248";
	}


	@Override
	public ConfiguracaoLinha getConfiguracao() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setConfiguracao(ConfiguracaoLinha configuracao) {
		// TODO Auto-generated method stub
		
	}
}
