package br.com.app.service;

import org.springframework.stereotype.Service;

@Service
public class AberturaPeriodoService extends PeriodoService {

	boolean eventoAbertura = true;

	@Override
	protected void fechamento() {
	}

	@Override
	protected void abertura() {
		System.out.println("Abertura.");
		System.out.println("Realiza particularidas de abertura.");
	}

	@Override
	protected boolean eventoAbertura() {
		return true;
	}

}
