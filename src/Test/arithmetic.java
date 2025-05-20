package Test;

public class arithmetic {
    public static void main(String[] args) {

            // Initial value
            int number = 10;

            // Arithmetic Operators
            int sum = number + 5;        // Addition
            int difference = number - 3; // Subtraction
            int product = number * 2;    // Multiplication
            int quotient = number / 2;   // Division
            int remainder = number % 3;  // Modulus

            // Print Arithmetic Results
            System.out.println("Arithmetic Operations:");
            System.out.println("number + 5 = " + sum);
            System.out.println("number - 3 = " + difference);
            System.out.println("number * 2 = " + product);
            System.out.println("number / 2 = " + quotient);
            System.out.println("number % 3 = " + remainder);

            // Assignment Operators
            int value = 10;

            System.out.println("\nAssignment Operations:");

            System.out.println("Initial value: " + value);

            value += 5;  // value = value + 5
            System.out.println("After += 5: " + value);

            value -= 3;  // value = value - 3
            System.out.println("After -= 3: " + value);

            value *= 2;  // value = value * 2
            System.out.println("After *= 2: " + value);

            value /= 4;  // value = value / 4
            System.out.println("After /= 4: " + value);

            value %= 3;  // value = value % 3
            System.out.println("After %= 3: " + value);
        }
    }

