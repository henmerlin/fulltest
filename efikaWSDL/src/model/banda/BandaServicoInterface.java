package model.banda;

import java.io.IOException;

import entidades.banda.BandaInterface;
import entidades.banda.parametros.TabelaParametrosInter;
import entidades.cadastro.Cadastro;

public interface BandaServicoInterface {
	
	public void setCadastro(Cadastro cadastro);
		
	public void disconnect() throws IOException;
	
	public void connect() throws Exception;
	
	public TabelaParametrosInter consultarTabelaParametros() throws Exception;
	
	public BandaInterface consultarBridges(BandaInterface banda) throws Exception;
	

}
