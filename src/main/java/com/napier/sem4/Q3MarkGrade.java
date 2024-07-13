package com.napier.sem4;

import javax.swing.JOptionPane;

public class Q3MarkGrade {
    public static void main(String[] args) {
        String marks;
        int intMarks;
        final int ARRAY_SIZE = 10;
        int[] usersMarks = new int[ARRAY_SIZE];
        int[] gradeCounts = new int[4]; // Array to hold the counts for grades A, B, C, F

        for (int loop = 0; loop < usersMarks.length; loop++) {
            do {
                marks = JOptionPane.showInputDialog("Please enter your marks: " + (loop + 1) + " (between 0 and 100):");
                intMarks = Integer.parseInt(marks);
                if (intMarks < 0 || intMarks > 100) {
                    JOptionPane.showMessageDialog(null, "Invalid mark! Please enter a mark between 0 and 100.");
                }
            } while (intMarks < 0 || intMarks > 100);

            usersMarks[loop] = intMarks;

            // Determine the grade and count it
            if (intMarks >= 75) {
                gradeCounts[0]++; // A
            } else if (intMarks >= 60) {
                gradeCounts[1]++; // B
            } else if (intMarks >= 50) {
                gradeCounts[2]++; // C
            } else {
                gradeCounts[3]++; // F
            }
        }

        // Output the frequency of the grades achieved
        String output = "Grade Frequencies:\n";
        output += "A: " + gradeCounts[0] + "\n";
        output += "B: " + gradeCounts[1] + "\n";
        output += "C: " + gradeCounts[2] + "\n";
        output += "F: " + gradeCounts[3] + "\n";

        JOptionPane.showMessageDialog(null, output, "Grade Frequencies", JOptionPane.INFORMATION_MESSAGE);
    }
}
