package com.rewe.scales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class ScalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScalesApplication.class, args);
	}

}
