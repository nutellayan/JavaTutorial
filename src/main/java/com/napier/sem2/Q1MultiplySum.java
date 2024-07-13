package com.napier.sem2;

import javax.swing.JOptionPane;

public class Q1MultiplySum {
    public static void main(String[] args) {
        String firstNumberString = JOptionPane.showInputDialog("Enter the first number");
        String secondNumberString = JOptionPane.showInputDialog("Enter the second number");

        // Convert input from String to int
        int firstNumber = Integer.parseInt(firstNumberString);
        int secondNumber = Integer.parseInt(secondNumberString);

        // Calculation
        int sum = firstNumber + secondNumber;
        int multiply = firstNumber * secondNumber;

        // Print message
        String resultMessage = "The sum of the numbers is: " + sum + "\n" +
                "The product of the numbers is: " + multiply + "\n";

        if (firstNumber > secondNumber) {
            resultMessage += "The first number is larger.";
        } else if (secondNumber > firstNumber) {
            resultMessage += "The second number is larger.";
        } else {
            resultMessage += "Both numbers are equal.";
        }

        JOptionPane.showMessageDialog(null, resultMessage);
    }
}
