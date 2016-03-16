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
import entidades.configuracoes.ModemSip;

import entidades.linha.ims.Sip;
import model.linha.LinhaServicoInterface;

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
	
	public Cliente getConfiguracao(Cliente cliente) throws RemoteException{

		DiagnosticoSIPOut diag = this.executarDiagnosticoSIP(cliente.getInstancia(), cliente.getDesignador());
		

		ElementoDiagnosticoSIP device = diag.getHomegateway();


		ModemSip modem = new ModemSip();

		modem.setTipo(device.getTipo());
		modem.setSerialNumber(device.getSerialNumber());
		modem.setMac(device.getMacAddress());
		modem.setStatusCpe(device.getStatusCPE());

		if(diag.getCodigo() == 0){

			DiagnosticoSIP[] diagSip = device.getDiagnosticosSIP();

			for (DiagnosticoSIP diagnosticoSIP : diagSip) {

				modem.setDn(diagnosticoSIP.getInstancia());	

				DiagnosticoParam[] parametros = diagnosticoSIP.getParams();

				for (DiagnosticoParam param : parametros) {

					if(param.getNome().equalsIgnoreCase("AuthUserName")){
						modem.setAuthUser(param.getValor());
					}

					if(param.getNome().equalsIgnoreCase("OutboundProxy")){
						modem.setOutboundProxy(param.getValor());
					}

					if(param.getNome().equalsIgnoreCase("UserAgentDomain")){
						modem.setUserAgentDomain(param.getValor());
					}

					if(param.getNome().equalsIgnoreCase("RegistrarServer")){
						modem.setRegistrarServer(param.getValor());
					}	

					if(param.getNome().equalsIgnoreCase("ProxyServer")){
						modem.setProxyServer(param.getValor());
					}					

					if(param.getNome().equalsIgnoreCase("Status")){
						modem.setStatus(param.getValor());
					}		

					if(param.getNome().equalsIgnoreCase("IPAddress")){
						modem.setIpAddress(param.getValor());
					}	
				}
			}
		}
		
		Sip sip = new Sip();
		
		sip.setModem(modem);
		
		cliente.setLinha(sip);
		
		return cliente;
	}

	@Override
	public Cliente consultar(Cliente cliente) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
