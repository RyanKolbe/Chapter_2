package com.ryankolbe;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Question2InterfaceImplementationTest {

    private static Question2Interface1 question2Interface1;
    private static Question2Interface2 question2Interface2;

    @BeforeClass
    public static void setUp() {
        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(Question3ConfigClass.class);
        question2Interface1 = (Question2Interface1) applicationContext1.getBean("Ch2_Interface1");
        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(Question3ConfigClass.class);
        question2Interface2 = (Question2Interface2) applicationContext2.getBean("Ch2_Interface2");
    }

    @Test
    public void calculateArea() {
        int result = question2Interface1.calculateArea(2);
        Assert.assertEquals(12, result);
    }

    @Test
    public void calculatePerimeter() {
        int result = question2Interface2.calculatePerimeter(2);
        Assert.assertEquals(12, result);
    }
}