package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_38_TravelEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Input from user ---
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // Clear the newline character

        System.out.print("Is your visa status valid? (yes/no): ");
        String visaStatus = scanner.nextLine().toLowerCase();

        // --- Eligibility Check ---
        if (age >= 18 && visaStatus.equals("yes")) {
            System.out.println("✅ You are eligible to travel.");
        } else {
            System.out.println("❌ You are not eligible to travel.");
        }

        scanner.close();
    }
    }
