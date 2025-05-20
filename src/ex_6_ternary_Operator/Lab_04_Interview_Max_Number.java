package ex_6_ternary_Operator;

public class Lab_04_Interview_Max_Number {
    public static void main(String[] args) {


        // Find the maximum number between two numbers.
        int x = 10;
        int y = 20;
        System.out.println(Math.max(x, y));

        int max = x > y ? x : y;
        System.out.println(max);
    }
}
