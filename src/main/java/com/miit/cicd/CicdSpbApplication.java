package com.miit.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdSpbApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdSpbApplication.class, args);
	}
	
	@GetMapping
	public String message(){
		return "welcome to CICD Pipeline";
	}

}
