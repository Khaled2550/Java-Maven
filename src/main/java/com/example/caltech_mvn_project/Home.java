package com.example.caltech_mvn_project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    
    @RequestMapping
    public String hello(){
        return "Hello Spring Boot";
    }

}
