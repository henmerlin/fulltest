package model.linha.tdm;


import java.util.ArrayList;
import java.util.List;

import br.com.gvt.www.oss.necservice.ConsultElement;
import entidades.cliente.Cliente;
import entidades.configuracoes.ConfiguracaoNortel;
import entidades.correcao.AcaoCorretiva;
import entidades.parametros.Parametro;
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
			try {
				
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
				
				config.setServicos(listServico);
			} catch (Exception e) {
				throw new Exception("Erro ao obter resposta do WS - consultarConfiguracoes");
			}
		}

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
	
	
	public String cmdAtivarServico(Cliente cliente, String servico){
		return "ADO $ " + cliente.getInstancia() + " " + servico + " $ Y";
	}
	
	public String cmdDesativarServico(Cliente cliente, String servico){
		return "DEO $ " + cliente.getInstancia() + " " + servico + " $ Y";
	}
	
	public String cmdManobraFacilidade(String facilidade_velha, String facilidade_nova){
		return "CLN $ " + facilidade_velha + " " + facilidade_nova + " Y";
	}
	
	public String cmdManobraNumero(Cliente cliente, String numero_velho){
		return "CNL $ " + numero_velho + " " + cliente.getInstancia() + " Y";
	}
	
	public String cmdAtivarBioSuspensao(Cliente cliente, String custgroup){
		return "CHG $ LINE " + cliente.getInstancia() + " CUST " + custgroup.replace("POS", "BIO") + " Y";
	}
	
	public String cmdDesativarBioSuspensao(Cliente cliente, String custgroup){
		return "CHG $ LINE " + cliente.getInstancia() + " CUST " + custgroup.replace("BIO", "POS") + " Y";
	}
	
	public String cmdAlternarCustGroup(Cliente cliente, String custgroup){
		String new_cust;
		
		if(custgroup.indexOf("N")!=0 && custgroup.length() == 8){
			new_cust = "N"+custgroup;
		}else{
			new_cust = custgroup.substring(1);
		}
		
		return "CHG $ LINE " + cliente.getInstancia() + " CUST " + new_cust + " Y";
		
	}

	public String cmdCriarLinha(Cliente cliente, String facilidade, String custgroup){
		return "NEW $ " + cliente.getInstancia() + " IBN " + custgroup + " 0 115 " + facilidade + " DGT CWT 3WC CFU N DDN $ $ Y";
	}
	
	public String cmdDeletarLinha(Cliente cliente, String facilidade){
		return "OUT $ " + cliente.getInstancia() + " " + facilidade + " BLDN Y";
	}
	
	public String cmdStatusdaLinha(Cliente cliente){
		return "mapci nodisp;mtc;lns;ltp;post d " + cliente.getInstancia() + " display";
	}
	
	public String cmdResetaStatusdaLinha(Cliente cliente){
		return "mapci nodisp;mtc;lns;ltp;post d " + cliente.getInstancia() + ";frls;rts;";
	}
	
	public String cmdAtivarSuspensaoTemporaria(Cliente cliente, String facilidade){
		return "SUS $ " + cliente.getInstancia() + " " + facilidade + " Y";
	}
	
	public String cmdDesativarSuspensaoTemporaria(Cliente cliente, String facilidade){
		return "RES $ " + cliente.getInstancia() + " " + facilidade + " Y";
	}
	
	public String cmdAlterarNCOS(Cliente cliente, String ncos){
		return "CHG $ LINE " + cliente.getInstancia() + " NCOS " + ncos + " Y";
	}
	
	public String cmdAlterarCustgroup(Cliente cliente, String custgroup){
		return "CHG $ LINE " + cliente.getInstancia() + " CUST " + custgroup + " Y";
	}
	
	public Telnet getTelnet() {
		return telnet;
	}


	public void setTelnet(Telnet telnet) {
		this.telnet = telnet;
	}


	@Override
	public List<String> validarConfiguracoes(Cliente cliente) {

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
