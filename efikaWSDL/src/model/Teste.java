package model;

import model.banda.metalico.keymile.SuadServico;


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


//		ClienteServico serv = new ClienteServico();
//
//		InventoryAccountResponse inventario = serv.getAccountItems("4133280564");

		
		SuadServico suad = new SuadServico();
		
		suad.consultarTabelaParametros();

				
	}
}

