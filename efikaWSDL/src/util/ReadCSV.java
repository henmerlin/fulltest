package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSV{
	
	private String fullname;

	public ReadCSV(String fullname) {
		this.fullname = fullname;
	}
	
	public ArrayList<String> run() {

		String csvFile = this.fullname;
		BufferedReader br = null;
		String line = "";
		
		ArrayList<String> retorno = new ArrayList<String>();

		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				retorno.add(line.trim());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return retorno;
	}

}