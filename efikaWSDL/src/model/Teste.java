package model;

import entidades.banda.parametros.TabelaHistorico;
import entidades.banda.parametros.TabelaParametrosMetalico;
import entidades.banda.parametros.TabelaParametrosMetalicoVdsl;
import model.banda.metalico.keymile.SuadServico;
import model.banda.metalico.keymile.SuvdServico;


public class Teste {

	public static void main(String[] args) throws Exception {

		/**
		 * 

		Telnet telnet = new Telnet();
		Credencial cred = new Credencial();

		//cred.setUser("admin");
		cred.setUser("manager");
		//cred.setPass("zhone");
		cred.setPass("");

		telnet.setMode(ExecutionType.KEYMILE);

		telnet.setAuth(cred);
		//telnet.setIp("10.151.58.82");
		telnet.setIp("10.161.15.223");

		//ComandoTelnet comando = new ComandoTelnet("bridge show vlan 217");
		ComandoTelnet comando = new ComandoTelnet("get /unit-1/port-28/pm/History24hTable");

		telnet.getComandos().add(comando);


		for (String string : telnet.run()) {
			System.out.println(string);
		}

		 */
		
		SuvdServico suvd = new SuvdServico();
		SuadServico suad = new SuadServico();
		
		
		
		TabelaParametrosMetalico tchau = suad.consultarTabelaParametros();
		TabelaParametrosMetalicoVdsl oi = suvd.consultarTabelaParametrosVdsl();
		TabelaParametrosMetalico ronaldo = suvd.consultarTabelaParametros();
		TabelaHistorico gaucho = suvd.consultarTabelaHistorico();
		
		System.out.println(" ");
		System.out.println("SUVD11 VDSL");
		System.out.println(" ");
		
		System.out.println("Adm Status -> " + oi.getPortaAdmStatus());
		System.out.println("Sinc Status -> " + oi.getSincronismoStatus());
		System.out.println("Modulação -> " + oi.getModulacao());
		System.out.println("Perfil -> " + oi.getProfile());
		System.out.println("Vel. Download -> " + oi.getDownload());
		System.out.println("Vel. Upload -> " + oi.getUpload());
		System.out.println("SnrDown 1 -> " + oi.getSnrDown1());
		System.out.println("SnrDown 2 -> " + oi.getSnrDown2());
		System.out.println("SnrDown 3 -> " + oi.getSnrDown3());
		System.out.println("SrnUp 1 -> " + oi.getSnrUp1());
		System.out.println("SrnUp 2 -> " + oi.getSnrUp2());
		System.out.println("SrnUp 3 -> " + oi.getSnrUp3());
		System.out.println("AtnDown 1 -> " + oi.getAtnDown1());
		System.out.println("AtnDown 2 -> " + oi.getAtnDown2());
		System.out.println("AtnDown 3 -> " + oi.getAtnDown3());
		System.out.println("AtnUp 1 -> " + oi.getAtnUp1());
		System.out.println("AtnUp 2 -> " + oi.getAtnUp2());
		System.out.println("AtnUp 3 -> " + oi.getAtnUp3());
		
		System.out.println(" ");
		System.out.println("SUAD");
		System.out.println(" ");
		
		System.out.println("Adm Status -> " + tchau.getPortaAdmStatus());
		System.out.println("Sinc Status -> " + tchau.getSincronismoStatus());
		System.out.println("Modulação -> " + tchau.getModulacao());
		System.out.println("Perfil -> " + tchau.getProfile());
		System.out.println("Vel. Download -> " + tchau.getDownload());
		System.out.println("Vel. Upload -> " + tchau.getUpload());
		System.out.println("SnrDown  -> " + tchau.getSnrDown());
		System.out.println("SnrUp -> " + tchau.getSnrUp());
		System.out.println("AtnDown  -> " + tchau.getAtnDown());
		System.out.println("AtnUp -> " + tchau.getAtnUp());
		
		System.out.println(" ");
		System.out.println("SUVD11 ADSL");
		System.out.println(" ");
		
		System.out.println("Adm Status -> " + ronaldo.getPortaAdmStatus());
		System.out.println("Sinc Status -> " + ronaldo.getSincronismoStatus());
		System.out.println("Modulação -> " + ronaldo.getModulacao());
		System.out.println("Perfil -> " + ronaldo.getProfile());
		System.out.println("Vel. Download -> " + ronaldo.getDownload());
		System.out.println("Vel. Upload -> " + ronaldo.getUpload());
		System.out.println("SnrDown  -> " + ronaldo.getSnrDown());
		System.out.println("SnrUp -> " + ronaldo.getSnrUp());
		System.out.println("AtnDown  -> " + ronaldo.getAtnDown());
		System.out.println("AtnUp -> " + ronaldo.getAtnUp());
		
		System.out.println(" ");
		System.out.println("HISTÓRICO");
		System.out.println(" ");
		
		System.out.println("Resync Hoje -> " + gaucho.getResyncHoje());
		System.out.println("Resync Ontem -> " + gaucho.getResyncOntem());
		System.out.println("Resync Anteontem -> " + gaucho.getResyncAnteontem());
		System.out.println("Pckts Down Hoje -> " + gaucho.getPcktsDownHoje());
		System.out.println("Pckts Down Ontem -> " + gaucho.getPcktsDownOntem());
		System.out.println("Pckts Down Anteontem -> " + gaucho.getPcktsDownAnteontem());
		System.out.println("Pckts Up Hoje -> " + gaucho.getPcktsUpHoje());
		System.out.println("Pckts Up Ontem -> " + gaucho.getPcktsUpOntem());
		System.out.println("Pckts Up Anteontem -> " + gaucho.getPcktsUpAnteontem());
		System.out.println("CRC Down Hoje -> " + gaucho.getCrcDownHoje());
		System.out.println("CRC Down Ontem -> " + gaucho.getCrcDownOntem());
		System.out.println("CRC Down Anteontem -> " + gaucho.getCrcDownAnteontem());
		System.out.println("CRC Up Hoje -> " + gaucho.getCrcUpHoje());
		System.out.println("CRC Up Ontem -> " + gaucho.getCrcUpOntem());
		System.out.println("CRC Up Anteontem -> " + gaucho.getCrcUpAnteontem());
		System.out.println("FEC Down Hoje -> " + gaucho.getFecDownHoje());
		System.out.println("FEC Down Ontem -> " + gaucho.getFecDownOntem());
		System.out.println("FEC Down Anteontem -> " + gaucho.getFecDownAnteontem());
		System.out.println("FEC Up Hoje -> " + gaucho.getFecUpHoje());
		System.out.println("FEC Up Ontem -> " + gaucho.getFecUpOntem());
		System.out.println("FEC Up Anteontem -> " + gaucho.getFecUpAnteontem());
		
	}
}

