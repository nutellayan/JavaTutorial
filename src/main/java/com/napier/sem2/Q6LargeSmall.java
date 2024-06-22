package com.napier.sem2;

import javax.swing.JOptionPane;

public class LargeSmall {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE; // Initialize to the smallest possible value
        int smallest = Integer.MAX_VALUE; // Initialize to the largest possible value
        int counter = 0;

        while (counter < 10) {
            String multiNum = JOptionPane.showInputDialog("Enter number " + (counter + 1) + ":");
            int num = Integer.parseInt(multiNum);

            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }

            counter++;
        }

        String result = "The largest number is: " + largest + "\n" +
                "The smallest number is: " + smallest;

        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
