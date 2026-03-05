package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
       return "CI/CD is Working Perfectly!";
        //return "This is cool right!-1";
    }
}





