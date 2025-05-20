package ex_7_Increment_Decrement;

public class Lab_06_Adv_ID {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);
        // A+B
        // A -> a++ -> ExpA -> 10 , a -> 11
        // +
        // B -> a -> ExpB -> 11

        // ERT
        // LNo |  a | Exp
        // 5   | 10  | NA
        // 6   | -  | 10+11 ->  21

    }
}
