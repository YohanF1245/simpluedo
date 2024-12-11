package com.example.simpluedo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"controller", "service", "repository", "entity"})
public class SimpluedoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpluedoApplication.class, args);
	}

}
