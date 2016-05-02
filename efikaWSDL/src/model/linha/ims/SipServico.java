package model.linha.ims;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineDeviceManagementProxy;
import com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServicesProxy;
import com.gvt.www.metaData.smarttool.Credenciais;
import com.gvt.www.services.consultarEquipamento.ConsultarEquipamentoIn;
import com.gvt.www.services.consultarEquipamento.ConsultarEquipamentoOut;
import com.gvt.www.services.model.portaFXS.PortaFXSWS;
import com.gvt.www.services.model.recursoLogico.RecursoLogicoWS;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.services.ConfigurarLinhaSIPnoCPEIn;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIP;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPIn;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.DiagnosticoSIPOut;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ElementoDiagnosticoSIP;
import com.gvt.www.ws.eai.configuradoronline.devicemanagement.sipdomain.ResetSIPAgentOut;

import br.com.gvt.telefonia.ura.co.services.ResendFxsIn;
import br.com.gvt.telefonia.ura.co.services.ResendFxsOut;
import br.com.gvt.telefonia.ura.co.services.SIPProxy;
import br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam;
import entidades.cliente.Cliente;
import entidades.configuracoes.ConfiguracaoSip;
import entidades.configuracoes.PortaFxs;
import entidades.parametros.Parametro;
import model.linha.LinhaServicoInterface;

/**
 * Instância de exemplo:
 * 4133280564 - Rafael
 * @author G0042204
 *
 */
public class SipServico extends ImsServico implements LinhaServicoInterface {

	private ConfiguradorOnlineDeviceManagementProxy codService;

	private ConfiguradorOnlineServicesProxy configOnline;

	private SIPProxy sip;

