package Test;

public class MultiCatch {

        public static void main(String[] args) {
            int[] numbers = {10, 20, 30};
            int result = 0;

            try {
                int index = 5;
                int divisor = 0;

                // This line may throw ArrayIndexOutOfBoundsException
                result = numbers[index];

                // This line may throw ArithmeticException
                result = result / divisor;

                System.out.println("Result: " + result);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid array index.");

            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: Cannot divide by zero.");

            } finally {
                System.out.println("Finally block executed.");
            }

            System.out.println("Program continues...");
        }
    }

