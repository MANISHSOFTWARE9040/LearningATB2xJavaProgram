package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_12_Reverse_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");

        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            int reverse = 0;

            while (num != 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }

            System.out.println("You entered a number.");
            System.out.println("Reversed Number is: " + reverse);
        } else {
            String input = scanner.next();
            System.out.println("Sorry! You entered a string: \"" + input + "\"");
            System.out.println("Please enter a valid number next time.");
        }

        scanner.close();
    }
}
