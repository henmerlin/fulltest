package model.linha.ims;


import java.util.ArrayList;
import java.util.List;

import entidades.cliente.Cliente;
import entidades.configuracoes.ConfiguracaoV52;
import model.linha.LinhaServicoInterface;
import model.linha.MassivoLinhaInterface;

public class V52Servico extends ImsServico implements LinhaServicoInterface, MassivoLinhaInterface{
	
	//private ConfiguradorOnlineDeviceManagementProxy codService;
	
	public V52Servico() {
		//this.codService = new ConfiguradorOnlineDeviceManagementProxy();
	}

	@Override
	public Cliente consultarConfiguracoes(Cliente cliente) throws Exception {
		
		cliente = super.consultarConfiguracoes(cliente);
		
		ConfiguracaoV52 config = new ConfiguracaoV52();
		
		config.setRegistro(super.consultarRegistroCentral(cliente.getInstancia(), cliente.getLinha()));
		
		cliente.getLinha().setConfiguracao(config);
		
		
		return cliente;
	}

	@Override
	public List<String> validarConfiguracoes(Cliente cliente) {
		// TODO Auto-generated method stub
		return new ArrayList<String>();
	}

	@Override
	public void realizarCorrecoes(Cliente cliente) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> validarConfiguracoesLogicas(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}


}
