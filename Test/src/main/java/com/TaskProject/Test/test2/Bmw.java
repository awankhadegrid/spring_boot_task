package com.TaskProject.Test.test2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("bmw")
//@Primary
public class Bmw implements Speed{
    @Override
    public void topSpeed() {
        System.out.println("BMW speed is 350 k/h");
    }
}
