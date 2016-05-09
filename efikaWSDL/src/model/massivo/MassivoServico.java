package model.massivo;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.primefaces.model.UploadedFile;

import com.opencsv.CSVReader;

import entidades.cliente.Cliente;
import entidades.massivo.LogInstancia;
import entidades.massivo.Lote;
import model.modulos.OperacionalServico;
import util.JSFUtil;
import webservices.Usuario;

@Stateless
public class MassivoServico {
	
	@PersistenceContext(unitName="vu")  
	private EntityManager entityManager;

	public MassivoServico() {
		
	}
	
	public void salvaLote(UploadedFile file, Usuario usuario) {
		
		try {
			
			byte[] conteudo = file.getContents();
			
			Date date = new Date();
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy-HH_mm_ss");
			
			String nome = usuario.getLogin() + "-" + dateFormat.format(date);
			
			String fullname = "C:\\UploadedFiles\\MassivoVoz\\" + nome + ".csv";
			
			FileOutputStream fos = new FileOutputStream(fullname);
			
			fos.write(conteudo);
			fos.close();
			
			this.importCSV(nome);
			
		} catch (Exception e) {
			
			JSFUtil.addErrorMessage(e.getMessage());
			
		}
		
	}
	
	@SuppressWarnings({ "rawtypes", "resource" })
	public void importCSV(String nomeArquivo) throws Exception {
		
		String[] row = null;
		String csvFilename = "C:\\UploadedFiles\\MassivoVoz\\" + nomeArquivo + ".csv";
		
		CSVReader csvReader = new CSVReader(new FileReader(csvFilename), ';');
		
		List content = csvReader.readAll();
		
		Lote lote = new Lote();
		
		Date date = new Date();
		
		lote.setNome(nomeArquivo);
		lote.setHoraIntegracao(date);
				
		this.entityManager.persist(lote);
		
		for (Object object : content) {
			
			row = (String[]) object;
			
			OperacionalServico fullteste = new OperacionalServico();
			
			try {
				
				Cliente cliente = fullteste.consultarInstancia(row[0]);				
							
				this.salvaLog(cliente.getInstancia(), true);				
								
			} catch (Exception e) {
				
				this.salvaLog(row[0], false);
				
			}			
			
		}		
		
	}	
	
	public void salvaLog(String instancia, Boolean status) {
		
		LogInstancia log = new LogInstancia();
		
		Date date = new Date();
				
		log.setInstancia(instancia);
		log.setHoraAcao(date);
		log.setStatus(status);
		
		this.entityManager.persist(log);
				
	}
	

}
