package com.ryankolbe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Question3ConfigClass {
    @Bean(name = "Ch2")
    public Question2Interface getService() {
        return new Question2InterfaceImplementation();
    }
}