package com.napier.sem5;

import javax.swing.*;

public class Q1Welcome {
    public static void main(String [] args) {
    printWelcome();
    } // end main
    public static void printWelcome() {
        String output = "Welcome!";

        JOptionPane.showMessageDialog(null, output," ", JOptionPane.INFORMATION_MESSAGE);
    }
}

