package com.alanvieceli.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exemplo")
public class ExemploController {
	
	@GetMapping
	public String exemplo() {
		return "Olá sem nome";
	}
	
	@GetMapping(value="/{nome}")
	public String exemplo(@PathVariable("nome") String nome) {
		return "Olá " + nome;
	}

}
