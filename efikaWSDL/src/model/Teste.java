package model;

import java.io.IOException;
import java.rmi.RemoteException;

import entidades.cliente.Cliente;
import exception.ossturbonet.oss.gvt.com.DataNotFoundException;
import exception.ossturbonet.oss.gvt.com.OSSTurbonetException;
import model.banda.BandaServico;
import model.cliente.ClienteServico;
import model.linha.LinhaServico;

public class Teste {
	
	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		LinhaServico servicoLinha = new LinhaServico();
		BandaServico servicoBanda = new BandaServico();
		ClienteServico servicoCliente = new ClienteServico();
		
		String instancia = "1530232072";
		
		cliente.setInstancia(instancia);
		

		
		String designador;
		try {
			designador = servicoBanda.getDesignatorByAccessDesignator(instancia);
			
			System.out.println(designador);
//			
//			cliente.setDesignador(designador);
//			
//			cliente = servicoCliente.consultar(cliente);
//			
//			cliente.setLinha(servicoLinha.consultar(cliente.getInstancia()));
			
			
		} catch (DataNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OSSTurbonetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
