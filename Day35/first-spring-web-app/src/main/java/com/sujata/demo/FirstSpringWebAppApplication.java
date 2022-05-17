package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sujata.controllers")
public class FirstSpringWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringWebAppApplication.class, args);
	}

}
