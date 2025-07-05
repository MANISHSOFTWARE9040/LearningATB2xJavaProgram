package Test;

public class GenericPrinter {

        // Generic method to print any type of array
        public static <T> void printArray(T[] array) {
            for (T element : array) {
                System.out.print(element + " ");
            }
            System.out.println(); // For a new line after printing
        }

        public static void main(String[] args) {
            // Test with different types of arrays
            Integer[] intArray = {1, 2, 3, 4, 5};
            String[] strArray = {"Java", "Python", "C++"};
            Double[] dblArray = {3.14, 2.71, 1.41};

            System.out.print("Integer Array: ");
            printArray(intArray);

            System.out.print("String Array: ");
            printArray(strArray);

            System.out.print("Double Array: ");
            printArray(dblArray);
        }
    }

