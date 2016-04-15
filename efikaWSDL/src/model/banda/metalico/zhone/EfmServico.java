package model.banda.metalico.zhone;

import java.util.ArrayList;

import entidades.banda.BandaInterface;
import entidades.banda.metalico.zhone.Efm;
import entidades.banda.metalico.zhone.configs.Bridge;
import entidades.banda.parametros.TabelaParametrosMetalico;
import model.banda.BandaServicoInterface;
import model.telnet.ComandoTelnet;
import model.telnet.ExecutionType;
import util.TelnetUtil;

public class EfmServico extends ZhoneServico implements BandaServicoInterface{

	public EfmServico() {

	}

	@Override
	public TabelaParametrosMetalico consultarTabelaParametros() throws Exception {

		this.getSocket().getComandos().add(new ComandoTelnet(cmdGetStatusPorta()));
		this.getSocket().getComandos().add(new ComandoTelnet(cmdGetStatusAdmPorta()));

		this.getSocket().setMode(ExecutionType.ZHONE);

		ArrayList<String> retorno = (ArrayList<String>) this.getSocket().run();

		TabelaParametrosMetalico tabela = new TabelaParametrosMetalico();

		// Status Port
		tabela.setPortaAdmStatus(TelnetUtil.tratamentoStringAlcatel(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Administrative status", 1))));
		tabela.setSincronismoStatus(TelnetUtil.tratamentoStringAlcatel(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Operational status", 1))));
		
		//TelnetUtil.debugger(retorno);

		return tabela;
	}

	// Status Operacional.
	public String cmdGetStatusPorta() {

		return "port status 1-" + this.getTbs().getSlot() + "-" + this.getTbs().getPortNumber() +"-0/eth";

	}

	// Adm Status.
	public String cmdGetStatusAdmPorta() {

		return "port show 1-" + this.getTbs().getSlot() + "-" + this.getTbs().getPortNumber() +"-0/eth";

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
