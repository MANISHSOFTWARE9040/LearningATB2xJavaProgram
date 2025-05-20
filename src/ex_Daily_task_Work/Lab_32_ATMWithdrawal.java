package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_32_ATMWithdrawal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Initialize account balance
        int balance = 10000;

        // Step 2: Get withdrawal amount from user
        System.out.print("Enter the amount to withdraw: ₹");
        int withdrawAmount = scanner.nextInt();

        // Step 3: Check withdrawal conditions
        if (withdrawAmount <= 0) {
            System.out.println("❌ Error: Amount must be greater than zero.");
        } else if (withdrawAmount % 100 != 0) {
            System.out.println("❌ Error: Amount must be a multiple of ₹100.");
        } else if (withdrawAmount > balance) {
            System.out.println("❌ Error: Insufficient balance.");
        } else {
            // Step 4: Deduct amount from balance
            balance -= withdrawAmount;

            // Step 5: Display updated balance
            System.out.println("✅ Withdrawal successful!");
            System.out.println("💰 Remaining Balance: ₹" + balance);
        }

        scanner.close();
    }
    }
