package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_16_Armstong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int result = 0;
        int n = 0;

        // Count number of digits
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            n++;
        }

        // Calculate the sum of digits raised to the power n
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, n);
            temp /= 10;
        }

        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }

        scanner.close();
    }
    }

