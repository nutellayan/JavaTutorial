package com.napier.sem4;

import javax.swing.*;

public class Q1Populating {
    public static void main(String[] args) {
        String output, arrayNum;
        int num;
        final int ARRAY_SIZE = 5;
        int[] usersNum = new int[ARRAY_SIZE];

        // Loop to read numbers into array
        for (int loop = 0; loop < usersNum.length; loop++) {
            arrayNum = JOptionPane.showInputDialog("Please enter an integer");
            num = Integer.parseInt(arrayNum);
            usersNum[loop] = num;
        }

        // Loop to construct output string for numbers < 10
        output = "Numbers less than 10:";
        for (int loop = 0; loop < usersNum.length; loop++) {
            if (usersNum[loop] < 10) {
                output = output + " " + usersNum[loop]; // Concatenate number to output string
            }
        }

        // Display the output using JOptionPane
        JOptionPane.showMessageDialog(null, output, "Array", JOptionPane.INFORMATION_MESSAGE);
    }
}
