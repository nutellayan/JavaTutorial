package com.napier.sem;

import javax.swing.JOptionPane;

public class Practise {
    public static void main(String[] args) {
        // Declare variables
        String firstNumberString;
        String secondNumberString;
        String output;
        int firstNumber, secondNumber, result;

        // Prompt the user to enter the first integer using a dialog box
        firstNumberString = JOptionPane.showInputDialog("Enter the first integer:");
        firstNumber = Integer.parseInt(firstNumberString);

        // Prompt the user to enter the second integer using a dialog box
        secondNumberString = JOptionPane.showInputDialog("Enter the second integer:");
        secondNumber = Integer.parseInt(secondNumberString);

        // Subtract the second integer from the first
        result = firstNumber - secondNumber;

        // Prepare the output message
        output = "The result of subtracting " + secondNumber + " from " + firstNumber + " is " + result;

        // Display the result using a dialog box
        JOptionPane.showMessageDialog(null, output);
    }
}
