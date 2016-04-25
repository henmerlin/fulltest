package model.modulos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.primefaces.model.UploadedFile;

import entidades.massivo.Lote;
import util.JSFUtil;
import util.ReadCSV;

public class MassivoServico {
	
	
	public MassivoServico() {
	
	}
	
	public Lote criarLote(UploadedFile file) throws IOException{
		
		byte[] conteudo = file.getContents();
		
		String nome = JSFUtil.gerarStringAleatoria(20);
		
		String fullname = "C:/temp/" + nome + ".csv";
		
		FileOutputStream fos = new FileOutputStream(fullname);
		
		fos.write(conteudo);
		fos.close();
		
		ReadCSV csv = new ReadCSV(fullname);
		ArrayList<String> instancias = csv.run();
		
		Lote lote = new Lote();
		lote.setNome(nome);
		lote.setDataUpload(new Date());
		lote.setInstancias(instancias);
		
		return lote;
	}
	
}
