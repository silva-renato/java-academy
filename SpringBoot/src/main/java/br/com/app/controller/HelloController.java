package br.com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.app.service.AberturaPeriodoService;
import br.com.app.service.FechamentoPeriodoService;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private FechamentoPeriodoService fechamentoPeriodo;

	@Autowired
	private AberturaPeriodoService aberturaPeriodo;

	@GetMapping
	public String hello() {

		fechamentoPeriodo.gera();

		aberturaPeriodo.gera();

		return "OK";

	}

}
