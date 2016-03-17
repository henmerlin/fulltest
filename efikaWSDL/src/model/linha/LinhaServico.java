package model.linha;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import com.gvt.www.uraservices.GetSwitchInfoOut;
import com.gvt.www.uraservices.UraServicesProxy;

import entidades.cliente.Cliente;
import entidades.linha.LinhaInterface;
import model.factory.LinhaFactory;
import model.modulos.OperacionalInterface;


public class LinhaServico implements OperacionalInterface{

	private UraServicesProxy uraService;

	public LinhaServico() {
		this.uraService = new UraServicesProxy();
	}
	

	@Override
	public Cliente consultar(Cliente cliente) throws Exception {
		
		String instancia = cliente.getInstancia();
		
		cliente.setLinha(this.construirLinha(instancia));
		

		return cliente;
	}


	public UraServicesProxy getUraservice() {
		return uraService;
	}

	public void setUraservice(UraServicesProxy uraservice) {
		this.uraService = uraservice;
	}

	public LinhaInterface construirLinha(String instancia) throws Exception{

		String equip = this.consultarNrEquipamento(instancia);
		String tecnologia = this.getCentral(equip);

		LinhaInterface linha = LinhaFactory.criar(tecnologia);

		linha.setInstancia(equip);
		linha.setTecnologia(tecnologia);

		return linha;
	}

	/**
	 * Consulta Tipo de Central
	 * @param instancia
	 * @return
	 * @throws RemoteException
	 */
	public String getCentral(String instancia) throws RemoteException {

		GetSwitchInfoOut result = uraService.getInfoSwitch(instancia);

		return result.getResultMessage();
	}


	/**
	 * Método utilizado para traduzir instancia / equipamento.
	 * 
	 * 	Exemplos para Teste:
	 * 	- Instância com equipamento: 4130228924
	 * 	- Instância sem equipamento: 4130222839
	 * @param instancia
	 * @return Número de Equipamento ou Instância (caso não tenha equipamento associado).
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

		// Caso não tenha equipamento - retorna Instância;
		return instancia;
	}

}
