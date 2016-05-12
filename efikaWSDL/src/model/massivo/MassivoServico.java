package model.massivo;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.primefaces.model.UploadedFile;

import com.opencsv.CSVReader;

import entidades.cliente.Cliente;
import entidades.massivo.Lote;
import entidades.massivo.Status;
import entidades.massivo.Teste;
import entidades.validacao.ParecerTeste;
import entidades.validacao.Resolucao;
import entidades.validacao.Verificacao;
import model.modulos.OperacionalServico;
import util.JSFUtil;
import webservices.Usuario;

@Stateless
public class MassivoServico {

	@PersistenceContext(unitName="vu")  
	private EntityManager entityManager;

	private CSVReader csvReader;
	
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

	/**
	 * 
	 * @param nomeArquivo
	 * @throws Exception
	 */
	public void importCSV(String nomeArquivo) throws Exception {

		String[] row = null;
		String csvFilename = "C:\\UploadedFiles\\MassivoVoz\\" + nomeArquivo + ".csv";

		csvReader = new CSVReader(new FileReader(csvFilename), ';');

		List<?> content = csvReader.readAll();

		Lote lote = new Lote();
		lote.setStatus(new Status(1));
		lote.setNome(nomeArquivo);
		lote.setHoraIntegracao(new Date());

		this.entityManager.persist(lote);

		for (Object object : content) {

			row = (String[]) object;

			try {

				Teste teste = new Teste();
				teste.setInstancia(row[0]);
				teste.setLote(lote);
				this.entityManager.persist(teste);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}			

		}
	}

	@SuppressWarnings("unchecked")
	public List<Teste> listaLinhas() throws Exception {

		try {

			Query query = this.entityManager.createQuery("FROM Teste t WHERE t.processado =:param1 ORDER BY t.dataEntrada ASC");
			query.setParameter("param1", false);
			query.setMaxResults(1);
			return (List<Teste>) query.getResultList();	

		} catch (Exception e) {

			throw new Exception("Não possui linhas para serem testadas!");

		}	

	}

	public void fazTeste(Teste teste) {
		
		Teste t = new Teste();
		t = entityManager.merge(teste);
		t.setProcessado(true);

		
		List<ParecerTeste> pareceres = new ArrayList<ParecerTeste>();
		
		ParecerTeste parecerCentral = new ParecerTeste(teste, new Verificacao(1));
		ParecerTeste parecerConect =  new ParecerTeste(teste, new Verificacao(2));
		
		OperacionalServico ft = new OperacionalServico();

		try {

			Cliente cliente = ft.consultarInstancia(teste.getInstancia());
			
			Resolucao central = ft.validarRegistroCentral(cliente);		
			Resolucao conectividade = ft.validarConectividade(cliente);		
			
			parecerCentral.setResolucao(central);
			parecerConect.setResolucao(conectividade);

		} catch (Exception e) {
			
			parecerCentral.setResolucao(new Resolucao(5));
			parecerConect.setResolucao(new Resolucao(5));
			

		}finally{
			
			pareceres.add(parecerCentral);
			pareceres.add(parecerConect);
			t.setPareceres(pareceres);
			
			this.entityManager.persist(parecerCentral);
		}		
	}

}
