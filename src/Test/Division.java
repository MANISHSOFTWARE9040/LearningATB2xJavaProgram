package Test;

public class Division {

        public static void main(String[] args) {
            int a = 10;
            int b = 0;
            int result = 0;

            try {
                result = a / b;  // This will throw ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught: Cannot divide by zero.");
            } finally {
                System.out.println("Finally block executed.");
            }

            System.out.println("Program continues after try-catch-finally.");
        }
    }
