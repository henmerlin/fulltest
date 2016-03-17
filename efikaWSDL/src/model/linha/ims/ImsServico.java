package model.linha.ims;



import com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineProxy;
import com.gvt.www.ws.eai.configuradoronline.consultaElemento.ConsultaElementoIn;

import entidades.cliente.Cliente;
import model.linha.LinhaServico;
import model.modulos.OperacionalInterface;

public class ImsServico extends LinhaServico implements OperacionalInterface{
	
	private ConfiguradorOnlineProxy proxy;
		
	public ImsServico() {
		this.proxy = new ConfiguradorOnlineProxy();

	}
	
	@Override
	public Cliente consultar(Cliente cliente) throws Exception {
		
		//ConsultaElementoIn consulta = new ConsultaElementoIn(cliente.getInstancia(), cliente.getLinha().getInstancia(), clliCode, cidade, estado);

		return cliente;
	} 

	
}
