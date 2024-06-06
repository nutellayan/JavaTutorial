package com.napier.sem;

import javax.swing.JOptionPane;

public class Practise2 {
    public static void main(String[] args) {
        // Declare variables
        String firstNumberString;
        String output;
        int firstNumber, result;

        // Prompt the user to enter the first integer using a dialog box
        firstNumberString = JOptionPane.showInputDialog("Enter the integer:");
        firstNumber = Integer.parseInt(firstNumberString);

        // Divide the integer by 2
        result = firstNumber / 2;

        // Prepare the output message
        output = "The result of dividing " + firstNumber + " by 2 is " + result;

        // Display the result using a dialog box
        JOptionPane.showMessageDialog(null, output);
    }
}
