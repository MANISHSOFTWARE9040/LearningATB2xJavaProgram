package Test;

public class AgeValidation {

        // Custom Exception as inner class
        static class InvalidAgeException extends Exception {
            public InvalidAgeException(String message) {
                super(message);
            }
        }

        // Method to validate age
        public static void validateAge(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older. Provided age: " + age);
            }
            System.out.println("Age is valid: " + age);
        }

        // Main method to test
        public static void main(String[] args) {
            try {
                validateAge(15);  // This will throw InvalidAgeException
            } catch (InvalidAgeException e) {
                System.out.println("Caught exception: " + e.getMessage());
            }

            try {
                validateAge(20);  // This will pass
            } catch (InvalidAgeException e) {
                System.out.println("Caught exception: " + e.getMessage());
            }
        }
    }

