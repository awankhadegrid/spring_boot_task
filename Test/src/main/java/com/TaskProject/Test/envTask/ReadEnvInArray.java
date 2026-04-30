package com.TaskProject.Test.envTask;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadEnvInArray {
    @Value("#{'${skills}'.split('-')}")
    private String[] skills;

    @PostConstruct
    public void print() {
        for(String s : skills){
            System.out.println(s);
        }
    }
}
