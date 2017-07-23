package br.com.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.app.entity.PessoaEntity;

/*
 * Testando o pattern method template
 */
public abstract class PeriodoService {

	@Autowired
	private PessoaEntity pessoaEntity;

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
		System.out.println("Usando injeção de dependência.");
		pessoaEntity.setName("Renato");
	}

	protected abstract void fechamento();

	protected abstract void abertura();

	protected abstract boolean eventoAbertura();

}