	public SipServico() {
		this.codService = new ConfiguradorOnlineDeviceManagementProxy();
		this.configOnline = new ConfiguradorOnlineServicesProxy();
		this.sip = new SIPProxy();
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
	public Cliente consultarConfiguracoes(Cliente cliente) throws Exception {

		try {
			cliente = super.consultarConfiguracoes(cliente);

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

					if(!diagnosticoSIP.getInstancia().isEmpty()){
						config.setDn(new Parametro("dn", diagnosticoSIP.getInstancia()));	
					}else{
						config.setDn(null);
					}


					DiagnosticoParam[] parametros = diagnosticoSIP.getParams();

					for (DiagnosticoParam param : parametros) {

						if(param.getNome().equalsIgnoreCase("AuthUserName")){

							if(param.getValor().isEmpty()){
								config.setAuthUser(null);
							}else{
								config.setAuthUser(new Parametro("AuthUserName", param.getValor()));
							}	
						}

						if(param.getNome().equalsIgnoreCase("OutboundProxy")){
							if(param.getValor().isEmpty()){
								config.setOutboundProxy(null);
							}else{
								config.setOutboundProxy(new Parametro("OutboundProxy", param.getValor()));
							}	
						}


						if(param.getNome().equalsIgnoreCase("UserAgentDomain")){
							if(param.getValor().isEmpty()){
								config.setUserAgentDomain(null);
							}else{
								config.setUserAgentDomain(new Parametro("UserAgentDomain", param.getValor()));
							}	
						}


						if(param.getNome().equalsIgnoreCase("RegistrarServer")){
							if(param.getValor().isEmpty()){
								config.setRegistrarServer(null);
							}else{
								config.setRegistrarServer(new Parametro("RegistrarServer", param.getValor()));
							}	
						}	

						if(param.getNome().equalsIgnoreCase("ProxyServer")){
							if(param.getValor().isEmpty()){
								config.setProxyServer(null);
							}else{
								config.setProxyServer(new Parametro("ProxyServer", param.getValor()));
							}
						}					

						if(param.getNome().equalsIgnoreCase("Status")){
							if(param.getValor().isEmpty()){
								config.setStatus(null);
							}else{
								config.setStatus(new Parametro("Status", param.getValor()));
							}
						}		

						if(param.getNome().equalsIgnoreCase("IPAddress")){
							if(param.getValor().isEmpty()){
								config.setIpAddress(null);
							}else{
								config.setIpAddress(new Parametro("IPAddress", param.getValor()));
							}
						}	
					}
				}
			}

			config.setRegistro(super.consultarRegistroCentral(cliente.getInstancia(), cliente.getLinha()));

			cliente.getLinha().setConfiguracao(config);

			return cliente;
			
		} catch (Exception e) {
			throw new Exception("Erro ao Consultar Configuracoes!" + e.getMessage());
		}
	}

	@Override
	public List<String> validarConfiguracoes(Cliente cliente) {

		List<String> erros = new ArrayList<String>();

		ConfiguracaoSip config = (ConfiguracaoSip) cliente.getLinha().getConfiguracao();

		if(config.getStatusCpe() != null){
			if (config.getStatusCpe().getValor().contains("Inativo")) {
				erros.add(new String("CPE inativo."));
			}			
		}

		if(config.getDn() != null){
			if (!config.getDn().getValor().trim().equalsIgnoreCase(cliente.getLinha().getInstancia().trim())) {
				erros.add(new String("Instância configurada incorretamente no modem."));
			}
		}

		if(config.getIpAddress() != null){
			if(config.getIpAddress().getValor().equalsIgnoreCase("0")){
				erros.add(new String("Sem ip de voz."));
			}			
		}

		if(config.getAuthUser() != null){
			if(config.getAuthUser().getValor().equalsIgnoreCase("0")){
				erros.add(new String("AuthUser configurado incorretamente."));
			}	
		}

		if(config.getProxyServer() != null){
			if(config.getProxyServer().getValor().equalsIgnoreCase("0")){
				erros.add(new String("ProxyServer configurado incorretamente."));
			}	
		}



		if(config.getOutboundProxy() != null){
			if(!config.getOutboundProxy().getValor().trim().equalsIgnoreCase("192.168.80.1")){
				erros.add(new String("OutboundProxy configurado incorretamente."));
			}			

		}

		if(config.getStatus() != null){
			if(!config.getStatus().getValor().equalsIgnoreCase("Up")){
				erros.add(new String("Status error."));
			}
		}

		return erros;
	}

	@Override
	public void realizarCorrecoes(Cliente cliente) throws Exception {

		ConfiguracaoSip config = (ConfiguracaoSip) cliente.getLinha().getConfiguracao();

		if(config.getStatus().getValor().equalsIgnoreCase("Disabled")  || config.getStatus().getValor().equalsIgnoreCase("Quiescent")){
			this.resetarSipProfile(cliente.getDesignador(), cliente.getLinha().getInstancia());
		}

		if(config.getStatus().getValor().equalsIgnoreCase("Error")){
			// Reenviar FXS 
			System.out.println(config.getStatus().getValor());
			this.reenviarFxs(cliente.getDesignador());
		}
	}

	public ResetSIPAgentOut resetarSipProfile(String designador, String instancia) throws RemoteException{

		DiagnosticoSIPIn in = new DiagnosticoSIPIn();

		Credenciais credencial = new Credenciais("URA", "URA", "URA");

		in.setInstancia(instancia);
		in.setDesignadorTurbonet(designador);
		in.setCredencial(credencial);		

		return this.codService.executarResetSIPAgent(in);
	}

	public PortaFxs consultarPortaFxs(Cliente cliente) throws RemoteException{

		ConsultarEquipamentoIn in = new ConsultarEquipamentoIn();

		in.setDesignador(cliente.getDesignador());


		ConsultarEquipamentoOut resp = this.configOnline.consultarEquipamentos(in);

		PortaFxs fxs = new PortaFxs();


		if (resp.getCodigo() == 0) {

			RecursoLogicoWS[] recurso = resp.getRecursosLogicos();

			for (RecursoLogicoWS recursoLogicoWS : recurso) {			

				PortaFXSWS consulta = recursoLogicoWS.getRecursosLogicos(0).getPortaFXS();

				fxs.setId(consulta.getId());
				fxs.setInstancia(new Parametro("[FXS] Instancia", consulta.getInstancia()));
				fxs.setStatus(new Parametro("[FXS] Status", consulta.getStatus().getValue()));
				fxs.setOutboundProxyIp(new Parametro("[FXS] OutboundProxyIp", consulta.getSessionBorder().getOutboundProxyIp()));
				fxs.setPorta(new Parametro("[FXS] Porta Modem", consulta.getNumeroPorta().toString()));
				fxs.setProxyServerIp(new Parametro("[FXS] ProxyServer", consulta.getSessionBorder().getProxyServerIp()));
				fxs.setUserAgentDomain(new Parametro("[FXS] UserAgentDomain", consulta.getSessionBorder().getUserAgentDomain()));
				fxs.setRegistraServer(new Parametro("[FXS] RegistrarServer", consulta.getSessionBorder().getRegistraServer()));

			}

		}
		return fxs;		
	}	

	public void reenviarFxs(String designador) throws RemoteException{

		ResendFxsIn in = new ResendFxsIn();
		in.setDesignator(designador);
		in.setIsGpon("false");
		ResendFxsOut oi = this.sip.resendFxs(in);
		System.out.println(oi.getIsResendFxsOK());
	}


}
