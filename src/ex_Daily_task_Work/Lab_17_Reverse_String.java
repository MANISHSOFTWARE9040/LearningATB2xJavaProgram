package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_17_Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
    }
