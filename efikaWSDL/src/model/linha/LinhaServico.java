package model.linha;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import com.gvt.services.eai.configuradoronline.ws.ConfiguradorOnlineProxy;
import com.gvt.www.uraservices.GetSwitchInfoOut;
import com.gvt.www.uraservices.UraServicesProxy;
import com.gvt.www.ws.business.portabilidade.PortabilidadeBusinessDSSoapProxy;
import com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.GetInformacoesInstanciaIn;
import com.gvt.www.ws.business.portabilidade.getInformacoesInstancia.GetInformacoesInstanciaOut;
import com.gvt.www.ws.eai.configuradoronline.consultaElemento.ConsultaElementoIn;

import br.com.gvt.www.eai.NumberInventoryServicesWS.GetNumberByFilterIn;
import br.com.gvt.www.eai.NumberInventoryServicesWS.GetNumberByFilterOut;
import br.com.gvt.www.eai.NumberInventoryServicesWS.NumberInventoryServicesWSProxy;
import br.com.gvt.www.oss.necservice.ConsultElement;
import entidades.cliente.Cliente;
import entidades.linha.LinhaInterface;
import model.factory.LinhaFactory;


public class LinhaServico{

	private UraServicesProxy uraService;

	private NumberInventoryServicesWSProxy numberService;
	
	private PortabilidadeBusinessDSSoapProxy portService;
	
	private ConfiguradorOnlineProxy coService;

	public LinhaServico() {
		this.uraService = new UraServicesProxy();
		this.numberService = new NumberInventoryServicesWSProxy();
		this.portService = new PortabilidadeBusinessDSSoapProxy();
		this.coService = new ConfiguradorOnlineProxy();
	}
	
	/**
	 * Consulta de Registro na Central - tanto IMS/NORTEL
	 * @param instancia
	 * @param linha
	 * @return
	 * @throws RemoteException
	 */
	public ConsultElement[] consultarElemento(String instancia, LinhaInterface linha) throws RemoteException{
		
		ConsultaElementoIn consulta = new ConsultaElementoIn(instancia, linha.getInstancia(), linha.getInfoSwitch().getSwitchName(), linha.getInfoSwitch().getCity(), linha.getInfoSwitch().getState());

		return this.coService.consultaElemento(consulta);
	}
	
	/**
	 * Consulta de Informações da Central
	 * @param cliente
	 * @return
	 * @throws Exception
	 */
	public Cliente consultarConfiguracoes(Cliente cliente) throws Exception{
		
		cliente.getLinha().setInfoSwitch(this.getNumberInfo(cliente.getLinha().getInstancia()));
		cliente.getLinha().setInfoInstancia(this.getInformacoesInstancia((cliente.getLinha().getInstancia())));
		
		return cliente;
	}
	
	
	/**
	 * Retorna operadora e CNL da instância
	 * @param instancia
	 * @return
	 * @throws RemoteException
	 */
	public GetInformacoesInstanciaOut getInformacoesInstancia(String instancia) throws RemoteException{
		
		GetInformacoesInstanciaIn in = new GetInformacoesInstanciaIn(instancia);
		
		return this.portService.getInformacoesInstancia(in);
	}

	/**
	 * Método retorna os parâmetros abaixo:
	 * 	phoneNumber
	 *  switchName
	 * 	switchType		
	 *  switchIMS 
	 *  city 
	 *  state
	 * @param instancia
	 * @return
	 * @throws RemoteException
	 */
	public GetNumberByFilterOut getNumberInfo(String instancia) throws RemoteException{

		GetNumberByFilterIn in = new GetNumberByFilterIn(instancia);

		return this.numberService.getNumberByFilter(in);
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
