package com.napier.sem4;

import javax.swing.*;

public class Q2Salaries {
    public static void main(String[] args) {
        String arrayNum;
        int num;
        final int ARRAY_SIZE = 5;
        int[] usersNum = new int[ARRAY_SIZE];

        // Loop to read numbers into array
        for (int loop = 0; loop < usersNum.length; loop++) {
            arrayNum = JOptionPane.showInputDialog("Please enter your salary");
            num = Integer.parseInt(arrayNum);
            usersNum[loop] = num;
        }

        // Calculate tax and construct output string
        String output = "Salaries and tax to be paid (25%):\n";
        for (int loop = 0; loop < usersNum.length; loop++) {
            int salary = usersNum[loop];
            double tax = salary * 0.25;
            output += "Salary: " + salary + " - Tax: " + tax + "\n";
        }

        // Display the output using JOptionPane
        JOptionPane.showMessageDialog(null, output, "Salaries and Taxes", JOptionPane.INFORMATION_MESSAGE);
    }
}
