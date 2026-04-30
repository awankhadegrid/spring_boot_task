package com.udemy.udemyCource.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

    @Value("${spring.application.name}")
    private static String name;


}
