package model.linha.ims;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagementProxy;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPIn;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPOut;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ElementoDiagnosticoSIP;

import entidades.cliente.Cliente;
import entidades.parametros.Configuracao;
import model.linha.LinhaServicoInterface;

public class SipServico extends ImsServico implements LinhaServicoInterface {
	
	private ConfiguradorOnlineDeviceManagementProxy codService;
	
	public SipServico() {
		this.codService = new ConfiguradorOnlineDeviceManagementProxy();
	}
	
	public DiagnosticoSIPOut executarDiagnosticoSIP(String instancia, String designador) throws RemoteException {
		
		DiagnosticoSIPIn in = new DiagnosticoSIPIn();
		
		in.setInstancia(instancia);
		in.setDesignadorTurbonet(designador);
		in.getCredencial().setLogin("URA");
		in.getCredencial().setSistemaOrigem("URA");
		in.getCredencial().setUsername("URA");
		
		return this.codService.executarDiagnosticoSIP(in);
	}
	
	@Override
	public List<Configuracao> getConfiguracao(Cliente cliente) throws RemoteException {
		
		DiagnosticoSIPOut diag = this.executarDiagnosticoSIP(cliente.getInstancia(), cliente.getDesignador());
		
		ElementoDiagnosticoSIP modem = diag.getHomegateway();
		
		List<Configuracao> retorno = new ArrayList<Configuracao>();
	
		Configuracao conf = new Configuracao();
		conf.setNome("Tipo Modem");
		conf.setValor(modem.getTipo());
		retorno.add(conf);
		
		conf.setNome("Mac Address");
		conf.setValor(modem.getMacAddress());
		retorno.add(conf);		
		
		
		conf.setNome("CPE");
		conf.setValor(modem.getStatusCPE());
		retorno.add(conf);		
		
		return retorno;
	}

}
