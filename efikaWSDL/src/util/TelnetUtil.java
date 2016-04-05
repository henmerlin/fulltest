package util;

import java.util.ArrayList;

public class TelnetUtil {

	public static String tratamentoStringKeymile(String substringFinal, String string){

		int fim = string.indexOf(substringFinal);
		String reg = null;
		reg = (String) string.subSequence(0, fim);

		return reg.trim();
	}
	
	public static void debugger(ArrayList<String> retorno){
		
		for (int i = 0; i < retorno.size(); i++) {
			System.out.println(i + ": " + retorno.get(i));
		}
		
	}

}
