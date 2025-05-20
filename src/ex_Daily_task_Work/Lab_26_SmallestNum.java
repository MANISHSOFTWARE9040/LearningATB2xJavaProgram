package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_26_SmallestNum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input two numbers
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // Logic to find the smallest
            if (num1 < num2) {
                System.out.println("The smallest number is: " + num1);
            } else if (num2 < num1) {
                System.out.println("The smallest number is: " + num2);
            } else {
                System.out.println("Both numbers are equal.");
            }
        }
    }

