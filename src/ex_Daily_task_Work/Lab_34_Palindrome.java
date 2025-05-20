package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_34_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int original = num;
        int reversed = 0;

        // Reverse the number
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        // Check if original and reversed are the same
        if (original == reversed) {
            System.out.println("✅ " + original + " is a palindrome.");
        } else {
            System.out.println("❌ " + original + " is not a palindrome.");
        }

        scanner.close();
    }
    }
