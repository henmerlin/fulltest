package entidades.cliente.produto;

public class ProdutoTv implements ProdutoInterface{
	
	private String tipo;
	
	public ProdutoTv() {

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public Boolean is_Vazio() {
		// TODO Auto-generated method stub
		return tipo.isEmpty();
	}
}
