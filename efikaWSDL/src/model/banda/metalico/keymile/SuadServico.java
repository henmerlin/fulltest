package model.banda.metalico.keymile;

import java.math.BigInteger;
import java.util.ArrayList;

import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.BandaInterface;
import entidades.banda.metalico.keymile.Suad;
import entidades.banda.parametros.TabelaParametrosMetalico;
import entidades.cadastro.Cadastro;
import model.banda.BandaServicoInterface;
import model.telnet.ComandoTelnet;
import util.TelnetUtil;

public class SuadServico extends KeymileServico implements BandaServicoInterface{
	
	
	public SuadServico() {
	}

	/**
	 * Retorna:
	 * Velocidade do canal, em kbps;
	 * Sinal ruído da porta, em dB;
	 * Atenuação da porta, em dB; 
	 * @param cadastro
	 * @return
	 * @throws Exception 
	 */
	public TabelaParametrosMetalico consultarTabelaParametros() throws Exception{
		
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdChanStatus()));
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdSnrMargin()));
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdAttenuation()));
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdChanProfile()));
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdPortProfile()));
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdAdminStatus()));
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdOperStatus()));		
		
		ArrayList<String> retorno = (ArrayList<String>) this.getSocket().run();

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

		// MODULAÇÃO APLICADA
		tabela.setModulacao(new String(TelnetUtil.tratamentoStringKeymile("\\ # Name", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Name", 2)))));

		// AdministrativeStatus
		tabela.setPortaAdmStatus(new String(TelnetUtil.tratamentoStringKeymile("\\ # State", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "State", 1)))));
	
		// AdministrativeStatus
		tabela.setSincronismoStatus(new String(TelnetUtil.tratamentoStringKeymile("\\ # State", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "State", 2)))));
		
		// Debugger
		//TelnetUtil.debugger(retorno);

		return tabela;
	}

	
	@Override
	public BandaInterface consultarBridges(BandaInterface banda) throws Exception {
		
		
		Suad suad = (Suad) banda;
		

		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdVccConfig(1)));
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdVccConfig(2)));
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdVccConfig(3)));
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdVccConfig(4)));
		
		ArrayList<String> retorno = (ArrayList<String>) this.getSocket().run();
		
		String string = "\\ # ServicesCurrentConnected";
		
		String oi1 = TelnetUtil.tratamentoStringKeymile(string, retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, string, 1)));
		String oi2 = TelnetUtil.tratamentoStringKeymile(string, retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, string, 2)));
		String oi3 = TelnetUtil.tratamentoStringKeymile(string, retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, string, 3)));
		String oi4 = TelnetUtil.tratamentoStringKeymile(string, retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, string, 4)));
		
		
		System.out.println(oi1.substring(oi1.indexOf("srvc"), oi1.length() - 1));
		System.out.println(oi2.substring(oi2.indexOf("srvc"), oi2.length() - 1));
		System.out.println(oi3.substring(oi3.indexOf("srvc"), oi3.length() - 1));
		System.out.println(oi4.substring(oi4.indexOf("srvc"), oi4.length()));
		
//		System.out.println(oi1);
//		System.out.println(oi2);
//		System.out.println(oi3);
//		System.out.println(oi4);
		
		//TelnetUtil.debugger(retorno);
		
		return suad;
	}
	
	public String cmdSnrMargin(){
		return "get /unit-" + this.getTbs().getSlot() + "/port-" +  this.getTbs().getPortNumber() + "/status/snrmargin";
	}

	public String cmdAttenuation(){
		return "get /unit-" +  this.getTbs().getSlot() + "/port-" +  this.getTbs().getPortNumber() + "/status/attenuation";
	}	

	/**
	 * Contem o perfil do canal (profile) 	
	 * @param tbs
	 * @return String 
	 */
	public String cmdChanProfile(){
		return "get /unit-" +  this.getTbs().getSlot() + "/port-" +  this.getTbs().getPortNumber() + "/chan-1/cfgm/profilename";
	}
	
	public String cmdPortProfile(){
		return "get /unit-" +  this.getTbs().getSlot() + "/port-" +  this.getTbs().getPortNumber() + "/cfgm/portprofile";
	}
	
	/**
	 * 
	 * @param tbs
	 * @param nrBridge
	 * @return
	 */
	public String cmdVccConfig(Integer vcc){
		return "get /unit-" +  this.getTbs().getSlot() + "/port-" +  this.getTbs().getPortNumber() + "/chan-1/vcc-" + vcc + "/status/servicestatus";
	}
}
