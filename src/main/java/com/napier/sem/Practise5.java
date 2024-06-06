package com.napier.sem;

import javax.swing.JOptionPane;

public class Practise5 {
    public static void main(String[] args) {
        // Declare variables
        String numberString;
        String output;
        double number, result;

        // Prompt the user to enter a number using a dialog box
        numberString = JOptionPane.showInputDialog("Enter a number:");
        number = Double.parseDouble(numberString);

        // Increase the number by 25%
        result = number * 1.25;

        // Prepare the output message
        output = "The result of increasing " + number + " by 25% is " + result;

        // Display the result using a dialog box
        JOptionPane.showMessageDialog(null, output);
    }
}
