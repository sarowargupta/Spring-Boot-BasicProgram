package com.project.helloworldmessage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HelloController {

    //UC-1 Helloworld Spring App to display
    
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}