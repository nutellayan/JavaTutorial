package com.napier.assessment;

import javax.swing.JOptionPane;
import java.util.Random;

public class Assessment1 {

    public static void main(String[] args) {
        // Prompt the user to enter the number of rows (N)
        String rowInput = JOptionPane.showInputDialog("Enter the number of rows (N) between 3 and 10:");
        int N = Integer.parseInt(rowInput);
        while (N < 3 || N > 10) {
            rowInput = JOptionPane.showInputDialog("Invalid input. Enter the number of rows (N) between 3 and 10:");
            N = Integer.parseInt(rowInput);
        }

        // Prompt the user to enter the number of columns (M)
        String columnInput = JOptionPane.showInputDialog("Enter the number of columns (M) between 3 and 10:");
        int M = Integer.parseInt(columnInput);
        while (M < 3 || M > 10) {
            columnInput = JOptionPane.showInputDialog("Invalid input. Enter the number of columns (M) between 3 and 10:");
            M = Integer.parseInt(columnInput);
        }

        // Initialize the 2D array with N rows and M columns
        int[][] matrix = new int[N][M];

        // Fill the matrix with random integers
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = generateRandomNumber(i);
            }
        }

        // Build the output string to display the entered data
        StringBuilder output = new StringBuilder("Matrix is like:\n");
        for (int[] row : matrix) {
            for (int num : row) {
                output.append(num).append(" ");
            }
            output.append("\n");
        }

        // Display the entered data
        JOptionPane.showMessageDialog(null, output.toString(), "Matrix", JOptionPane.INFORMATION_MESSAGE);
    }

    // Method to generate random even or odd numbers based on row index
    public static int generateRandomNumber(int rowIndex) {
        Random numGenerator = new Random();
        if (rowIndex % 2 == 0) { // even row index
            return 2 * numGenerator.nextInt(500) + 1; // odd number between 0 and 999
        } else { // odd row index
            return 2 * numGenerator.nextInt(501); // even number between 0 and 1000
        }
    }
}
