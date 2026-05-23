package com.TaskProject.Test.RestApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class PathVariableController {
    @GetMapping("/data/{id}")
    public long getPathVariable(@PathVariable long id){
        return id;
    }
}
