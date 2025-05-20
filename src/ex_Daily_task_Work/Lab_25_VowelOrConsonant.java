package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_25_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a character from user
        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0);  // convert to lowercase

        // Check if it's an alphabet
        if ((ch >= 'a' && ch <= 'z')) {
            // Check for vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }

        scanner.close();
    }
    }
