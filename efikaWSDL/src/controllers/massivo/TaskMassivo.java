package controllers.massivo;

import java.util.Timer;
import java.util.TimerTask;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import entidades.massivo.Teste;
import model.massivo.MassivoServico;

@ManagedBean
@ApplicationScoped
@Singleton
public class TaskMassivo {

	Timer timerMassivoLinha = new Timer();

	@EJB
	private MassivoServico massivoServico;

	TimerTask MassivoLinha = new TimerTask() {

		@Override
		public void run() {

			try {

				listaLinhas();			

			} catch (NullPointerException e) {

				//System.out.println(e.getMessage());

			}

		}
	};

	@PostConstruct
	public void init() {
		timerMassivoLinha.scheduleAtFixedRate(MassivoLinha, 1000, 1000);
	}

	public TaskMassivo() {

	}

	public void iniciaBean() {



	}

	public void listaLinhas() {

		try {
			Teste teste = new Teste();
			
			teste = this.massivoServico.listaLinhas().get(0);
			
			this.massivoServico.fazTeste(teste);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
