package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_14_Pallidrone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = scanner.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("It's a Palindrome!");
        } else {
            System.out.println("Not a Palindrome.");
        }

        scanner.close();
    }
    }

