package com.napier.sem;

import javax.swing.JOptionPane;

public class Practise4 {
    public static void main(String[] args) {
        // Declare variables
        String name;
        String ageString;
        String output;
        int age, result;

        // Prompt the user to enter a real number using a dialog box
        name = JOptionPane.showInputDialog("Enter your username:");
        ageString = JOptionPane.showInputDialog("Enter your age:");
        age = Integer.parseInt(ageString);

        // Age next year
        result = age + 1;

        // Prepare the output message
        output = "Hello, " + name + "." + " You are going to be " + result + " years old next year.";

        // Display the result using a dialog box
        JOptionPane.showMessageDialog(null, output);
    }
}
