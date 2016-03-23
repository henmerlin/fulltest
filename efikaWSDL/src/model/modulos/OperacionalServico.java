package model.modulos;

import br.com.gvt.www.oss.necservice.ConsultElement;
import entidades.cliente.Cliente;
import model.cliente.ClienteServico;
import model.factory.LinhaFactory;
import model.linha.LinhaServico;
import model.linha.LinhaServicoInterface;

public class OperacionalServico implements OperacionalInterface{

	private LinhaServico servicoLinha;

	//private BandaServico servicoBanda;

	private ClienteServico servicoCadastro;

	// Serviço FullTest
	private LinhaServicoInterface servicoVoz;

	public OperacionalServico() {
		this.servicoLinha = new LinhaServico();
		//this.servicoBanda = new BandaServico();
		this.servicoCadastro = new ClienteServico();
	}

	/**
	 * Inicio do FullTest
	 */
	public Cliente consultar(Cliente cliente) throws Exception{

		// Consultas de Cadastro
		cliente = this.servicoCadastro.consultar(cliente);	
		cliente = this.servicoLinha.consultar(cliente);

		// Constroí serviços de acordo com cadastro
		this.servicoVoz = LinhaFactory.criarServico(cliente.getLinha().getTecnologia());

		cliente = this.servicoVoz.consultarConfiguracoes(cliente);
		
		// Consulta de Informações da Central
		cliente.getLinha().setInfoSwitch(this.servicoLinha.getNumberInfo(cliente.getLinha().getInstancia()));
		cliente.getLinha().setInfoInstancia(this.servicoLinha.getInformacoesInstancia((cliente.getLinha().getInstancia())));
		
		
		
		ConsultElement[] oi = this.servicoLinha.consultarElemento(cliente.getInstancia(), cliente.getLinha());

		

		return cliente;
	}

}