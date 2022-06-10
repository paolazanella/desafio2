package br.com.desafio2.imovelserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class ImovelServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImovelServerApplication.class, args);
	}

}
