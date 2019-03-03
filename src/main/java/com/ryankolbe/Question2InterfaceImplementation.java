package com.ryankolbe;

public class Question2InterfaceImplementation implements Question2Interface {

    @Override
    public int calculateArea(int radius) {
        return (int) (Math.PI * Math.pow(radius, radius));
    }

    @Override
    public int calculatePerimeter(int radius) {
        return (int) (2 * Math.PI * radius);
    }
}
