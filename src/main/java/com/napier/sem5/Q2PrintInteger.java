package com.napier.sem5;

import javax.swing.*;

public class Q2PrintInteger {
    public static void main(String[] args) {
        // Call the method that gets the user's age and prints the message
        getAndPrintAge();
    } // end main

    // Method that gets an integer input from the user, creates the output message, and prints it
    public static void getAndPrintAge() {
        String ageString;
        int age;

        // Prompt the user to enter their age
        ageString = JOptionPane.showInputDialog("Please enter your age");

        // Convert the entered age from a string to an integer
        age = Integer.parseInt(ageString);

        // Create the output message
        String output = "You are " + age + " years old.";

        // Display the output message in a dialog box
        JOptionPane.showMessageDialog(null, output, "Age Information", JOptionPane.INFORMATION_MESSAGE);
    }
}
