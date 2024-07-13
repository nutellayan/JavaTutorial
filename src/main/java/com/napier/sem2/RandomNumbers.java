package com.napier.sem2;

import javax.swing.JOptionPane;
import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args){
        String output;
        int num;
        Random numGenerator = new Random();

        num = numGenerator.nextInt(20);
        output = "You got a " + num;

        //Display output
        JOptionPane.showMessageDialog(null, output,"", JOptionPane.INFORMATION_MESSAGE );
    }
}
