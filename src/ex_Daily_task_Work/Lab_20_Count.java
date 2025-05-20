package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_20_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Remove leading/trailing spaces and replace multiple spaces with single space
        input = input.trim().replaceAll("\\s+", " ");

        // Split the string by single space
        String[] words = input.split(" ");

        System.out.println("Number of words: " + words.length);

        scanner.close();
    }
}
