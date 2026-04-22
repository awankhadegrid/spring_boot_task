package com.TaskProject.Test.test2;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("audi")
public class Audi implements Speed{
    @Override
    public void topSpeed() {
        System.out.println("Audi speed is 300k/h");
    }
}
