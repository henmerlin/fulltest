package model.banda.metalico.zhone;

import java.math.BigInteger;
import java.util.ArrayList;

import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.BandaInterface;
import entidades.banda.metalico.zhone.Efm;
import entidades.banda.metalico.zhone.configs.Bridge;
import entidades.banda.parametros.TabelaParametrosInter;
import entidades.banda.parametros.TabelaParametrosMetalico;
import entidades.cadastro.Cadastro;
import model.banda.BandaServicoInterface;
import model.telnet.ComandoTelnet;
import model.telnet.ExecutionType;
import util.TelnetUtil;

public class EfmServico extends ZhoneServico implements BandaServicoInterface{

	public EfmServico() {

	}

	@Override
	public TabelaParametrosInter consultarTabelaParametros() throws Exception {

		InfoTBS tbs = new InfoTBS();

		tbs.setIpDslam("10.151.11.130");
		tbs.setSlot(new BigInteger("3"));
		tbs.setPortNumber(new BigInteger("3"));
		tbs.setPortAddrSeq(new BigInteger("2003"));

		this.getTelnet().setIp(tbs.getIpDslam());

		this.getTelnet().getComandos().add(new ComandoTelnet(cmdGetStatusPorta(tbs)));
		this.getTelnet().getComandos().add(new ComandoTelnet(cmdGetStatusAdmPorta(tbs)));

		this.getTelnet().setMode(ExecutionType.ZHONE);

		ArrayList<String> retorno = (ArrayList<String>) this.getTelnet().run();

		TabelaParametrosMetalico tabela = new TabelaParametrosMetalico();

		// Status Port
		tabela.setPortaAdmStatus(TelnetUtil.tratamentoStringAlcatel(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Administrative status", 1))));
		tabela.setSincronismoStatus(TelnetUtil.tratamentoStringAlcatel(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Operational status", 1))));
		
		//TelnetUtil.debugger(retorno);

		return tabela;
	}

	// Status Operacional.
	public String cmdGetStatusPorta(InfoTBS infoTBS) {

		return "port status 1-" + infoTBS.getSlot() + "-" + infoTBS.getPortNumber() +"-0/eth";

	}

	// Adm Status.
	public String cmdGetStatusAdmPorta(InfoTBS infoTBS) {

		return "port show 1-" + infoTBS.getSlot() + "-" + infoTBS.getPortNumber() +"-0/eth";

	}


	@Override
	public BandaInterface consultarBridges(BandaInterface banda) throws Exception {
		
		Efm efm = (Efm) banda;
		
		this.getSocket().setMode(ExecutionType.ZHONE);
		
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdBridgesPort()));
		
		ArrayList<String> retorno = (ArrayList<String>) this.getSocket().run();
		
		String showVlan = TelnetUtil.tratamentoStringBridgeShowVlan2(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "/bridge", 1)));
				
		String[] split  = showVlan.split("-");
				
		if (split[4].equalsIgnoreCase("eth")) {
			
			Bridge autenticacao = new Bridge();
			
			autenticacao.setSlot(split[1]);
			autenticacao.setPort(split[2]);			
			Integer endSeqPort = Integer.parseInt(split[5].substring(0, 4))-100;			
			autenticacao.setEndSeqPort(Integer.toString(endSeqPort));
			autenticacao.setRin(split[0].substring(24, 27));
			autenticacao.setVc("35");
			
			efm.setAutenticacao(autenticacao);
		}
		
		//TelnetUtil.debugger(retorno);
		
		return efm;
	}


}
