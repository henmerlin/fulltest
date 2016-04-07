package model.telnet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import entidades.credenciais.Credencial;

/**
 * Telnet class utilizando Sockets Java 
 * @version 1.0
 * @since 07/03/2015
 * @author G0042204
 *
 */
public class Telnet {

	// Ip do equipamento a ser consultado
	private String ip;

	// Credencial para cada sessão telnet
	public Credencial auth;

	// Lista de Comandos enviados por telnet
	private List<ComandoTelnet> comandos;

	// Define comportamento de execução de comando
	private ExecutionType mode;


	public Telnet() {
		this.comandos = new ArrayList<ComandoTelnet>();
	}

	public Telnet(String ip, Credencial auth) {
		this.ip = ip;
		this.auth = auth;
		this.comandos = new ArrayList<ComandoTelnet>();
	}	

	public List<String> run() throws Exception{

		// Valida a existencia de comando
		if(this.comandos.size() == 0){
			throw new Exception("A lista de comandos está vazia.");
		}

		try {
			Socket pingSocket = new Socket(this.ip, 23);
			PrintWriter out = new PrintWriter(pingSocket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(pingSocket.getInputStream()));
			Thread.sleep(1000);

			List<String> retorno = this.execType(out, in);

			out.close();
			in.close();
			pingSocket.close();

			return retorno;

		} catch (Exception e) {
			throw new Exception("Falha ao realizar conexão com DSLAM.");
		}finally {
			// Realizar chamada para Log
		}

	}

	public List<String> keymileMode(PrintWriter out, BufferedReader in) throws Exception{

		ArrayList<String> retorno = new ArrayList<String>();

		out.println(this.auth.getUser());
		out.println(this.auth.getPass());

		for (ComandoTelnet comandoTelnet : this.getComandos()) {
			out.println(comandoTelnet.getSintaxe());
		}

		out.println("||");

		for (int i = 0; i < 999; i++) {

			String line = in.readLine();

			retorno.add(line);

			if (line.contains("||")) {
				break;
			}

		}

		return retorno;
	}

	public List<String> execType(PrintWriter out, BufferedReader in) throws Exception{

		if (this.mode.equals(ExecutionType.KEYMILE)) {
			return this.keymileMode(out, in);
		}else if (this.mode.equals(ExecutionType.ZHONE)) {
			return this.zhoneMode(out, in);
		}else if (this.mode.equals(ExecutionType.ZHONE_SLOW)) {
			return this.zhoneSlowMode(out, in);
		}else if (this.mode.equals(ExecutionType.ZHONE_MXK)) {
			return this.zhoneMxkMode(out, in);
		}else{
			return this.keymileMode(out, in);
		}
	}

	public List<String> zhoneMode(PrintWriter out, BufferedReader in) throws Exception{

		ArrayList<String> retorno = new ArrayList<String>();

		out.println(this.auth.getUser() + "\r\n");
		Thread.sleep(1000);
		out.println(this.auth.getPass() + "\r\n");
		Thread.sleep(1000);

		for (ComandoTelnet comandoTelnet : this.getComandos()) {

			out.println(comandoTelnet.getSintaxe() + "\n");
			Thread.sleep(1000);
			retorno.add(in.readLine());

		}

		out.println("||");

		for (int i = 0; i < 999; i++) {

			String line = in.readLine();

			retorno.add(line);

			if (line.contains("||")) {
				break;
			}

		}

		return retorno;
	}

