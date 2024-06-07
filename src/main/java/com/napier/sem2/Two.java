package com.napier.sem2;

import javax.swing.JOptionPane;

public class Two {
    public static void main(String[] args) {
        String firstNum = JOptionPane.showInputDialog("Enter the first number");
        String result = ""; // Initialize result to an empty string

        int num = Integer.parseInt(firstNum);

        if (num % 2 == 0) {
            result += "This is an even number.";
        } else {
            result += "This is an odd number.";
        }

        JOptionPane.showMessageDialog(null, result, "Halo", JOptionPane.INFORMATION_MESSAGE);
    }
}
