package entidades.banda.parametros;

public class TabelaParametrosMetalicoVdsl extends TabelaParametrosMetalico implements TabelaParametrosInter{
	
	private Double snrDown2;
	
	private Double snrUp2;
	
	private Double snrDown3;
	
	private Double snrUp3;

	private Double atnDown2;
	
	private Double atnUp2;
	
	private Double atnUp3;

	private Double atnDown3;
	
	public TabelaParametrosMetalicoVdsl() {
	
	}

	public Double getSnrDown2() {
		return snrDown2;
	}

	public void setSnrDown2(Double snrDown2) {
		this.snrDown2 = snrDown2;
	}

	public Double getSnrUp2() {
		return snrUp2;
	}

	public void setSnrUp2(Double snrUp2) {
		this.snrUp2 = snrUp2;
	}

	public Double getAtnDown2() {
		return atnDown2;
	}

	public void setAtnDown2(Double atnDown2) {
		this.atnDown2 = atnDown2;
	}

	public Double getAtnUp2() {
		return atnUp2;
	}

	public void setAtnUp2(Double atnUp2) {
		this.atnUp2 = atnUp2;
	}
	public Double getSnrDown3() {
		return snrDown3;
	}

	public void setSnrDown3(Double snrDown3) {
		this.snrDown3 = snrDown3;
	}

	public Double getSnrUp3() {
		return snrUp3;
	}

	public void setSnrUp3(Double snrUp3) {
		this.snrUp3 = snrUp3;
	}

	public Double getAtnUp3() {
		return atnUp3;
	}

	public void setAtnUp3(Double atnUp3) {
		this.atnUp3 = atnUp3;
	}

	public Double getAtnDown3() {
		return atnDown3;
	}

	public void setAtnDown3(Double atnDown3) {
		this.atnDown3 = atnDown3;
	}
	
	@Override
	public TabelaParametrosMetalicoVdsl getTabelaMetalicoVdsl() {
		// TODO Auto-generated method stub
		return this;
	}
}
