package model.banda.gpon.keymile;

import entidades.banda.BandaInterface;
import entidades.banda.parametros.TabelaParametrosInter;
import entidades.cadastro.Cadastro;
import model.banda.BandaServicoInterface;
import model.banda.metalico.DslamGpon;

public class KeymileServico extends DslamGpon implements BandaServicoInterface{

	public KeymileServico() {
		
	}

	@Override
	public TabelaParametrosInter consultarTabelaParametros(Cadastro cadastro) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BandaInterface consultarBridges(BandaInterface banda) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
