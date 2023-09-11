package com.internship.systemsguy.endpoint;

/**
 * @author Julius
 * This is a Java class named  EndpointController  which is annotated with  @RestController  to indicate *that it is a RESTful controller. It handles HTTP requests and returns JSON responses. 
 */

import com.internship.systemsguy.student.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
The class has a single endpoint  /api  which is mapped to the  myEndpoint  method using the  @GetMapping  annotation. The  myEndpoint  method accepts two query parameters  slack_name  and  track  using the  @RequestParam  annotation. 
*/

@RestController
@RequestMapping("")

public class EndpointController {
    
    @GetMapping("/api")
    public Student myEndpoint(@RequestParam(value="slack_name") String slack_name, @RequestParam(value="track") String track){
        Student student = new Student(slack_name,track);
        return student;
    }
}
