package entidades.cliente.produto;

public class ProdutoLinha implements ProdutoInterface{
	
	private String tecnologia;
	
	public ProdutoLinha() {

	}

	@Override
	public Boolean is_Vazio() {
		return tecnologia.isEmpty();
	}
	
	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}
}
