package Test;

public class MultiplicationofTable {
    public static void main(String[] args) {
        // Outer loop for numbers 1 to 5 (tables)
        for (int i = 1; i <= 5; i++) {
            System.out.println("Multiplication Table for " + i + ":");

            // Inner loop for multipliers 1 to 10
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }

            System.out.println(); // Add an empty line between tables
        }
    }
}
