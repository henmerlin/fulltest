package entidades.cliente;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import entidades.banda.BandaInterface;
import entidades.cadastro.Cadastro;
import entidades.linha.LinhaInterface;

public class Cliente {
	
	@NotEmpty
	@Length(min=10, max=12, message="Instância inválida!")
	private String instancia;
	
	private String designador;
	
	private String designadorAcesso;
	
	private InventarioProdutos inventario;
	
	private LinhaInterface linha;

	private BandaInterface banda;
	
	private Cadastro cadastro;

	public Cliente() {
		
	}

	public String getInstancia() {
		return instancia;
	}

	public void setInstancia(String instancia) {
		this.instancia = instancia;
	}
	public BandaInterface getBanda() {
		return banda;
	}

	public void setBanda(BandaInterface banda) {
		this.banda = banda;
	}

	public LinhaInterface getLinha() {
		return linha;
	}

	public void setLinha(LinhaInterface linha) {
		this.linha = linha;
	}

	public String getDesignador() {
		return designador;
	}

	public void setDesignador(String designador) {
		this.designador = designador;
	}

	public String getDesignadorAcesso() {
		return designadorAcesso;
	}

	public void setDesignadorAcesso(String designadorAcesso) {
		this.designadorAcesso = designadorAcesso;
	}

	public InventarioProdutos getInventario() {
		return inventario;
	}

	public void setInventario(InventarioProdutos inventario) {
		this.inventario = inventario;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
}
