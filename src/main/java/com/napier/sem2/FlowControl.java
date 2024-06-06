package com.napier.sem2;

import javax.swing.JOptionPane;
public class FlowControl {
           public static void main(String[] args){
               int counter = 0;
               String output = "";

               while(counter <= 10) {
                   output = output + counter +"\n";
                   counter++;
               }
               //Display output
               JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
           }



}
