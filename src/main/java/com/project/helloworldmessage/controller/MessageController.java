package com.project.helloworldmessage.controller;

import com.project.helloworldmessage.HelloworldmessageApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
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

    //UC-3 Helloworld Spring App to display by use Rest Controller
    @RequestMapping("/")
    public String restCall(){
        return "Hello from BridgeLabz";
    }

    //UC-4 Hello World App
    @GetMapping
    public String hello() {
        return "Hello, World!";
    }

    //SPRING CONCEPT

    //UC-1 project to learn spring concept
    @GetMapping("/uc1")
    public String UC1() {
        return "learn spring concept";
    }

    //UC-2 Logger to log message
    private static final Logger logger = LoggerFactory.getLogger(HelloworldmessageApplication.class);

    @GetMapping("/uc2")
    public String UC2() {
        logger.info("GET request received at uc2");
        return "Hello from BridgeLabz with Logging";
    }


}