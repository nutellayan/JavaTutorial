package com.napier.sem7;

import javax.swing.JOptionPane;

public class Person {
    private final String name;
    private final String address;
    private final int age;

    // Constructor to initialize with specific values
    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // Override toString method to return formatted string
    @Override
    public String toString() {
        String output;
        output = "My name is " + this.name + ", I live at " + this.address + "\n";
        output += "and I am " + this.age + " years old.";
        return output;
    }

    // Method to print details using JOptionPane
    public void printDetails() {
        String output;
        output = toString();
        // Display message
        JOptionPane.showMessageDialog(null, output, "Details of Person", JOptionPane.INFORMATION_MESSAGE);
    }
}
