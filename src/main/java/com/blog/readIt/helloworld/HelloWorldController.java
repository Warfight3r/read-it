package com.blog.readIt.helloworld;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {
	
	@GetMapping("/")
	public String helloworld() {
		return "index";
	}
}