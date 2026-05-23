package com.TaskProject.Test.RestApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/users")
public class RequestParamController {

    @GetMapping("/search")
    public String searchUser(@RequestParam Map<String,String> param) {
        return "Searching user: " + param.get("name") + "id : " + param.get("id");
    }

}