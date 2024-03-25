package com.blog.readIt.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping(path= "/helloworld")
	public String helloworld() {
		return "hello world";
	}
}