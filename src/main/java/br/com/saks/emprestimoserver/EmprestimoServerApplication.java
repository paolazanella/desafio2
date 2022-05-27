package br.com.saks.emprestimoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmprestimoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmprestimoServerApplication.class, args);
	}

}
