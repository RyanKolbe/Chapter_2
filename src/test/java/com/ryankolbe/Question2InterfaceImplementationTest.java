package com.ryankolbe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Question2InterfaceImplementationTest {

    private Question2Interface question2Interface;

    @Before
    public void setUp() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Question3ConfigClass.class);
        question2Interface = (Question2Interface) applicationContext.getBean("Ch2");
    }

    @Test
    public void calculateArea() {
        int result = question2Interface.calculateArea(2);
        Assert.assertEquals(12, result);
    }

    @Test
    public void calculatePerimeter() {
        int result = question2Interface.calculatePerimeter(2);
        Assert.assertEquals(12, result);
    }
}