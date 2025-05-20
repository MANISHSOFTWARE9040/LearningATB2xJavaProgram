package Test;

import java.util.Scanner;

public class FactorialNUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter a positive integer to calculate factorial: ");
        int number = scanner.nextInt();

        // Input validation
        if (number < 0) {
            System.out.println("Invalid input! Please enter a non-negative number.");
        } else {
            long factorial = 1;  // Use long for large results
            int i = number;

            // While loop to calculate factorial
            while (i > 1) {
                factorial *= i;
                i--;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
    }

