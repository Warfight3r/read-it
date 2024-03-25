package com.blog.readIt;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
//
//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
//public class ReadItApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(ReadItApplication.class, args);
//	}
//	
//}


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ReadItApplication implements CommandLineRunner{
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(ReadItApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	
		System.out.println("-------SHIVAM-----------"+ mongoTemplate.getCollectionNames());

	}
}