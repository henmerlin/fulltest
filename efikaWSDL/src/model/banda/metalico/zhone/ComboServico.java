package model.banda.metalico.zhone;

import java.math.BigInteger;
import java.util.ArrayList;

import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.metalico.zhone.configs.Bridge;
import entidades.banda.parametros.TabelaParametrosMetalico;
import entidades.cadastro.Cadastro;
import model.banda.BandaServicoInterface;
import model.telnet.ComandoTelnet;
import model.telnet.ExecutionType;
import util.TelnetUtil;

/**
 * Instancia para leitura (sem altera��o):
 * 	3125265870
 * @author G0042204
 *
 */
public class ComboServico extends ZhoneServico implements BandaServicoInterface{

	public ComboServico() {

	}

	/**
	 * Retorna:
	 * 	estado da porta
	 * 	velocidade de sincronismo (up e down)
	 * 	snr (up e down)
	 * 	atn (up e down)
	 * 	pacotes recebidos
	 * 	pacotes enviados
	 * 	crc up e down
	 * 	fec up e down
	 * @return
	 * @throws Exception
	 */
	public TabelaParametrosMetalico consultarTabelaParametros(Cadastro cadastro) throws Exception{

		InfoTBS tbs = cadastro.getCadastro().getInfoTBS();

		// DSLAM do Agi - 4130825270
		/*tbs.setIpDslam("10.141.228.42");
		tbs.setSlot(new BigInteger("8"));
		tbs.setPortNumber(new BigInteger("30"));
		tbs.setPortAddrSeq(new BigInteger("126"));*/

		this.getTelnet().setIp(tbs.getIpDslam());

		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdPortStatus(tbs)));
		this.getTelnet().getComandos().add(new ComandoTelnet("A"));

		this.getTelnet().setMode(ExecutionType.ZHONE_SLOW);

		ArrayList<String> retorno = (ArrayList<String>) this.getTelnet().run();

		TabelaParametrosMetalico tabela = new TabelaParametrosMetalico();

		// Status Port
		tabela.setPortaAdmStatus(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "AdminStatus", 1))));
		tabela.setSincronismoStatus(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "LineStatus", 1))));

		// Velocidade Sincronizada
		tabela.setDownload(new Double(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "DslDownLineRate", 1)))) /1000);
		tabela.setUpload(new Double(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "DslUpLineRate", 1)))) /1000);

		// SNR
		tabela.setSnrDown(new Double(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "AdslAturCurrLineSnrMgn", 1)))) /10);
		tabela.setSnrUp(new Double(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "AdslAtucCurrLineSnrMgn", 1)))) /10);

		// ATN
		tabela.setAtnDown(new Double(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "AdslAturCurrLineAtn", 1)))) /10);
		tabela.setAtnUp(new Double(TelnetUtil.tratamentoStringZhone(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "AdslAtucCurrLineAtn", 1)))) /10);

		// Execu��o dos outro comandos necess�rios
		ArrayList<ComandoTelnet> comandos = new ArrayList<ComandoTelnet>();

		comandos.add(new ComandoTelnet(this.cmdProfileDown(tbs)));
		comandos.add(new ComandoTelnet(this.cmdProfileUp(tbs)));
		comandos.add(new ComandoTelnet(this.cmdModulacao(tbs)));


		this.getTelnet().setComandos(comandos);

		this.getTelnet().setMode(ExecutionType.ZHONE);

		ArrayList<String> retorno1 = (ArrayList<String>) this.getTelnet().run();


		// Profile Download e Upload
		Double profileDown = new Double(TelnetUtil.tratamentoStringZhoneDif(retorno1.get(TelnetUtil.posicaoArrayDeSubString(retorno1, "fastMaxTxRate", 1))))/1000;
		Double profileUp =  new Double(TelnetUtil.tratamentoStringZhoneDif(retorno1.get(TelnetUtil.posicaoArrayDeSubString(retorno1, "fastMaxTxRate", 2))))/1000;

		tabela.setProfile(profileDown + " - " + profileUp);

		// Modula��o
		tabela.setModulacao(TelnetUtil.tratamentoStringZhoneDif(retorno1.get(TelnetUtil.posicaoArrayDeSubString(retorno1, "adslTransmissionMode", 1))));

		TelnetUtil.debugger(retorno);		

		consultarBridges(cadastro);

		return tabela;
	}

	/**
	 * Retorna Estat�sticas da Porta
	 * @param tbs
	 * @return
	 */
	public String cmdPortStatus(InfoTBS tbs){
		return "dslstat 1/" + tbs.getSlot() + "/" + tbs.getPortNumber() + "/0/adsl -v";
	}


	/**
	 * Retorna o profile de down da porta
	 * @param tbs
	 * @return
	 */
	public String cmdProfileDown(InfoTBS tbs){	
		return  "get adsl-co-profile 1/" + tbs.getSlot() + "/" +tbs.getPortNumber();
	}

	/**
	 * Retorna o profile de up da porta
	 * @param cadastro
	 * @return
	 */
	public String cmdProfileUp(InfoTBS tbs){		
		return "get adsl-cpe-profile 1/" + tbs.getSlot() + "/" +tbs.getPortNumber();
	}

	/**
	 * Retorna a modula��o da porta
	 * @param tbs
	 * @return
	 */
	public String cmdModulacao(InfoTBS tbs){
		return "get adsl-profile 1/" + tbs.getSlot() + "/" +tbs.getPortNumber();
	}

	public void consultarBridges(Cadastro cadastro) throws Exception {		

		InfoTBS tbs = new InfoTBS();
		
		//5134703100		
		tbs.setIpDslam("10.151.170.60");
		tbs.setSlot(new BigInteger("12"));
		tbs.setPortNumber(new BigInteger("3"));
		tbs.setPortAddrSeq(new BigInteger("195"));		

		this.getTelnet().setIp(tbs.getIpDslam());

		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdBridgesPort(tbs)));
		
		this.getTelnet().setMode(ExecutionType.ZHONE);
		
		ArrayList<String> retorno = (ArrayList<String>) this.getTelnet().run();
		
		Bridge bridge = new Bridge();
		
		String showVlan = TelnetUtil.tratamentoStringBridgeShowVlan2(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "/", 2)));
		
		
		/*String rin = showVlan.substring(0, 3);
		
		String[] split  = showVlan.split("-");
		
		bridge.setSlot(split[1]);
		bridge.setPort(split[2]);
		bridge.setEndSeqPort(split[7]);
		bridge.setVc(split[6]);
		bridge.setRin(rin);
		
		System.out.println(" Slot - " + split[1]);
		System.out.println(" Port - " + split[2]);
		System.out.println(" End Seq Port - " + split[7]);
		System.out.println(" Vc - " + split[6]);
		System.out.println(" Rin - " + rin);*/
		
		System.out.println(showVlan);
		
		//TelnetUtil.debugger(retorno);

	}
}
