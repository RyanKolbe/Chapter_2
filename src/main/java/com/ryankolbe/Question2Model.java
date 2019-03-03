package com.ryankolbe;

public class Question2Model {

    private int radius;

    public Question2Model(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Question2Model{" +
                "radius=" + radius +
                '}';
    }
}
