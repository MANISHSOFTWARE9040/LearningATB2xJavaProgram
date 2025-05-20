package Test;

import java.util.Scanner;

public class PrintNumber {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input N
            System.out.print("Enter a number N: ");
            int N = scanner.nextInt();

            // Validate input
            if (N < 1) {
                System.out.println("Please enter a number greater than 0.");
            } else {
                // Print numbers from 1 to N
                System.out.print("Numbers from 1 to " + N + ": ");
                for (int i = 1; i <= N; i++) {
                    System.out.print(i + " ");
                }
            }

            scanner.close();
        }
    }

