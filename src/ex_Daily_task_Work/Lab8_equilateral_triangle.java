package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab8_equilateral_triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input side lengths
        System.out.print("Enter length of side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter length of side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter length of side c: ");
        double c = scanner.nextDouble();

        // Check if it's a valid triangle using triangle inequality
        if (a + b > c && a + c > b && b + c > a) {
            // Check if it's equilateral
            if (a == b && b == c) {
                System.out.println("The triangle is equilateral.");
            } else {
                System.out.println("The triangle is not equilateral.");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        scanner.close();
    }
    }

