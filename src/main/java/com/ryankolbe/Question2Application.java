package com.ryankolbe;

import javax.swing.*;

public class Question2Application {

    private static int radius = 0;

    public static void main(String[] args) {

        //Display request for radius data to user and parse to int.
        radius = Integer.parseInt(JOptionPane.showInputDialog("Please insert a value for radius."));

        //Create object of interface implementation.
        Question2Interface question2Interface = new Question2InterfaceImplementation();

        //Use JOptionPane to display results of area and perimeter calculations.
        JOptionPane.showMessageDialog(null, question2Interface.calculateArea(radius));
        JOptionPane.showMessageDialog(null, question2Interface.calculatePerimeter(radius));
    }
}
