package model;

import java.math.BigInteger;

import bean.ossturbonet.oss.gvt.com.GetInfoOut;
import bean.ossturbonet.oss.gvt.com.InfoTBS;
import entidades.banda.metalico.keymile.Keymile;
import entidades.banda.metalico.zhone.Combo;
import entidades.cliente.Cliente;
import model.banda.metalico.keymile.KeymileServico;
import model.banda.metalico.zhone.ComboServico;
import model.modulos.OperacionalServico;

public class Teste {

	public static void main(String[] args) throws Exception {
		
		
		
		
		try {
			
		
			OperacionalServico fulltest = new OperacionalServico();
			
			Cliente cliente = new Cliente();
			
			cliente.setInstancia("8532836631");
			
			fulltest.consultar(cliente);
			
			KeymileServico milho = new KeymileServico();
			
			milho.setCadastro(cliente.getCadastro());
			
			milho.connect();
			
			Keymile banda = new Keymile();
			
			milho.consultarBridges(banda);
			
			milho.disconnect();
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			


	}
}

