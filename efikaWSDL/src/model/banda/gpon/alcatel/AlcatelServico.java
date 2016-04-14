package model.banda.gpon.alcatel;

import java.util.ArrayList;

import entidades.banda.BandaInterface;
import entidades.banda.parametros.TabelaParametrosGpon;
import model.banda.BandaServicoInterface;
import model.banda.metalico.DslamGpon;
import model.factory.BandaFactory;
import model.telnet.ComandoTelnet;
import model.telnet.ExecutionType;
import util.TelnetUtil;

public class AlcatelServico extends DslamGpon implements BandaServicoInterface{

	public AlcatelServico() {
		this.getSocket().setMode(ExecutionType.ALCATEL_GPON);
		this.getSocket().setAuth(BandaFactory.alcatelCredencial());
	}

	public TabelaParametrosGpon consultarTabelaParametros() throws Exception {

		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdGetProfilePort()));
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdGetPotencia()));
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdGetPortStatus()));

		ArrayList<String> retorno = (ArrayList<String>) this.getSocket().run();

		TabelaParametrosGpon tabela = new TabelaParametrosGpon();

		String profileDown = TelnetUtil.tratamentoStringAlcatel(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "NGLT_Default", 2)));
		String profileUP = TelnetUtil.tratamentoStringAlcatel(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "bandwidth-profile", 1)));

		tabela.setProfile(profileDown + " - " + profileUP);

		String linha = retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "rx-signal", 1));

		Integer limite1 = linha.indexOf("|", 1);
		Integer limite2 = linha.indexOf("|", limite1 + 1);
		Integer limite3 = linha.indexOf("|", limite2 + 1);
		Integer limite4 = linha.indexOf("|", limite3 + 1);
		Integer limite5 = linha.indexOf("|", limite4 + 1);
		Integer limite6 = linha.indexOf("|", limite5 + 1);


		String potencia = (String) retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "rx-signal", 1) + 3);

		String ret = (String) potencia.subSequence(limite1, limite2);
		String ret1 = (String) potencia.subSequence(limite6, potencia.length());


		tabela.setPotenciaONT(new Double(ret.trim()));
		tabela.setPotenciaOLT(new Double(ret1.trim()));

		tabela.setPortaAdmStatus(TelnetUtil.tratamentoStringAlcatel2(retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Gpon::Inactive", 1))));


		return tabela;

	}

	public String cmdListModemNaoAssoc(){

		return "show pon unprovision-onu";
	}
	
	
	/**
	 * Obtem SAGE da porta
	 * @return
	 */
	public String cmdGetSagePorta(){
		return "show equipment ont interface 1/1/"+ this.getAcessInfo().getSlotShelf() +"/"+ this.getAcessInfo().getPhysicalPort() +"/"+ this.getAcessInfo().getLogicalPortSeq();
	}

	/**
	 * Parâmetros de potencia da porta
	 * @return
	 */
	public String cmdGetPotencia(){

		return "show equipment ont optics 1/1/"+ this.getAcessInfo().getSlotShelf() +"/"+ this.getAcessInfo().getPhysicalPort() +"/"+ this.getAcessInfo().getLogicalPortSeq();
	}

	public String cmdGetBridge(){


		return "info configure bridge port 1/1/"+ this.getAcessInfo().getSlotShelf() +"/"+ this.getAcessInfo().getPhysicalPort() +"/"+ this.getAcessInfo().getLogicalPortSeq() +"/4/1";
	}

	public String cmdGetMacinPort(){


		return "show vlan bridge-port-fdb | match exact:1/1/"+ this.getAcessInfo().getSlotShelf() +"/"+ this.getAcessInfo().getPhysicalPort() +"/"+ this.getAcessInfo().getLogicalPortSeq() +"/4/1";

	}

	public String cmdGetProfilePort(){


		return "info configure qos interface 1/1/"+ this.getAcessInfo().getSlotShelf() +"/"+ this.getAcessInfo().getPhysicalPort() +"/"+ this.getAcessInfo().getLogicalPortSeq() +"/4/1 flat";
	}

	public String cmdGetPortStatus(){
		return "show equipment ont operational-data 1/1/"+ this.getAcessInfo().getSlotShelf() +"/"+ this.getAcessInfo().getPhysicalPort() +"/" + this.getAcessInfo().getLogicalPortSeq() + " xml";
	}

	@Override
	public BandaInterface consultarBridges(BandaInterface banda) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
