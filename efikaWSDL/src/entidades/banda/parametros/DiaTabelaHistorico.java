package entidades.banda.parametros;

import java.math.BigInteger;
import java.util.Date;

public class DiaTabelaHistorico {

	private BigInteger resync;
	
	private BigInteger crcDown;
	
	private BigInteger crcUp;
	
	private BigInteger fecDown;

	private BigInteger fecUp;
	
	private BigInteger pcktsDown;

	private BigInteger pcktsUp;
	
	private Date data;
		
	public DiaTabelaHistorico() {

	}

	public DiaTabelaHistorico(BigInteger resync, BigInteger crcDown, BigInteger crcUp, BigInteger fecDown,
			BigInteger fecUp, BigInteger pcktsDown, BigInteger pcktsUp, Date data) {
		super();
		this.resync = resync;
		this.crcDown = crcDown;
		this.crcUp = crcUp;
		this.fecDown = fecDown;
		this.fecUp = fecUp;
		this.pcktsDown = pcktsDown;
		this.pcktsUp = pcktsUp;
		this.data = data;
	}
	
	public BigInteger getResync() {
		return resync;
	}

	public void setResync(BigInteger resync) {
		this.resync = resync;
	}

	public BigInteger getCrcDown() {
		return crcDown;
	}

	public void setCrcDown(BigInteger crcDown) {
		this.crcDown = crcDown;
	}

	public BigInteger getCrcUp() {
		return crcUp;
	}

	public void setCrcUp(BigInteger crcUp) {
		this.crcUp = crcUp;
	}

	public BigInteger getFecDown() {
		return fecDown;
	}

	public void setFecDown(BigInteger fecDown) {
		this.fecDown = fecDown;
	}

	public BigInteger getFecUp() {
		return fecUp;
	}

	public void setFecUp(BigInteger fecUp) {
		this.fecUp = fecUp;
	}

	public BigInteger getPcktsDown() {
		return pcktsDown;
	}

	public void setPcktsDown(BigInteger pcktsDown) {
		this.pcktsDown = pcktsDown;
	}

	public BigInteger getPcktsUp() {
		return pcktsUp;
	}

	public void setPcktsUp(BigInteger pcktsUp) {
		this.pcktsUp = pcktsUp;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}		
}
