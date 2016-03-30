package model.linha.ims;

import java.rmi.RemoteException;

import com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineServicesProxy;
import com.gvt.www.services.consultarEquipamento.ConsultarEquipamentoIn;
import com.gvt.www.services.consultarEquipamento.ConsultarEquipamentoOut;
import com.gvt.www.services.model.portaFXS.PortaFXSWS;
import com.gvt.www.services.model.recursoLogico.RecursoLogicoWS;

import entidades.configuracoes.Parametro;
import entidades.configuracoes.PortaFxs;

public class Debugger {

	public static void main(String[] args) throws RemoteException {


		ConfiguradorOnlineServicesProxy configOnline = new ConfiguradorOnlineServicesProxy();

		ConsultarEquipamentoIn in = new ConsultarEquipamentoIn();
		
		in.setDesignador("CTA-81H685EWX-013");

		ConsultarEquipamentoOut resp = configOnline.consultarEquipamentos(in);
		
		if (resp.getCodigo() == 0) {
			
			RecursoLogicoWS[] recurso = resp.getRecursosLogicos();

			for (RecursoLogicoWS recursoLogicoWS : recurso) {			

				PortaFXSWS consulta = recursoLogicoWS.getRecursosLogicos(0).getPortaFXS();

				PortaFxs fxs = new PortaFxs();

				fxs.setId(consulta.getId());
				fxs.setInstancia(new Parametro("[FXS] Instancia ", consulta.getInstancia()));
				fxs.setStatus(new Parametro("[FXS] Status", consulta.getStatus().getValue()));
				fxs.setOutboundProxyIp(new Parametro("[FXS] OutboundProxyIp", consulta.getSessionBorder().getOutboundProxyIp()));
				fxs.setPorta(new Parametro("[FXS] Porta", consulta.getNumeroPorta().toString()));
				fxs.setProxyServerIp(new Parametro("[FXS] ProxyServer", consulta.getSessionBorder().getProxyServerIp()));

				System.out.println(consulta.getNumeroPorta());
			}

		}





	}

}
