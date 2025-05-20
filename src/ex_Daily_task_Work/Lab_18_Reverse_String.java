package ex_Daily_task_Work;

import java.util.Scanner;

public class Lab_18_Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Using StringBuffer to reverse the string
        StringBuffer sb = new StringBuffer(input);
        String reversed = sb.reverse().toString();

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
