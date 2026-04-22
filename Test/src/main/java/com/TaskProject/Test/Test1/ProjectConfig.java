package com.TaskProject.Test.Test1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ProjectConfig {

    @Bean("interfaceBean")
    public Foo interfaceBean() {
        System.out.println("this is interface bean");
        return new FooImpl();
    }
    @Bean("concreteBean")
    public FooImpl concreteBean() {
        return new FooImpl();
    }
}