package com.napier.sem2;

import javax.swing.JOptionPane;

public class Q3Vowel {
    public static void main(String[] args) {
        String output;
        String charAsString;
        char theChar;

        charAsString = JOptionPane.showInputDialog("Please enter a character");
        theChar = charAsString.charAt(0);

        if (theChar == 'a' || theChar == 'e' || theChar == 'i' || theChar == 'o' || theChar == 'u' ||
                theChar == 'A' || theChar == 'E' || theChar == 'I' || theChar == 'O' || theChar == 'U') {
            output = theChar + " is a vowel.";
        } else {
            output = theChar + " is a consonant.";
        }

        JOptionPane.showMessageDialog(null, output, "Character Check", JOptionPane.INFORMATION_MESSAGE);
    }
}
