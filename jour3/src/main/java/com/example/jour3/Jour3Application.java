package com.example.jour3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jour3Application {

	public static void main(String[] args) {
		SpringApplication.run(Jour3Application.class, args);
	}

	// @Bean
	// createPerson() {
	Person person = new Person("walid",32);

}
