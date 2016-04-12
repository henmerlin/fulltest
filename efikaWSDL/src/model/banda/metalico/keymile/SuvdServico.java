package model.banda.metalico.keymile;

import java.math.BigInteger;
import java.util.ArrayList;

import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.parametros.TabelaParametrosInter;
import entidades.banda.parametros.TabelaParametrosMetalico;
import entidades.banda.parametros.TabelaParametrosMetalicoVdsl;
import entidades.cadastro.Cadastro;
import model.banda.BandaServicoInterface;
import model.factory.BandaFactory;
import model.telnet.ComandoTelnet;
import util.TelnetUtil;

public class SuvdServico extends KeymileServico implements BandaServicoInterface{

	public SuvdServico() {
		
	}

public TabelaParametrosInter consultarTabelaParametros(Cadastro cadastro) throws Exception {
		
		InfoTBS tbs = new InfoTBS();

//		tbs.setIpDslam("10.185.129.46");
//		tbs.setSlot(new BigInteger("9"));
//		tbs.setPortNumber(new BigInteger("18"));
		
		tbs.setIpDslam("10.185.9.211");
		tbs.setSlot(new BigInteger("15"));
		tbs.setPortNumber(new BigInteger("4"));
		

		this.getTelnet().setAuth(BandaFactory.keymileCredencial());

		this.getTelnet().setIp(tbs.getIpDslam());

		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdChanStatus(tbs)));
		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdBandStatus(tbs)));
		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdChanProfile(tbs)));
		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdPortProfile(tbs)));
		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdAdminStatus(tbs)));
		this.getTelnet().getComandos().add(new ComandoTelnet(this.cmdOperStatus(tbs)));

		ArrayList<String> retorno = (ArrayList<String>) this.getTelnet().run();
		
		if(TelnetUtil.contarOcorrenciaStringArray(retorno, "CurrAttenuation") == 6){
					
			TabelaParametrosMetalicoVdsl tabela = new TabelaParametrosMetalicoVdsl();
			Integer lele = (TelnetUtil.posicaoArrayDeSubString(retorno, "true", 1)+1);
			// Sincronizada
			tabela.setDownload(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrentRate", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrentRate", 1)))));
			tabela.setUpload(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrentRate", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrentRate", 2)))));
			
			// SNR
			tabela.setSnrUp(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrSnrMargin", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrSnrMargin", 1)))));
			tabela.setSnrUp2(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrSnrMargin", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrSnrMargin", 2)))));
			tabela.setSnrUp3(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrSnrMargin", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrSnrMargin", 3)))));
			tabela.setSnrDown(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrSnrMargin", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrSnrMargin", 4)))));
			tabela.setSnrDown2(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrSnrMargin", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrSnrMargin", 5)))));
			tabela.setSnrDown3(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrSnrMargin", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrSnrMargin", 6)))));
			
			// ATN
			tabela.setAtnUp(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrAttenuation", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrAttenuation", 1)))));
			tabela.setAtnUp2(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrAttenuation", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrAttenuation", 2)))));
			tabela.setAtnUp3(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrAttenuation", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrAttenuation", 3)))));
			tabela.setAtnDown(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrAttenuation", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrAttenuation", 4)))));
			tabela.setAtnDown2(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrAttenuation", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrAttenuation", 5)))));
			tabela.setAtnDown3(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrAttenuation", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrAttenuation", 6)))));

			// PROFILE APLICADO
			tabela.setProfile(new String(TelnetUtil.tratamentoStringKeymile("\\ # Name", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Name", 1)))));

			// MODULAÇÃO APLICADA
			tabela.setModulacao(new String(TelnetUtil.tratamentoStringKeymile("\\ # Name", retorno.get(lele))));

			// AdministrativeStatus
			tabela.setPortaAdmStatus(new String(TelnetUtil.tratamentoStringKeymile("\\ # State", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "State", 1)))));
		
			// AdministrativeStatus
			tabela.setSincronismoStatus(new String(TelnetUtil.tratamentoStringKeymile("\\ # State", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "State", 2)))));
			
			
			
			//System.out.println(lele);
			//TelnetUtil.debugger(retorno);
			
			return tabela;
			
		}else{
			
			TabelaParametrosMetalico tabela = new TabelaParametrosMetalico();
			
			
			// SNR
			tabela.setSnrDown(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrSnrMargin", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrSnrMargin", 2)))));
			tabela.setSnrUp(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrSnrMargin", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrSnrMargin", 1)))));
			
			
			// ATN
			tabela.setAtnDown(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrAttenuation", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrAttenuation", 2)))));
			tabela.setAtnUp(new Double(TelnetUtil.tratamentoStringKeymile("\\ # CurrAttenuation", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "CurrAttenuation", 1)))));
			
			// PROFILE APLICADO
			tabela.setProfile(new String(TelnetUtil.tratamentoStringKeymile("\\ # Name", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Name", 1)))));

			// MODULAÇÃO APLICADA
			tabela.setModulacao(new String(TelnetUtil.tratamentoStringKeymile("\\ # Name", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "Name", 5)))));

			// AdministrativeStatus
			tabela.setPortaAdmStatus(new String(TelnetUtil.tratamentoStringKeymile("\\ # State", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "State", 1)))));
		
			// AdministrativeStatus
			tabela.setSincronismoStatus(new String(TelnetUtil.tratamentoStringKeymile("\\ # State", retorno.get(TelnetUtil.posicaoArrayDeSubString(retorno, "State", 2)))));
			
			return tabela;
		}
	}
	
	
	/**
	 * Retorna sintaxe Bandstatus
	 * @param tbs
	 * @return
	 */
	public String cmdBandStatus(InfoTBS tbs){
		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/status/bandstatus";
	}
	
	/*
	 * Retorna o perfil do canal (profile) 	
	 */
	public String cmdChanProfile(InfoTBS tbs){
		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/chan-1/cfgm/chanprofile";
	}
	
	/*
	 * Retorna o perfil da porta (modulação) 	
	 */
	public String cmdPortProfile(InfoTBS tbs){
		return "get /unit-" + tbs.getSlot() + "/port-" + tbs.getPortNumber() + "/cfgm/portprofiles";
	}

	@Override
	public void consultarBridges(Cadastro cadastro) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
