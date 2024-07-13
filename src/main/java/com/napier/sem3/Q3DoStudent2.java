package com.napier.sem3;

import javax.swing.*;

public class Q3DoStudent2 {
    public static void main(String[] args) {
        int outputPassed = 0;
        int outputFailed = 0;

        for (int counter = 0; counter < 10; counter++) {
            int num = -1;  // Initialize num to an invalid value to ensure the loop runs at least once

            // Loop until a valid mark between 0 and 100 is entered
            while (num < 0 || num > 100) {
                String stuMarks = JOptionPane.showInputDialog("Enter mark for student " + (counter + 1) + " (between 0 and 100):");
                num = Integer.parseInt(stuMarks);

                if (num < 0 || num > 100) {
                    // Show a message if the entered mark is invalid
                    JOptionPane.showMessageDialog(null, "Invalid mark! Please enter a mark between 0 and 100.");
                }
            }

            // Determine if the student passed or failed
            if (num >= 50) {
                outputPassed++;
            } else {
                outputFailed++;
            }
        }

        // Display the results
        String result = "The number of students who passed: " + outputPassed + "\n" +
                "The number of students who failed: " + outputFailed;

        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
