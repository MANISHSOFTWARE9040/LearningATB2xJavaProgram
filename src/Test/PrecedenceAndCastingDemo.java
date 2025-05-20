package Test;

public class PrecedenceAndCastingDemo {
    public static void main(String[] args) {
        // ----- Operator Precedence -----
        int a = 10, b = 5, c = 2;

        // Without parentheses: * has higher precedence than +
        int result1 = a + b * c;  // Equivalent to 10 + (5 * 2) = 10 + 10 = 20
        System.out.println("Result1 (a + b * c): " + result1);

        // With parentheses: + evaluated first
        int result2 = (a + b) * c;  // (10 + 5) * 2 = 15 * 2 = 30
        System.out.println("Result2 ((a + b) * c): " + result2);

        // Mixed operators with precedence and associativity
        int result3 = a + b - c * 3 / 2;  // 10 + 5 - ((2 * 3) / 2) = 15 - 3 = 12
        System.out.println("Result3 (a + b - c * 3 / 2): " + result3);

        // ----- Implicit Type Casting -----
        int intVal = 100;
        double doubleVal = intVal;  // Implicit casting (int → double)
        System.out.println("\nImplicit Casting:");
        System.out.println("intVal (int): " + intVal);
        System.out.println("doubleVal (double, from intVal): " + doubleVal);

        // ----- Explicit Type Casting -----
        double price = 99.99;
        int roundedPrice = (int) price;  // Explicit casting (double → int), decimal part lost
        System.out.println("\nExplicit Casting:");
        System.out.println("price (double): " + price);
        System.out.println("roundedPrice (int, from price): " + roundedPrice);

        // Casting in expressions
        int x = 7, y = 2;
        double preciseDivision = (double) x / y;  // Cast to double before division
        System.out.println("\nExpression Casting:");
        System.out.println("Integer division (x / y): " + (x / y));            // 3
        System.out.println("Precise division ((double)x / y): " + preciseDivision); // 3.5
    }
    }
