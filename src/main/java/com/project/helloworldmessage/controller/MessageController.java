package com.project.helloworldmessage.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {

    //UC-1 Helloworld Spring App to display
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    //UC-2 Helloworld Spring App to display in a web page
    @GetMapping("/api")
    public String say(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz");
        return "hello"; // Corresponds to hello.html in templates
    }
}