package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_29_GradeCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter your marks (0 to 100): ");
        int marks = sc.nextInt();

        // Step 2: Check validity of marks
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        } else {
            // Step 3: Use if-else-if to determine grade
            if (marks >= 90) {
                System.out.println("Grade: A+");
            } else if (marks >= 80) {
                System.out.println("Grade: A");
            } else if (marks >= 70) {
                System.out.println("Grade: B");
            } else if (marks >= 60) {
                System.out.println("Grade: C");
            } else if (marks >= 50) {
                System.out.println("Grade: D");
            } else if (marks >= 40) {
                System.out.println("Grade: E");
            } else {
                System.out.println("Grade: Fail");
            }
        }
    }
    }

