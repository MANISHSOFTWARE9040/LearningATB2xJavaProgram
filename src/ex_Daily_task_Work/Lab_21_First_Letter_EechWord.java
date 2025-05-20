package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_21_First_Letter_EechWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Remove extra spaces and split the string into words
        input = input.trim().replaceAll("\\s+", " ");
        String[] words = input.split(" ");

        System.out.println("First letter of each word:");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.print(word.charAt(0) + " ");
            }
        }

        scanner.close();
    }
}
