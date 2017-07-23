package br.com.app.service;

public abstract class PeriodoService {

	public void gera() {
		System.out.println("faz coisas genericas.");

		if (eventoAbertura()) {
			abertura();
		} else {
			fechamento();
		}

		criaEvento();
	}

	private void criaEvento() {
		System.out.println("Cria evento.");
	}

	protected abstract void fechamento();

	protected abstract void abertura();

	protected abstract boolean eventoAbertura();

}
