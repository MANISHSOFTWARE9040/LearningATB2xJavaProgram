package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_38_TravelEligibilityValidated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Input Age ---
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // Clear the buffer

        // --- Validate Age ---
        if (age < 0) {
            System.out.println("❌ Invalid age. Age must be a non-negative number.");
            scanner.close();
            return;
        }

        // --- Input Visa Status ---
        System.out.print("Enter your visa status (valid/invalid): ");
        String visaStatus = scanner.nextLine().trim().toLowerCase();

        // --- Validate Visa Status ---
        if (!(visaStatus.equals("valid") || visaStatus.equals("invalid"))) {
            System.out.println("❌ Invalid visa status. Must be 'valid' or 'invalid'.");
            scanner.close();
            return;
        }

        // --- Eligibility Check ---
        if (age >= 18 && visaStatus.equals("valid")) {
            System.out.println("✅ You are eligible to travel.");
        } else {
            System.out.println("❌ You are not eligible to travel.");
        }

        scanner.close();
    }
    }