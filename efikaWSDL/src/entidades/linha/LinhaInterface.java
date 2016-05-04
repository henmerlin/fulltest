package entidades.linha;


import java.util.List;
import com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.GetInformacoesInstanciaOut;
import br.com.gvt.www.eai.NumberInventoryServicesWS.GetNumberByFilterOut;
import entidades.configuracoes.ConfiguracaoLinha;

public interface LinhaInterface {
	
	public String getInstancia();
	
	public void setInstancia(String instancia);
	
	public String getNome();
	
	public String getTecnologia();

	public void setTecnologia(String tecnologia);
	
	public ConfiguracaoLinha getConfiguracao();

	public void setConfiguracao(ConfiguracaoLinha configuracao);
	
	public GetNumberByFilterOut getInfoSwitch();
	
	public void setInfoSwitch(GetNumberByFilterOut infoSwitch);
	
	public GetInformacoesInstanciaOut getInfoInstancia();

	public void setInfoInstancia(GetInformacoesInstanciaOut infoInstancia);
	
	public List<String> getConfigErrors();
	
	public void setConfigErrors(List<String> erros);
	
	public List<String> getErrors();

	public void setErrors(List<String> errors);
}
