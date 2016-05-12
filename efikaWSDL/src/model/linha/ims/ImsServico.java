package model.linha.ims;


import java.rmi.RemoteException;

import br.com.gvt.www.oss.necservice.ConsultElement;
import entidades.cliente.Cliente;
import entidades.configuracoes.ConfiguracaoSip;
import entidades.configuracoes.ConfiguracaolIms;
import entidades.linha.LinhaInterface;
import entidades.parametros.Parametro;
import entidades.validacao.Resolucao;
import model.linha.LinhaServico;
import model.linha.MassivoLinhaInterface;

public class ImsServico extends LinhaServico implements MassivoLinhaInterface{
	

	public ImsServico() {

	}
	
	public Parametro consultarRegistroCentral(String instancia, LinhaInterface linha){

		String reg = null;
		
		try {
			
			for (ConsultElement consultElement : super.consultarElemento(instancia, linha)) {
				
				String init = "<IMSUSERST>";
				String finit = "</IMSUSERST>";
				
				int inicio = consultElement.getElementAnswer().indexOf(init);
				int fim = consultElement.getElementAnswer().indexOf(finit);
				
				reg = (String) consultElement.getElementAnswer().subSequence(inicio + init.length(), fim);
				
				break;
			}
		} catch (RemoteException e) {
			return null;
		}

		return new Parametro("Registro IMS", resolverStatusRegCentral(reg));
	}
	
	public static String resolverStatusRegCentral(String string){
		
		if (string.equalsIgnoreCase("1")) {
			return "Registrado";
		}else if (string.equalsIgnoreCase("0")) {
			return "Não registrado";
		}else{
			return "Perdeu o registro recentemente";
		}
	}
	
	@Override
	public Resolucao validarRegistroCentral(Cliente cliente) {
		
		ConfiguracaolIms config = (ConfiguracaolIms) cliente.getLinha().getConfiguracao();
		
		if(config.getRegistro() != null){
			if (!(config.getRegistro().getValor().contains("Registrado"))){
				return new Resolucao(2);
			}else{
				return new Resolucao(1);
			}
		}
		
		return new Resolucao(5);
	}

	@Override
	public Resolucao validarConectividade(Cliente cliente) {
		// TODO Auto-generated method stub
		return new Resolucao(5);
	}

	
}
