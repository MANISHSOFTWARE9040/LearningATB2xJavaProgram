package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_33_TriangleValidityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three sides from the user
        System.out.print("Enter first side: ");
        int a = scanner.nextInt();

        System.out.print("Enter second side: ");
        int b = scanner.nextInt();

        System.out.print("Enter third side: ");
        int c = scanner.nextInt();

        // Check triangle validity using triangle inequality theorem
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("✅ The triangle is valid.");
        } else {
            System.out.println("❌ The triangle is not valid.");
        }

        scanner.close();
    }
    }

