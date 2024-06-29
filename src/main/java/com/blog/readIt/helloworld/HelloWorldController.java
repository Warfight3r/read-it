package com.blog.readIt.helloworld;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.blog.readIt.bean.Users;
import com.blog.readIt.repository.UserRepository;

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
    public String getUserByName(Model model) {
        // Replace "Shivam Dube" with the actual name you want to search
        List<Users> user = userRepository.findByName("Shivam Dube");
        
        // Add user data to the model
        model.addAttribute("user", user);
        
        // Return the view name
        System.out.print(user);
        return "user";
    }
}
