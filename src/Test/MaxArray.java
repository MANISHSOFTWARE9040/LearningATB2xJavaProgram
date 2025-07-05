package Test;

public class MaxArray {

        public static void main(String[] args) {
            Integer[] numbers = {45, 23, 67, 89, 12, 99, 34};

            Integer max = findMax(numbers);

            if (max != null) {
                System.out.println("Maximum value: " + max);
            } else {
                System.out.println("Array is empty or null.");
            }
        }

        public static Integer findMax(Integer[] array) {
            if (array == null || array.length == 0) {
                return null;
            }

            Integer max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }
    }

