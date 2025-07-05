package Test;

public class NumberSystem {

        // Generic method that accepts only numbers and returns their sum
        public static <T extends Number> double sum(T[] numbers) {
            double total = 0.0;
            for (T num : numbers) {
                total += num.doubleValue();  // Convert to double for summing
            }
            return total;
        }

        public static void main(String[] args) {
            Integer[] intArray = {10, 20, 30};
            Double[] doubleArray = {1.5, 2.5, 3.0};
            Float[] floatArray = {1.2f, 3.4f, 5.6f};

            System.out.println("Sum of Integer array: " + sum(intArray));
            System.out.println("Sum of Double array: " + sum(doubleArray));
            System.out.println("Sum of Float array: " + sum(floatArray));
        }
    }
