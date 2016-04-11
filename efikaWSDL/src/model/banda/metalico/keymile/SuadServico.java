package model.banda.metalico.keymile;

import java.math.BigInteger;
import java.util.ArrayList;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.parametros.TabelaParametrosMetalico;
import entidades.cadastro.Cadastro;
import model.banda.BandaServicoInterface;
import model.telnet.ComandoTelnet;
import model.telnet.Telnet;
import util.TelnetUtil;

public class SuadServico extends KeymileServico implements BandaServicoInterface{
	
	public SuadServico() {
		
	}

	/**
	 * Retorna:
	 * Velocidade do canal, em kbps;
	 * Sinal ru�do da porta, em dB;
	 * Atenua��o da porta, em dB; 
	 * @param cadastro
	 * @return
	 * @throws Exception 
	 */
	public TabelaParametrosMetalico consultarTabelaParametros(Cadastro cadastro) throws Exception{

		 InfoTBS tbs = cadastro.getCadastro().getInfoTBS();
		//InfoTBS tbs = new InfoTBS();

//		tbs.setIpDslam("10.141.13.179");
//		tbs.setSlot(new BigInteger("16"));
//		tbs.setPortNumber(new BigInteger("12"));

		this.getTelnet().setIp(tbs.getIpDslam());

		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdChanStatus(tbs)));
		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdSnrMargin(tbs)));
		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdAttenuation(tbs)));
		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdChanProfile(tbs)));
		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdPortProfile(tbs)));
		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdAdminStatus(tbs)));
		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdOperStatus(tbs)));
		
		ArrayList<String> retorno = (ArrayList<String>) this.getTelnet().run();

		TabelaParametrosMetalico tabela = new TabelaParametrosMetalico();

		// Sincronizada
		tabela.setDownload(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrentRate", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrentRate", 1)))));
		tabela.setUpload(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrentRate", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrentRate", 2)))));

		// SNR
		tabela.setSnrDown(new Double(TelnetUtil.tratamentoStringKeymile("\\ # Downstream", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Downstream", 2)))));
		tabela.setSnrUp(new Double(TelnetUtil.tratamentoStringKeymile("\\ # Upstream", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Upstream", 2)))));

		// ATN
		tabela.setAtnDown(new Double(TelnetUtil.tratamentoStringKeymile("\\ # Downstream", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Downstream", 3)))));
		tabela.setAtnUp(new Double(TelnetUtil.tratamentoStringKeymile("\\ # Upstream", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Upstream", 3)))));	

		// PROFILE APLICADO
		tabela.setProfile(new String(TelnetUtil.tratamentoStringKeymile("\\ # Name", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Name", 1)))));

		// MODULA��O APLICADA
		tabela.setModulacao(new String(TelnetUtil.tratamentoStringKeymile("\\ # Name", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Name", 2)))));

		// AdministrativeStatus
		tabela.setPortaAdmStatus(new String(TelnetUtil.tratamentoStringKeymile("\\ # State", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "State", 1)))));
	
		// AdministrativeStatus
		tabela.setSincronismoStatus(new String(TelnetUtil.tratamentoStringKeymile("\\ # State", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "State", 2)))));
		
		// Debugger
		//TelnetUtil.debugger(retorno);

		return tabela;
	}

	public String cmdSnrMargin(InfoTBS tbs){
		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/status/snrmargin";
	}

	public String cmdAttenuation(InfoTBS tbs){
		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/status/attenuation";
	}	

	/**
	 * Contem o perfil do canal (profile) 	
	 * @param tbs
	 * @return String 
	 */
	public String cmdChanProfile(InfoTBS tbs){
		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/cfgm/profilename";
	}

	public String cmdPortProfile(InfoTBS tbs){
		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/cfgm/portprofile";
	}

}
