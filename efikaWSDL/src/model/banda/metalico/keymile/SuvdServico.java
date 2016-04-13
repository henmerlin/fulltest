package model.banda.metalico.keymile;

import java.util.ArrayList;

import entidades.banda.BandaInterface;
import entidades.banda.parametros.TabelaParametrosInter;
import entidades.banda.parametros.TabelaParametrosMetalico;
import entidades.banda.parametros.TabelaParametrosMetalicoVdsl;
import entidades.cadastro.Cadastro;
import model.banda.BandaServicoInterface;
import model.telnet.ComandoTelnet;
import util.TelnetUtil;

public class SuvdServico extends KeymileServico implements BandaServicoInterface{

	public SuvdServico() {
		
	}

public TabelaParametrosInter consultarTabelaParametros() throws Exception {
		
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdChanStatus()));
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdBandStatus()));
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdChanProfile()));
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdPortProfile()));
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdAdminStatus()));
		this.getSocket().getComandos().add(new ComandoTelnet(this.cmdOperStatus()));
		
		ArrayList<String> retorno = (ArrayList<String>) this.getSocket().run();
		
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
	public String cmdBandStatus(){
		return "get /unit-" + this.getTbs().getSlot() + "/port-" + this.getTbs().getPortNumber() + "/status/bandstatus";
	}
	
	/*
	 * Retorna o perfil do canal (profile) 	
	 */
	public String cmdChanProfile(){
		return "get /unit-" + this.getTbs().getSlot() + "/port-" + this.getTbs().getPortNumber() + "/chan-1/cfgm/chanprofile";
	}
	
	/*
	 * Retorna o perfil da porta (modulação) 	
	 */
	public String cmdPortProfile(){
		return "get /unit-" + this.getTbs().getSlot() + "/port-" + this.getTbs().getPortNumber() + "/cfgm/portprofiles";
	}

	@Override
	public BandaInterface consultarBridges(BandaInterface banda) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
