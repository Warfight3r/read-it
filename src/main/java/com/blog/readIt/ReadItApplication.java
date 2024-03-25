package com.blog.readIt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ReadItApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadItApplication.class, args);
	}
	
}
