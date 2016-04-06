package util;

import java.util.ArrayList;

public class TelnetUtil {

	public static String tratamentoStringKeymile(String substringFinal, String string) throws Exception{

		if(string.isEmpty()){
			throw new Exception("Falha ao tratar resposta do DSLAM.");
		}
		
		int fim = string.indexOf(substringFinal);
		String reg = null;
		reg = (String) string.subSequence(0, fim);
		if(reg.contains("\"")){
			reg = reg.replaceAll("\"", "");
		}
		return reg.trim();
	}
	
	public static Integer posicaoArrayDeSubString(ArrayList<String> array, String substring, Integer ocorrencia) throws Exception{
		
		int k = 1;
		
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i).contains(substring)){
				if(ocorrencia.equals(k)){
					return i;
				}else{
					k++;
				}
			}
		}
		
		throw new Exception("Falha ao tratar resposta do DSLAM.");
	}
	
	public static void debugger(ArrayList<String> retorno){
		
		for (int i = 0; i < retorno.size(); i++) {
			System.out.println(i + ": " + retorno.get(i));
		}
		
	}
	
	public static Integer contarOcorrenciaStringArray(ArrayList<String> retorno, String substring){
	
		int ocorrencia = 0;
		
		for (int i = 0; i < retorno.size(); i++) {
			
			if(retorno.get(i).contains(substring)){
				ocorrencia++;
			}
		}
		
		return ocorrencia;
	}

}
