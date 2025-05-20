package Test;

public class ComparisonLogicalDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Comparison Operators
        System.out.println("Comparison Operators:");
        System.out.println("a == b: " + (a == b));     // false
        System.out.println("a != b: " + (a != b));     // true
        System.out.println("a < b: " + (a < b));       // true
        System.out.println("a > b: " + (a > b));       // false
        System.out.println("a <= b: " + (a <= b));     // true
        System.out.println("a >= b: " + (a >= b));     // false

        // Logical Operators
        boolean isAdult = true;
        boolean hasTicket = false;

        System.out.println("\nLogical Operators:");
        System.out.println("isAdult && hasTicket: " + (isAdult && hasTicket)); // false
        System.out.println("isAdult || hasTicket: " + (isAdult || hasTicket)); // true
        System.out.println("!isAdult: " + (!isAdult));                         // false
    }
    }

