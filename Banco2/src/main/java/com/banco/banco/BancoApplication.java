package com.banco.banco;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import model.Conta;
import model.Pessoa;

@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(BancoApplication.class, args);
		Pessoa pessoa = new Pessoa("Yan", "111.222.333-98");
		Conta conta = new Conta();
	}

}
