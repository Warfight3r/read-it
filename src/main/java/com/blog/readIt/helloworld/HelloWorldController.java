package com.blog.readIt.helloworld;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/home")
	public String home() {
		return "home";
		// The mapping /home defines which url can access this page
		// the function home() is just for reference, it is the function that is called upon when accessing /home
		// the return "home" will return an html file named home in the templates folder under src/main/resources
	}

}