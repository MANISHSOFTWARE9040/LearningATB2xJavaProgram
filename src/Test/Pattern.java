package Test;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the pattern
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // --- Right Triangle Pattern ---
        System.out.println("\nRight Triangle Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }

        // --- Pyramid Pattern ---
        System.out.println("\nPyramid Pattern:");
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }
            // Print stars
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }

        scanner.close();
    }
}
