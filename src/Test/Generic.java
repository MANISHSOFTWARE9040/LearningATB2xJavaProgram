package Test;

public class Generic {

        // Generic method to swap two elements in an array
        public static <T> void swap(T[] array, int i, int j) {
            if (i >= 0 && j >= 0 && i < array.length && j < array.length) {
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            } else {
                System.out.println("Invalid indices for swapping.");
            }
        }

        // Main method to test
        public static void main(String[] args) {
            String[] strArray = {"A", "B", "C", "D"};
            Integer[] intArray = {1, 2, 3, 4};

            System.out.println("Before swap: " + java.util.Arrays.toString(strArray));
            swap(strArray, 1, 3);
            System.out.println("After swap:  " + java.util.Arrays.toString(strArray));

            System.out.println("Before swap: " + java.util.Arrays.toString(intArray));
            swap(intArray, 0, 2);
            System.out.println("After swap:  " + java.util.Arrays.toString(intArray));
        }
    }


