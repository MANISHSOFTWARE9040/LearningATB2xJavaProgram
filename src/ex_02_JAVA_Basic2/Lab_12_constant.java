package ex_02_JAVA_Basic2;

public class Lab_12_constant {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a->"+a);

        final int b = 99;
        //b =11;  // java: cannot assign a value to final variable b
        System.out.println("b->"+b);
        //b = b+1;
        System.out.println("b->"+b);
        System.out.println("b->"+b);

        final float PI = 3.14f;
        final float PI1 = 3.14f;
        final float PI2 = 3.14f;
        final float PI4 = 3.14f;

        final int a1 = 10;

        //PI = 90;
    }
}
