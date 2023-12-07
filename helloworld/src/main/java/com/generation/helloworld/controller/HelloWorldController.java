package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kl")
public class HelloWorldController {
	@GetMapping
	public String helloworld() {
		return "Hello World";
	}
	@GetMapping("/bsm")
	public String bsm() {
		
		return "BSM'S da Generation Brasil:  <br/>Persistência; <br/>Mentalidade de Crescimento; <br/>Responsabilidade Pessoal; <br/>Orientação ao Futuro; <br/>Proatividade; <br/>Comunicação; <br/>Trabalho em Equipe; <br/>Orientação ao Detalhe.";	
	}
@GetMapping("/objetivos")
public String objetivos() {
	return "Objetivos de Aprendizagem para a semana: <br/> - Praticar criação de Banco de Dados com as atividades propostas durante a semana; <br/>- Revisar conteúdos de Java; <br/>- Ver videos sobre o conteudo de http, janelas e requisições.";
}
}
