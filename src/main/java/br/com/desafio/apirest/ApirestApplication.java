package br.com.desafio.apirest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApirestApplication {

	private static Logger log = LoggerFactory.getLogger(ApirestApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
		log.info("---------- Aplicação rodando ---------");
	}

}
