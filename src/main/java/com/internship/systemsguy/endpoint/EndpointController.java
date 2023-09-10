package com.internship.systemsguy.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")

public class EndpointController {
    
    @GetMapping("/name")
    public String getName(){
        return "Julius Adjetey Sowah";
    }
}
