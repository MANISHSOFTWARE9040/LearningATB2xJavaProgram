package Test;

public class IncrementDecrementDemo {
    public static void main(String[] args) {

            int i = 5;

            // Post-increment
            System.out.println("Post-increment:");
            System.out.println("Initial value of i: " + i);
            System.out.println("Value returned by i++: " + (i++)); // prints 5, then i becomes 6
            System.out.println("Value of i after i++: " + i);      // 6

            // Pre-increment
            i = 5;
            System.out.println("\nPre-increment:");
            System.out.println("Initial value of i: " + i);
            System.out.println("Value returned by ++i: " + (++i)); // i becomes 6, then prints 6
            System.out.println("Value of i after ++i: " + i);      // 6

            // Post-decrement
            i = 5;
            System.out.println("\nPost-decrement:");
            System.out.println("Initial value of i: " + i);
            System.out.println("Value returned by i--: " + (i--)); // prints 5, then i becomes 4
            System.out.println("Value of i after i--: " + i);      // 4

            // Pre-decrement
            i = 5;
            System.out.println("\nPre-decrement:");
            System.out.println("Initial value of i: " + i);
            System.out.println("Value returned by --i: " + (--i)); // i becomes 4, then prints 4
            System.out.println("Value of i after --i: " + i);      // 4
        }
    }

