package com.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {
    
    @GetMapping("/greet")
    public String greetUser(){
        return "Welcome user";
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello user";
    }

    

}