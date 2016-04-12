package util;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

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


	/**
	 * Tratamento para string com esse perfil:
	 * 	CRC errors on interleaved buffer.............0
	 * @param string
	 * @return
	 * @throws Exception
	 */
	public static String tratamentoStringZhone(String string) throws Exception{
		return (String) string.subSequence(string.lastIndexOf(".") + 1, string.length());
	}

	/**
	 * Tratamento para string com esse perfil:
	 * 	 fastMaxTxRate: ------------>  {12800000}
	 * @param string
	 * @return
	 * @throws Exception
	 */
	public static String tratamentoStringZhoneDif(String string) throws Exception{
		return (String) string.subSequence(string.lastIndexOf("{") + 1, string.length() - 1);
	}

	public static String tratamentoStringZhoneGpon(String string) throws Exception{	

		return "";
	}

	/**
	 * Tratamento para string com esse perfil:
	 * 
	 * @param string
	 * @return
	 * @throws Exception
	 * */	
	public static String tratamentoStringAlcatel(String string) throws Exception {

		return (String) string.subSequence(string.lastIndexOf(":") + 1, string.length());

	}

	/**
	 * Tratamento para string com esse perfil:
	 * 
	 * @param string
	 * @return
	 * @throws Exception
	 * */	
	public static String tratamentoStringAlcatel2(String string) throws Exception {

		String trat = (String) string.subSequence(string.lastIndexOf("e\">") +3, string.length() - 7);

		if (trat.equals("no")){
			trat = "UP";
		}else{
			trat = "DOWN";
		}

		return trat;

	}

	public static String tratamentoStringBridgeShowVlan(String string1) throws Exception {

		String trat = (String) string1.subSequence(string1.lastIndexOf("Tg") + 8, string1.length() - 35);

		return trat;

	}

	public static String tratamentoStringBridgeShowVlan2(String string) throws Exception {

		return (String) string.subSequence(string.lastIndexOf("dwn"), string.length());

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
			System.out.println(retorno.get(i));
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


	public static Date formatarDateDeMenosParametro(Integer i) throws ParseException{

		LocalDate hoje = LocalDate.now();
		LocalDate stringData = hoje.plusDays(1 - i);
		DateFormat data = new SimpleDateFormat("yyyy-MM-dd");

		return data.parse(stringData.toString());
	}


}