	public List<String> zhoneSlowMode(PrintWriter out, BufferedReader in) throws Exception{

		long le_begin = System.nanoTime();

		ArrayList<String> retorno = new ArrayList<String>();

		Thread.sleep(500);
		out.println(this.auth.getUser() + "\r\n");
		Thread.sleep(1000);
		out.println(this.auth.getPass() + "\r\n");
		Thread.sleep(1000);

		long leduracion = 0;
		long maximo = 8400;

		for (ComandoTelnet comandoTelnet : this.getComandos()) {

			if(comandoTelnet.getSintaxe().contentEquals("A")){
				out.println(comandoTelnet.getSintaxe());
			}			
			out.println(comandoTelnet.getSintaxe() + "\n");

			String ret;

			int i = 0;

			do {
				Thread.sleep(15);
				i++;
				long le_now = System.nanoTime();
				long duracion = (le_now - le_begin)/1000000;

				//System.out.println(i);

				//				if(duracion>maximo){
				//					leduracion = duracion;
				//					break;
				//				}else{
				//					System.out.println("Duracion -> " + duracion);
				//				}
				ret = in.readLine();

				if(ret.length() > 0){
					retorno.add(ret);
				}



				/**
				 * acho que era melhor na condicao do while verificar pela segunda ocorrencia de zSH> porem nao deu pe... nao sei o que fiz de errado...afinal, pq existem 2 .indexOf?
				 * parece que quanto melhor(mais rapido) o processamento, mais trava e fica parado la pelo i = 146
				 * obviamente as condicoes do while atual sao apenas para o dslstat...
				 * e ainda por cima tem que ver o que fazer com o ATM HEC Count... da um crtl+f na crianca ali em baixo pra ver... T_T
				 * 
				 * o pior eh que a praga nem entra no bloco do if pra verificar se 'timeoutou' quando trava D=
				 * 
				 * parece que i == 146 resolveu...porem ao trocar o DSLAM ja lascou e teria que ser 143
				 * como prever o i que da merda? .-.'
				 * 
				 * pode ser impressao porem depois do horario da operacao ficou 1 a 2,5 sec faster
				 * 
				 */
			} while (!(ret.contains("ATM NCD")) && !(ret.contains("?Invalid command")) && i != 142);						
		}		
		//		for (String string : retorno) {
		//			System.out.println(string);
		//		}
		//		
		//		System.out.println("Duracion leitura -> " + leduracion);
		//
		//		long le_ahora = System.nanoTime();
		//		long duracione = (le_ahora - le_begin)/1000000;
		//		
		//		System.out.println("Duracion total -> " + duracione);

		return retorno;
	}


	public List<String> zhoneMxkMode(PrintWriter out, BufferedReader in) throws Exception{

		ArrayList<String> retorno = new ArrayList<String>();

		out.println(this.auth.getUser() + "\r\n");
		Thread.sleep(1000);
		out.println(this.auth.getPass() + "\r\n");
		Thread.sleep(1000);

		for (ComandoTelnet comandoTelnet : this.getComandos()) {

			out.println(comandoTelnet.getSintaxe() + "\n");
			Thread.sleep(1000);

		}

		out.println("||");

		for (int i = 0; i < 999; i++) {

			String line = in.readLine();

			retorno.add(line);

			if (line.contains("||")) {
				break;
			}

		}

		return retorno;
	}

	public Credencial getAuth() {
		return auth;
	}

	public void setAuth(Credencial auth) {
		this.auth = auth;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public static void nortelTest() throws Exception {

		Socket pingSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		String ip = "10.141.0.99";

		try {
			pingSocket = new Socket(ip, 23);
			out = new PrintWriter(pingSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(pingSocket.getInputStream()));
		} catch (Exception e) {
			return;
		}

		in.readLine();
		in.readLine();

		out.println("G0042204\n");
		out.println("d20m08\n");
		out.println("servord\n");
		out.println("qdn 4130222839\n");


		while (! (in.readLine().isEmpty())) {
			System.out.println(in.readLine());
		}


		while (! (in.readLine().isEmpty())) {
			System.out.println(in.readLine());
		}


		out.println("logout");
		out.close();
		in.close();
		pingSocket.close();

	}

	public List<ComandoTelnet> getComandos() {
		return comandos;
	}

	public void setComandos(List<ComandoTelnet> comandos) {
		this.comandos = comandos;
	}

	public ExecutionType getMode() {
		return mode;
	}

	public void setMode(ExecutionType mode) {
		this.mode = mode;
	}
}
