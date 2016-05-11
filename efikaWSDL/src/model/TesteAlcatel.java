package model;

import entidades.massivo.Teste;
import model.massivo.MassivoServico;

public class TesteAlcatel {

	public static void main(String[] args) throws Exception {

		try {

			MassivoServico massivo = new MassivoServico();

			Teste teste = new Teste();
			teste.setInstancia("4135853980");
			//teste.setInstancia("4130222839");
			massivo.fazTeste(teste);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}
}

