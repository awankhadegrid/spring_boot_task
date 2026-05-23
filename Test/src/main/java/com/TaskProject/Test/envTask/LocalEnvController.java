package com.TaskProject.Test.envTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalEnvController {

    @Autowired
    LocalEnvData localEnvData;

    @GetMapping("/envLocal")
    public LocalEnvData getEnv() {
        return localEnvData;
    }


}
