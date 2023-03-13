package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Indica para o Spring que essa é uma Classe Controladora
@RestController

//Indica um Endpoint para a nosa aplicação
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello World, vai vendo!"; 
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "- Persistência<br/>- Orientação ao Futuro<br/>- Mentalidade de Crescimento"
				+ "<br/>- Responsabilidade Pessoal<br/>- Trabalho em Equipe<br/>- Comunicação"
				+ "<br/>- Atenção aos Detalhes<br/>- Proatividade"; 
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "- Dar os primeiros passos no aprendizado sobre Spring<br/>- Aplicar esse conhecimento ao Projeto Integrador"
				+ "<br/>- Relembrar Integrais por causa da Faculdade<br/>- Reforçar ainda mais as minhas BSMs"; 
	}


}
