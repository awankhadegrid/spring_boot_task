package com.TaskProject.Test.Test1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
class ProjectConfig {

    @Bean("bean1")
    public Foo interfaceBean() {
        return new FooImpl();
    }

    @Bean("bean2")
    @Primary
    public FooImpl concreteBean() {
        return new FooImpl();
    }
}