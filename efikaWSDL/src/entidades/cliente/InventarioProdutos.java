package entidades.cliente;

import entidades.cliente.produto.ProdutoBanda;
import entidades.cliente.produto.ProdutoLinha;
import entidades.cliente.produto.ProdutoTv;

public class InventarioProdutos {
	
	private ProdutoLinha linha;
	
	private ProdutoBanda banda;
	
	private ProdutoTv tv;
	
	public InventarioProdutos() {

	}

	public ProdutoBanda getBanda() {
		return banda;
	}

	public void setBanda(ProdutoBanda banda) {
		this.banda = banda;
	}

	public ProdutoLinha getLinha() {
		return linha;
	}

	public void setLinha(ProdutoLinha linha) {
		this.linha = linha;
	}

	public ProdutoTv getTv() {
		return tv;
	}

	public void setTv(ProdutoTv tv) {
		this.tv = tv;
	}
}
