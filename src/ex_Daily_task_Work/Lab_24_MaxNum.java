package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_24_MaxNum {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Input two numbers from user
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Check which number is greater
            if (num1 > num2) {
                System.out.println("Maximum number is: " + num1);
            } else if (num2 > num1) {
                System.out.println("Maximum number is: " + num2);
            } else {
                System.out.println("Both numbers are equal.");
            }

            scanner.close();
        }
    }

