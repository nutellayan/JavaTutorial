package com.napier.sem4;

import javax.swing.JOptionPane;

public class Q4MarkGradeTest {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 10;
        final int NUM_GRADES = 4;
        int[][] marks = new int[NUM_STUDENTS][NUM_GRADES];

        // Read marks for each student in each subject
        for (int student = 0; student < NUM_STUDENTS; student++) {
            for (int grade = 0; grade < NUM_GRADES; grade++) {
                String input = JOptionPane.showInputDialog(
                        "Enter marks for student " + (student + 1) + ", grade " + (grade + 1) + ":");
                marks[student][grade] = Integer.parseInt(input);
            }
        }

        // Calculate the average marks for each student
        String output = "Average Marks for Each Student:\n";
        for (int student = 0; student < NUM_STUDENTS; student++) {
            int total = 0;
            for (int grade = 0; grade < NUM_GRADES; grade++) {
                total += marks[student][grade];
            }
            double average = (double) total / NUM_GRADES;
            output += "Student " + (student + 1) + ": " + average + "\n";
        }

        // Display the averages
        JOptionPane.showMessageDialog(null, output, "Student Averages", JOptionPane.INFORMATION_MESSAGE);
    }
}
