package com.napier.sem3;
import javax.swing.JOptionPane;
public class Q2DoStudent {
    public static void main(String[] args) {
        int counter = 0;
        int outputPassed = 0;
        int outputFailed = 0;

        do {
            String stuMarks = JOptionPane.showInputDialog("Enter marks " + (counter + 1) + ":");
            int marks = Integer.parseInt(stuMarks);

            if (marks >= 50) {
                outputPassed++;
            } else {
                outputFailed++;
            }

            counter++;
        } while (counter < 10);

        String result = "The pass mark is 50%." + "\n" + "The number of students who passed: " + outputPassed + "\n" +
                "The number of students who failed: " + outputFailed;

        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.INFORMATION_MESSAGE);
    }
}