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
        Random numGenerator = new Random();

        // Fill the matrix with random integers
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i % 2 == 0) { // even row index
                    matrix[i][j] = 2 * numGenerator.nextInt(501); // even number between 0 and 1000
                } else { // odd row index
                    matrix[i][j] = 2 * numGenerator.nextInt(500) + 1; // odd number between 0 and 999
                }
            }
        }

        // Build the output string to display the entered data
        StringBuilder output = new StringBuilder("Matrix is like:\n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                output.append(matrix[i][j]).append(" ");
            }
            output.append("\n");
        }

        // Compute and display the averages
        double[] rowAverages = new double[N];
        double[] columnAverages = new double[M];
        double totalSum = 0;

        for (int i = 0; i < N; i++) {
            double rowSum = 0;
            for (int j = 0; j < M; j++) {
                rowSum += matrix[i][j];
                columnAverages[j] += matrix[i][j];
                totalSum += matrix[i][j];
            }
            rowAverages[i] = Math.round((rowSum / M) * 100.0) / 100.0;
        }

        for (int j = 0; j < M; j++) {
            columnAverages[j] = Math.round((columnAverages[j] / N) * 100.0) / 100.0;
        }

        double matrixAverage = Math.round((totalSum / (N * M)) * 100.0) / 100.0;

        // Display row averages
        output.append("\nRow Averages:\n");
        for (int i = 0; i < N; i++) {
            output.append("Row ").append(i + 1).append(": ").append(rowAverages[i]).append("\n");
        }

        // Display column averages
        output.append("\nColumn Averages:\n");
        for (int j = 0; j < M; j++) {
            output.append("Column ").append(j + 1).append(": ").append(columnAverages[j]).append("\n");
        }

        // Display matrix average
        output.append("\nMatrix Average: ").append(matrixAverage).append("\n");

        // Find the row and column with the second largest average
        double secondLargestRowAvg = findSecondLargest(rowAverages);
        double secondLargestColumnAvg = findSecondLargest(columnAverages);

        output.append("\nSecond Largest Row Average: ").append(secondLargestRowAvg).append("\n");
        output.append("Second Largest Column Average: ").append(secondLargestColumnAvg).append("\n");

        // Modify the cells based on the given conditions
        int countNegativeOne = 0;
        int countPositiveOne = 0;
        int countZero = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matrix[i][j] > rowAverages[i] && matrix[i][j] > columnAverages[j]) {
                    matrix[i][j] = 1;
                    countPositiveOne++;
                } else if (matrix[i][j] < rowAverages[i] && matrix[i][j] < columnAverages[j]) {
                    matrix[i][j] = -1;
                    countNegativeOne++;
                } else {
                    matrix[i][j] = 0;
                    countZero++;
                }
            }
        }

        // Build the output string to display the modified matrix and counts
        output.append("\nModified Matrix is like:\n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                output.append(matrix[i][j]).append(" ");
            }
            output.append("\n");
        }

        output.append("\nCounts of -1, +1, and 0:\n");
        output.append("-1: ").append(countNegativeOne).append("\n");
        output.append("+1: ").append(countPositiveOne).append("\n");
        output.append("0: ").append(countZero).append("\n");

        // Display the entered data and averages
        JOptionPane.showMessageDialog(null, output.toString(), "Matrix", JOptionPane.INFORMATION_MESSAGE);
    }

    private static double findSecondLargest(double[] arr) {
        double largest = Double.NEGATIVE_INFINITY;
        double secondLargest = Double.NEGATIVE_INFINITY;
        for (double value : arr) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }
        return secondLargest;
    }
}
