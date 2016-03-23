package entidades.linha;

import org.hibernate.validator.constraints.NotEmpty;

import com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.GetInformacoesInstanciaOut;

import br.com.gvt.www.eai.NumberInventoryServicesWS.GetNumberByFilterOut;
import entidades.configuracoes.ConfiguracaoLinha;

public class Linha{
	
	@NotEmpty
	private String instancia;
	
	private String tecnologia;
	
	private ConfiguracaoLinha configuracao;
	
	private GetNumberByFilterOut infoSwitch;
	
	private GetInformacoesInstanciaOut infoInstancia;
		
	public Linha() {

	}
	
	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	public String getInstancia() {
		return instancia;
	}


	public void setInstancia(String instancia) {
		this.instancia = instancia;
	}

	public ConfiguracaoLinha getConfiguracao() {
		return configuracao;
	}

	public void setConfiguracao(ConfiguracaoLinha configuracao) {
		this.configuracao = configuracao;
	}

	public GetNumberByFilterOut getInfoSwitch() {
		return infoSwitch;
	}

	public void setInfoSwitch(GetNumberByFilterOut infoSwitch) {
		this.infoSwitch = infoSwitch;
	}

	public GetInformacoesInstanciaOut getInfoInstancia() {
		return infoInstancia;
	}

	public void setInfoInstancia(GetInformacoesInstanciaOut infoInstancia) {
		this.infoInstancia = infoInstancia;
	}	
}
