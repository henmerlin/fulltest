package model;

import entidades.banda.metalico.keymile.Keymile;
import entidades.cliente.Cliente;
import model.banda.metalico.keymile.KeymileServico;
import model.modulos.OperacionalServico;

public class Teste {

	public static void main(String[] args) throws Exception {
		
		
		
		
		try {
						
			Cliente cliente = new Cliente();
			cliente.setInstancia("2131762236");
			OperacionalServico servico = new OperacionalServico();
			cliente = servico.consultarCadastro(cliente);
						
			KeymileServico milho = new KeymileServico();
			milho.setCadastro(cliente.getCadastro());
			milho.connect();
			
			Keymile banda = new Keymile();
			
			milho.consultarBridges(banda);
						
			milho.disconnect();
			
			
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
			


	}
}

