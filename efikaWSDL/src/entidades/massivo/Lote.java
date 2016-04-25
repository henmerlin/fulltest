package entidades.massivo;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lote {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String nome;
	
	private List<String> instancias;
		
	private Date dataUpload;
	
	public Lote() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataUpload() {
		return dataUpload;
	}

	public void setDataUpload(Date dataUpload) {
		this.dataUpload = dataUpload;
	}

	public List<String> getInstancias() {
		return instancias;
	}

	public void setInstancias(List<String> instancias) {
		this.instancias = instancias;
	}

}
