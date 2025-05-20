package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_30_AlphabetCheck {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input a character from the user
            System.out.print("Enter a character: ");
            char ch = scanner.next().charAt(0);

            // Check if the character is an alphabet (A-Z or a-z)
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                System.out.println(ch + " is an alphabet.");
            } else {
                System.out.println(ch + " is not an alphabet.");
            }

            scanner.close();
        }
    }

