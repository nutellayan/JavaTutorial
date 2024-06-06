package com.napier.sem;

import javax.swing.JOptionPane;

public class Practise3 {
    public static void main(String[] args) {
        // Declare variables
        String numberString;
        String output;
        float number, result;

        // Prompt the user to enter a real number using a dialog box
        numberString = JOptionPane.showInputDialog("Enter the real number:");
        number = Float.parseFloat(numberString);

        // Divide the number by 2
        result = number / 2;

        // Prepare the output message
        output = "The result of dividing " + number + " by 2 is " + result;

        // Display the result using a dialog box
        JOptionPane.showMessageDialog(null, output);
    }
}
