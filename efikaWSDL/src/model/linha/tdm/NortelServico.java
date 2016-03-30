package model.linha.tdm;


import java.util.ArrayList;
import java.util.List;

import br.com.gvt.www.oss.necservice.ConsultElement;
import entidades.cliente.Cliente;
import entidades.configuracoes.ConfiguracaoNortel;
import entidades.configuracoes.Parametro;
import model.linha.LinhaServicoInterface;
import model.telnet.Telnet;

public class NortelServico extends TdmServico implements LinhaServicoInterface{

	private Telnet telnet;


	public NortelServico() {
		this.telnet = new Telnet();
	}

	@Override
	public Cliente consultarConfiguracoes(Cliente cliente) throws Exception {

		cliente = super.consultarConfiguracoes(cliente);

		ConfiguracaoNortel config = new ConfiguracaoNortel();
		
		List<Parametro> listServico = new ArrayList<Parametro>();

		for (ConsultElement consultElement : super.consultarElemento(cliente.getInstancia(), cliente.getLinha())) {

			String retorno = consultElement.getElementAnswer();

			String custgroup = tratamentoElementAnswer("CUSTGRP:", "SUBGRP", retorno);
			String ncos = tratamentoElementAnswer("NCOS:", "CARDCODE", retorno);
			String len = tratamentoElementAnswer("LINE EQUIPMENT NUMBER:", "LINE CLASS CODE:", retorno);


			config.setCustgroup(new Parametro("Custgroup", custgroup));
			config.setNcos(new Parametro("Ncos", ncos));
			config.setLen(new Parametro("Len", len));

			String option = "OPTIONS:";

			String servicos = (String) retorno.subSequence(retorno.indexOf(option) + option.length(), retorno.lastIndexOf("-------------------------------------------------------------------------------"));

			if(servicos.contains("DGT")){
				listServico.add(new Parametro("Digital", "Ativo"));
			}
			
			if(servicos.contains("CWT")){
				listServico.add(new Parametro("Ligação Simultânea", "Ativo"));
			}
						
			if(servicos.contains("3WC")){
				listServico.add(new Parametro("Conversa a Três", "Ativo"));
			}			

			if( ( servicos.contains("DDN") && servicos.contains("NOAMA"))){
				listServico.add(new Parametro("Identificador de Chamadas (DDN)", "Ativo"));
			}	
			
			if( ( servicos.contains("CND") && servicos.contains("NOAMA"))){
				listServico.add(new Parametro("Identificador de Chamadas (CND)", "Ativo"));
			}	
		}

		config.setServicos(listServico);
		
		cliente.getLinha().setConfiguracao(config);

		return cliente;
	}

	public String tratamentoElementAnswer(String substring, String substring1, String string){

		int inicio = string.indexOf(substring);
		int fim = string.indexOf(substring1);

		String reg = null;

		reg = (String) string.subSequence(inicio + substring.length(), fim);

		return reg.trim();
	}

	public Telnet getTelnet() {
		return telnet;
	}


	public void setTelnet(Telnet telnet) {
		this.telnet = telnet;
	}


	@Override
	public List<Exception> validarConfiguracoes(Cliente cliente) {

		return new ArrayList<Exception>();
	}

	@Override
	public void realizarCorrecoes(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}
}
