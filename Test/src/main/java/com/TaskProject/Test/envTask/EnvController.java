package com.TaskProject.Test.envTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvController {

    @Autowired
    Environment env;

    @GetMapping("/env")
    public String getEnv(){
        return env.getProperty("app.api.key");
    }
}
