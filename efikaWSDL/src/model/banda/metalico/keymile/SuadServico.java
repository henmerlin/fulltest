package model.banda.metalico.keymile;

import java.math.BigInteger;
import java.util.ArrayList;
import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.parametros.TabelaParametrosMetalico;
import model.factory.BandaFactory;
import model.telnet.ComandoTelnet;
import model.telnet.ExecutionType;
import model.telnet.Telnet;
import util.TelnetUtil;

public class SuadServico {

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
	public TabelaParametrosMetalico consultarTabelaParametros() throws Exception {

		// InfoTBS tbs = cadastro.getInfoTBS();
		InfoTBS tbs = new InfoTBS();

		tbs.setIpDslam("10.141.13.179");
		tbs.setSlot(new BigInteger("16"));
		tbs.setPortNumber(new BigInteger("12"));

		Telnet telnet = new Telnet();

		telnet.setAuth(BandaFactory.keymileCredencial());

		telnet.setIp(tbs.getIpDslam());

		String comando1 = this.cmdchanStatus(tbs);
		String comando2 = this.cmdSnrMargin(tbs);
		String comando3 = this.cmdAttenuation(tbs);
		String comando4 =  "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/cfgm/profilename";
		String comando5 =  "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/cfgm/portprofile";


		ComandoTelnet cmd1 = new ComandoTelnet(comando1);
		ComandoTelnet cmd2 = new ComandoTelnet(comando2);
		ComandoTelnet cmd3 = new ComandoTelnet(comando3);
		ComandoTelnet cmd4 = new ComandoTelnet(comando4);
		ComandoTelnet cmd5 = new ComandoTelnet(comando5);

		telnet.getComandos().add(cmd1);
		telnet.getComandos().add(cmd2);
		telnet.getComandos().add(cmd3);
		telnet.getComandos().add(cmd4);
		telnet.getComandos().add(cmd5);

		telnet.setMode(ExecutionType.KEYMILE);

		ArrayList<String> retorno = (ArrayList<String>) telnet.run();

		TabelaParametrosMetalico tabela = new TabelaParametrosMetalico();

		// Sincronizada
		tabela.setDownload(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrentRate", retorno.get(6))));
		tabela.setUpload(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrentRate", retorno.get(10))));

		// SNR
		tabela.setSnrDown(new Double(TelnetUtil.tratamentoStringKeymile("\\ # Downstream", retorno.get(15))));
		tabela.setSnrUp(new Double(TelnetUtil.tratamentoStringKeymile("\\ # Upstream", retorno.get(16))));

		// ATN
		tabela.setAtnDown(new Double(TelnetUtil.tratamentoStringKeymile("\\ # Downstream", retorno.get(19))));
		tabela.setAtnUp(new Double(TelnetUtil.tratamentoStringKeymile("\\ # Upstream", retorno.get(20))));		

		// PROFILE APLICADO
		tabela.setProfile(new String(TelnetUtil.tratamentoStringKeymile("\\ # Name", retorno.get(23))));

		// MODULAÇÃO APLICADA
		tabela.setModulacao(new String(TelnetUtil.tratamentoStringKeymile("\\ # Name", retorno.get(26))));

		// Debugger
		TelnetUtil.debugger(retorno);

		return tabela;
	}

	public String cmdchanStatus(InfoTBS tbs){
		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/status/status";
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
	public String chanProfile(InfoTBS tbs){
		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/cfgm/profilename";
	}

	public String portProfile(InfoTBS tbs){
		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/cfgm/portprofile";
	}

}
