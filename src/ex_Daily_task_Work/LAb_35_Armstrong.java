package ex_Daily_task_Work;

import java.util.Scanner;

public class LAb_35_Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int original = num;
        int sum = 0;

        // Calculate the sum of cubes of digits
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        // Check if it is an Armstrong number
        if (original == sum) {
            System.out.println("✅ " + original + " is an Armstrong number.");
        } else {
            System.out.println("❌ " + original + " is not an Armstrong number.");
        }

        scanner.close();
    }
    }
