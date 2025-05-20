package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_36_LoanEligibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Input and Store Values ---
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your monthly salary: ₹");
        double salary = scanner.nextDouble();

        System.out.print("Enter your credit score: ");
        int creditScore = scanner.nextInt();

        // --- Validation Flags ---
        boolean isEligible = true;

        // --- Age Validation ---
        if (age <= 0) {
            System.out.println("❌ Invalid age. Age must be a positive number.");
            isEligible = false;
        } else if (age < 18) {
            System.out.println("❌ Not eligible: Must be at least 18 years old.");
            isEligible = false;
        } else if (age > 80) {
            System.out.println("❌ Not eligible: Age cannot be more than 80.");
            isEligible = false;
        }

        // --- Salary Validation ---
        if (salary <= 0) {
            System.out.println("❌ Invalid salary. Salary must be a positive number.");
            isEligible = false;
        } else if (salary < 30000) {
            System.out.println("❌ Not eligible: Minimum salary must be ₹30,000.");
            isEligible = false;
        }

        // --- Credit Score Validation ---
        if (creditScore <= 0) {
            System.out.println("❌ Invalid credit score. It must be a positive number.");
            isEligible = false;
        } else if (creditScore < 650) {
            System.out.println("❌ Not eligible: Minimum credit score must be 650.");
            isEligible = false;
        } else if (creditScore > 850) {
            System.out.println("❌ Invalid credit score: Maximum allowed is 850.");
            isEligible = false;
        }

        // --- Final Eligibility Check ---
        if (isEligible) {
            System.out.println("✅ You are eligible for the loan.");
        } else {
            System.out.println("❌ You are not eligible for the loan.");
        }

        scanner.close();
    }
    }