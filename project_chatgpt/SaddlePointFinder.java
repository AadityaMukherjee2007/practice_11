package project_chatgpt;

import java.util.Scanner;

public class SaddlePointFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();

        boolean found = false;

        for (int i = 0; i < rows; i++) {
            int minRow = matrix[i][0];
            int minColIndex = 0;

            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < minRow) {
                    minRow = matrix[i][j];
                    minColIndex = j;
                }
            }

            boolean saddlePoint = true;

            for (int k = 0; k < rows; k++) {
                if (matrix[k][minColIndex] > minRow) {
                    saddlePoint = false;
                    break;
                }
            }

            if (saddlePoint) {
                System.out.println("Saddle point found at row " + (i + 1) + ", column " + (minColIndex + 1) + ": " + minRow);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No saddle point found.");
        }
    }
}
