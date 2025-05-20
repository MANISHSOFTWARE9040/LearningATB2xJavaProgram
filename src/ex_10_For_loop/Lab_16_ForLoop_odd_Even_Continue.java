package ex_10_For_loop;

public class Lab_16_ForLoop_odd_Even_Continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd -> " + i);
        }
    }
}
