package com.internship.systemsguy.endpoint;

import com.internship.systemsguy.student.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")

public class EndpointController {
    
    @GetMapping("/name")

    public Student myEndpoint(@RequestParam(value="slack_name") String slack_name, @RequestParam(value="track") String track){
        Student student = new Student(slack_name,track);
        return student;
    }
}
