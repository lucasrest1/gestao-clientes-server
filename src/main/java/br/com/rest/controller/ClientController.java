package br.com.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/clientes")
public class ClientController  {

	@GetMapping
	public String findAll() {
		return "All clients";
	}
	
	@GetMapping("/{id}")
	public String findById(@PathVariable Long id) {
		return "Client with id: " + id;
	}
	
}
