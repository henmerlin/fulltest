package model;

import java.rmi.RemoteException;

import entidades.cliente.Cliente;
//import model.banda.BandaServico;
import model.cliente.ClienteServico;
//import model.linha.LinhaServico;

public class Teste {
	
	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		//LinhaServico servicoLinha = new LinhaServico();
		//BandaServico servicoBanda = new BandaServico();
		ClienteServico servicoCliente = new ClienteServico();
		
		cliente.setInstancia("4130222839");
		cliente.setDesignador("CTA-811C0EFT9-013");
		
		try {
			cliente = servicoCliente.consultar(cliente);
			System.out.println(cliente.getUploadCrm());
			
		} catch (RemoteException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
