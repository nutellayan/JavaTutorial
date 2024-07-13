package com.napier.sem2;

import javax.swing.*;

public class Q7Student {
    public static void main(String[] args) {
        int counter = 0;
        int outputPassed = 0;
        int outputFailed = 0;

        while (counter < 10) {
            String stuMarks = JOptionPane.showInputDialog("Enter marks " + (counter + 1) + ":");
            int marks = Integer.parseInt(stuMarks);

            if (marks >= 50) {
                outputPassed++;
            } else {
                outputFailed++;
            }

            counter++;
        }

        String result = "The number of students who passed: " + outputPassed + "\n" +
                "The number of students who failed: " + outputFailed;

        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
