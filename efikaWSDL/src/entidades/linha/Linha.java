package entidades.linha;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.GetInformacoesInstanciaOut;

import br.com.gvt.www.eai.NumberInventoryServicesWS.GetNumberByFilterOut;
import entidades.configuracoes.ConfiguracaoLinha;
import entidades.correcao.AcaoCorretiva;

public class Linha{
	
	@NotEmpty
	private String instancia;
	
	private String tecnologia;
	
	private ConfiguracaoLinha configuracao;
	
	private GetNumberByFilterOut infoSwitch;
	
	private GetInformacoesInstanciaOut infoInstancia;
	
	private List<String> configErrors;
	
	private List<AcaoCorretiva> correcoes;

		
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

	public List<String> getConfigErrors() {
		return configErrors;
	}

	public void setConfigErrors(List<String> configErrors) {
		this.configErrors = configErrors;
	}

	public List<AcaoCorretiva> getCorrecoes() {
		return correcoes;
	}

	public void setCorrecoes(List<AcaoCorretiva> correcoes) {
		this.correcoes = correcoes;
	}	
}
