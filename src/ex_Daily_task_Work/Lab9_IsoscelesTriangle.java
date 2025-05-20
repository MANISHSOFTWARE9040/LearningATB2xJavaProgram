package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab9_IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input side lengths
        System.out.print("Enter length of side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter length of side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter length of side c: ");
        double c = scanner.nextDouble();

        // Check if it's a valid triangle
        if (a + b > c && a + c > b && b + c > a) {
            // Check if exactly two sides are equal (isosceles)
            if ((a == b && a != c) || (b == c && b != a) || (a == c && a != b)) {
                System.out.println("The triangle is isosceles.");
            } else {
                System.out.println("The triangle is not isosceles.");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        scanner.close();
    }
    }

