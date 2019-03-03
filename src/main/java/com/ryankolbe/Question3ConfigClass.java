package com.ryankolbe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Question3ConfigClass {
    @Bean(name = "Ch2_Interface1")
    public Question2Interface1 getService() {
        return new Question2InterfaceImplementation();
    }

    @Bean(name = "Ch2_Interface2")
    public Question2Interface2 getService2(){
        return new Question2InterfaceImplementation();
    }
}