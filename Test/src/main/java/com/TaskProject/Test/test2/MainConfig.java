package com.TaskProject.Test.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MainConfig {
    @Autowired
    @Qualifier("bmw")
    private Speed speed;

    public void mainProcess(){
        speed.topSpeed();
    }
}
