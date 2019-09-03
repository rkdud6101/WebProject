package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class HelloSpringApplication {
	
	
	@RequestMapping("/")
	String home() {
		return "Hello World";
	}
	
    @RequestMapping("/demo")
    String demo() {
    	return "데모 접솝 돼";
    }
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
