package com.napier.sem5;

import javax.swing.*;

public class Q3AddInteger {
    public static void main(String[] args) {
        // Prompt the user to input an integer
        String newInt = JOptionPane.showInputDialog("Input your integer: ");
        int num = Integer.parseInt(newInt);

        // Call the addFiveToInteger method
        int result = addFiveToInteger(num);

        // Display the result
        String output = "Adding 5 to your input will be " + result;
        JOptionPane.showMessageDialog(null, output, "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    // Method that takes an integer as an argument and returns the integer increased by five
    public static int addFiveToInteger(int num) {
        return num + 5;
    }
}
