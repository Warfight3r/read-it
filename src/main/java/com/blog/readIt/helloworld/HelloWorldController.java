package com.blog.readIt.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blog.readIt.bean.Users;
import com.blog.readIt.repository.UserRepository;

import java.util.List;

@Controller
public class HelloWorldController {
    
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
    
    @GetMapping("/user")
    public String user(@RequestParam(name = "name", required = false) String name, Model model) {
        // @RequestParam will request/wait for the end point to receive a post and assign that to the variable name
    	// name is set to required = false so we will be able to return user.html without having received it in the first place.
    	if (name != null) {
            List<Users> users = userRepository.findByName(name);
            if (!users.isEmpty()) {
                // beforehand, we couldn't access the username and password using user.name because the variable name was private inside the UserRepository.java file
            	// Now, we can access these info because we are using the getters on the back end in HelloWorldController.java
                model.addAttribute("username", users.get(0).getUsername());  // Assuming the name is unique, otherwise handle multiple users
                model.addAttribute("password", users.get(0).getPwd());
                model.addAttribute("email", users.get(0).getEmail());
            } else {
                model.addAttribute("error", "User not found");
            }
        }
        return "user";
    }
}
