package com.napier.sem3;

import javax.swing.*;

public class DoLargeSmall {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int counter = 0;

        do {
            String multiNum = JOptionPane.showInputDialog("Enter number " + (counter + 1) + ":");
            int num = Integer.parseInt(multiNum);

            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }

            counter++;
        } while (counter < 10);

        String result = "The largest number is: " + largest + "\n" +
                "The smallest number is: " + smallest;

        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
