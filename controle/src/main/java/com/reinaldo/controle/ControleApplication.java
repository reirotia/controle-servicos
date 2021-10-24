package com.reinaldo.controle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ControleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleApplication.class, args);
	}
	
	@GetMapping("hello")
	public String hellowrod() {
		return "Hello Word";
	}

}
