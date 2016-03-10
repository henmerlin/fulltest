package model.telnet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import entidades.credenciais.Credencial;

/**
 * Telnet class utilizando Sockets Java 
 * @version 1.0
 * @since 07/03/2015
 * @author G0042204
 *
 */
public class Telnet {
	
	private String ip;
	
	public Credencial auth;

	
	public Telnet() {

	}
	
	public static void main(String[] args) {
		
		try {
			keymileTest();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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

	public static void zhoneTest() throws IOException, InterruptedException {

		Socket pingSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		String ip = "10.151.58.82";
				

		pingSocket = new Socket(ip, 23);
		out = new PrintWriter(pingSocket.getOutputStream(), true);
		in = new BufferedReader(new InputStreamReader(pingSocket.getInputStream()));

		Thread.sleep(1000);
		
		out.println("admin" + "\r\n");
		Thread.sleep(1000);
		System.out.println(in.readLine());

		
		out.println("zhone\r\n");
		Thread.sleep(1000);
		System.out.println(in.readLine());

		
		out.println("bridge show vlan 217\n");
		Thread.sleep(1000);
		System.out.println(in.readLine());

		out.println("||");

		
		for (int i = 0; i < 200; i++) {
			
			String line = in.readLine();
			
			System.out.println(line);
			
			
			if (line.contains("||")) {
				break;
			}
			
		}
		
		System.out.println("end");

		out.close();
		in.close();
		pingSocket.close();

	}
	
	public static void keymileTest() throws IOException {

		Socket pingSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		String ip = "10.161.15.223";

		pingSocket = new Socket(ip, 23);
		out = new PrintWriter(pingSocket.getOutputStream(), true);
		in = new BufferedReader(new InputStreamReader(pingSocket.getInputStream()));

		out.println("manager");
		out.println("");
		
		
		out.println("get /unit-1/port-28/pm/History24hTable");

		in.readLine();
		in.readLine();

		while (! (in.readLine().isEmpty())) {
			System.out.println(in.readLine());
		}


		out.close();
		in.close();
		pingSocket.close();

	}
	
	public static void nortelTest() throws IOException {

		Socket pingSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		String ip = "10.141.0.99";

		try {
			pingSocket = new Socket(ip, 23);
			out = new PrintWriter(pingSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(pingSocket.getInputStream()));
		} catch (IOException e) {
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
}
