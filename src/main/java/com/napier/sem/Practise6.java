package com.napier.sem;

import javax.swing.JOptionPane;

public class Practise6 {
    public static void main(String[] args) {
        // Declare variables
        String degreeString;
        String output;
        double degree, result;

        // Prompt the user to enter the degree using a dialog box
        degreeString = JOptionPane.showInputDialog("Enter the degree in Celsius:");
        degree = Float.parseFloat(degreeString);

        // Calculation
        result = (degree * 9.0/5.0) + 32;

        // Prepare the output message
        output = "The temperature of " + degree + " degree Celsius in Fahrenheit is " + result;

        // Display the result using a dialog box
        JOptionPane.showMessageDialog(null, output);
    }
}

