package com.napier.sem2;

import javax.swing.JOptionPane;

public class Newspaper2 {
    public static void main(String[] args) {
        String paperDelivered = JOptionPane.showInputDialog("How many papers have you delivered?");
        double output;

        int paper = Integer.parseInt(paperDelivered);

        // Calculation
        if (paper <= 100) {
            output = paper * 0.1;
        } else if (paper <= 150) {
            output = (100 * 0.1) + ((paper - 100) * 0.15);
        } else {output = (100 * 0.1) + (50 *0.15) + ((paper - 150) * 0.2);}

        JOptionPane.showMessageDialog(null, "Your payout is: £" + output, "Payout", JOptionPane.INFORMATION_MESSAGE);
    }
}
