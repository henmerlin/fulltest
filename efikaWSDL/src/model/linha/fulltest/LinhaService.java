package model.linha.fulltest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import com.gvt.www.uraservices.GetSwitchInfoOut;
import com.gvt.www.uraservices.UraServicesProxy;

public class LinhaService{

	private UraServicesProxy uraService;

	public LinhaService() {
		this.uraService = new UraServicesProxy();
	}

	public String consultar(String instancia) throws IOException, Exception{

		String equip = this.consultarNrEquipamento(instancia);
		String central = this.consultarCentral(equip);


		System.out.println(equip);
		System.out.println(central);

		return null;
	}

	/**
	 * Consulta Tipo de Central
	 * @param instancia
	 * @return
	 * @throws RemoteException
	 */
	public String consultarCentral(String instancia) throws RemoteException {

		GetSwitchInfoOut oi = uraService.getInfoSwitch(instancia);
		return oi.getResultMessage();
	}


	/**
	 * M�todo utilizado para traduzir instancia / equipamento.
	 * 
	 * 	Exemplos para Teste:
	 * 	- Inst�ncia com equipamento: 4130228924
	 * 	- Inst�ncia sem equipamento: 4130222839
	 * @param instancia
	 * @return N�mero de Equipamento ou Inst�ncia (caso n�o tenha equipamento associado).
	 * @throws IOException
	 * @throws Exception
	 * @author G0042204
	 */
	public String consultarNrEquipamento(String instancia) throws Exception{

		URL pn;

		try {
			pn = new URL("http://10.41.15.99/WebPort/QueryNumber.do?instancia=" + instancia);
		} catch (MalformedURLException e) {
			throw new Exception("PnAdmin -> LinhaService.consultarNrEquipamento() - Informe a equipe Efika.");
		}

		BufferedReader in = new BufferedReader(new InputStreamReader(pn.openStream()));

		String inputLine;
		
		Integer i = 0;
		
		while ((inputLine = in.readLine()) != null){

			i++;

			// Recupera a linha 34 do retorno e verifica se possui 10 digitos e efetua retorno
			if (i.equals(34) && inputLine.trim().length() == 10) {
				return inputLine.trim();
			}
		}

		in.close();
		
		// Caso n�o tenha equipamento - retorna Inst�ncia;
		return instancia;
	}


}	
