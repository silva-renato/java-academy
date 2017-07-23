package br.com.app.service;

import org.springframework.stereotype.Service;

@Service
public class FechamentoPeriodoService extends PeriodoService {

	boolean eventoAbertura = true;

	@Override
	public void fechamento() {
		System.out.println("Fechamento.");
		System.out.println("Realiza particularidades de fechemento.");

	}

	@Override
	public void abertura() {
	}

	@Override
	protected boolean eventoAbertura() {
		return false;
	}

}
