package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_37_BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Input salary and experience from the user ---
        System.out.print("Enter your salary: ₹");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of experience: ");
        int experience = scanner.nextInt();

        // --- Validate salary and experience ---
        if (salary <= 0) {
            System.out.println("❌ Invalid salary. It must be a positive number.");
        } else if (experience < 0) {
            System.out.println("❌ Invalid experience. It cannot be negative.");
        } else {
            double bonus = 0;

            // --- Bonus Calculation Logic ---
            if (experience < 1) {
                bonus = 0;
            } else if (experience >= 1 && experience <= 3) {
                bonus = 0.05 * salary;
            } else if (experience >= 4 && experience <= 6) {
                bonus = 0.10 * salary;
            } else {
                bonus = 0.15 * salary;
            }

            // --- Display the result ---
            System.out.println("🎁 Your calculated bonus is: ₹" + bonus);
        }

        scanner.close();
    }
    }
