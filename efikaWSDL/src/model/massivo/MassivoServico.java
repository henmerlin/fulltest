package model.massivo;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.primefaces.model.UploadedFile;

import com.opencsv.CSVReader;

import entidades.cliente.Cliente;
import entidades.massivo.Lote;
import entidades.massivo.Teste;
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

	@SuppressWarnings({ "rawtypes", "resource"})
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

			//OperacionalServico fullteste = new OperacionalServico();

			try {

				Teste teste = new Teste();

				teste.setInstancia(row[0]);
				teste.setLote(lote);
				teste.setStatus(true);

				this.entityManager.persist(teste);

				//Cliente cliente = fullteste.consultarInstancia(row[0]);				

				//System.out.println(cliente.getLinha().getTecnologia());

			} catch (Exception e) {

				System.out.println("Erro ao inserir linha no banco.");

			}			

		}		

	}

	@SuppressWarnings("unchecked")
	public List<Teste> listaLinhas() throws Exception {

		try {
			
			Query query = this.entityManager.createQuery("FROM Teste t WHERE t.status =:param1");
			query.setParameter("param1", true);
			query.setMaxResults(1);
			return (List<Teste>) query.getResultList();	
			
		} catch (Exception e) {
			
			throw new Exception("Não possui linhas para serem testadas!");

		}	

	}

	@SuppressWarnings("unused")
	public void fazTeste(Teste teste) {

		OperacionalServico fullteste = new OperacionalServico();
		
		try {
			
			teste.setStatus(false);
			
			this.entityManager.merge(teste);
			
			Cliente cliente = fullteste.consultarInstancia(teste.getInstancia());
									
		} catch (Exception e) {
			
			//System.out.println("Erro ao realizar teste da instancia.");
			
		}

		
	}

}
