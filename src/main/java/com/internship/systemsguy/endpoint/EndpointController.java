package com.internship.systemsguy.endpoint;

import com.internship.systemsguy.student.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")

public class EndpointController {
    
    @GetMapping("/name")
    public Student getDetails(){
        Student student = new Student("Julius","backend");
        return student;
    }
}
