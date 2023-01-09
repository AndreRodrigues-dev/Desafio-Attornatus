package com.api.gerenciadorpessoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GerenciadorPessoasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorPessoasApplication.class, args);
	}
}
