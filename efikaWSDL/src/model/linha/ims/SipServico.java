package model.linha.ims;

import java.rmi.RemoteException;

import com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagementProxy;
import com.gvt.www.metaData.smarttool.Credenciais;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIP;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPIn;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPOut;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ElementoDiagnosticoSIP;

import br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam;
import entidades.cliente.Cliente;
import entidades.configuracoes.ConfiguracaoSip;
import entidades.configuracoes.Parametro;
import model.linha.LinhaServicoInterface;

/**
 * Instância de exemplo:
 * 4133280564 - Rafael
 * @author G0042204
 *
 */
public class SipServico extends ImsServico implements LinhaServicoInterface {

	private ConfiguradorOnlineDeviceManagementProxy codService;

	public SipServico() {
		this.codService = new ConfiguradorOnlineDeviceManagementProxy();
	}

	public DiagnosticoSIPOut executarDiagnosticoSIP(String instancia, String designador) throws RemoteException {

		DiagnosticoSIPIn in = new DiagnosticoSIPIn();

		Credenciais credencial = new Credenciais("URA", "URA", "URA");

		in.setInstancia(instancia);
		in.setDesignadorTurbonet(designador);
		in.setCredencial(credencial);
		
		return this.codService.executarDiagnosticoSIP(in);
	}

	@Override
	public Cliente consultar(Cliente cliente) throws Exception {
		
		cliente = super.consultar(cliente);

		DiagnosticoSIPOut diag = this.executarDiagnosticoSIP(cliente.getInstancia(), cliente.getDesignador());

		ElementoDiagnosticoSIP device = diag.getHomegateway();

		ConfiguracaoSip config = new ConfiguracaoSip();

		config.setTipo(new Parametro("Tipo", device.getTipo()));
		config.setSerialNumber(new Parametro("Serial Number", device.getSerialNumber()));
		config.setMac(new Parametro("Mac Address", device.getMacAddress()));
		config.setStatusCpe(new Parametro("CPE Status", device.getStatusCPE()));
				
		if(diag.getCodigo() == 0){

			DiagnosticoSIP[] diagSip = device.getDiagnosticosSIP();

			for (DiagnosticoSIP diagnosticoSIP : diagSip) {

				config.setDn(new Parametro("dn", diagnosticoSIP.getInstancia()));	

				DiagnosticoParam[] parametros = diagnosticoSIP.getParams();

				for (DiagnosticoParam param : parametros) {

					if(param.getNome().equalsIgnoreCase("AuthUserName")){
						config.setAuthUser(new Parametro("AuthUserName", param.getValor()));
					}

					if(param.getNome().equalsIgnoreCase("OutboundProxy")){
						config.setOutboundProxy(new Parametro("OutboundProxy", param.getValor()));
					}

					if(param.getNome().equalsIgnoreCase("UserAgentDomain")){
						config.setUserAgentDomain(new Parametro("UserAgentDomain", param.getValor()));
					}

					if(param.getNome().equalsIgnoreCase("RegistrarServer")){
						config.setRegistrarServer(new Parametro("RegistrarServer", param.getValor()));
					}	

					if(param.getNome().equalsIgnoreCase("ProxyServer")){
						config.setProxyServer(new Parametro("ProxyServer", param.getValor()));
					}					

					if(param.getNome().equalsIgnoreCase("Status")){
						config.setStatus(new Parametro("Status", param.getValor()));
					}		

					if(param.getNome().equalsIgnoreCase("IPAddress")){
						config.setIpAddress(new Parametro("IPAddress", param.getValor()));
					}	
				}
			}
		}

		cliente.getLinha().setConfiguracao(config);
		
		return cliente;
	}

	@Override
	public Cliente getConfiguracao(Cliente cliente) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
}
