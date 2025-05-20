package ex_02_JAVA_Basic2;

public class Lab_14_Final {
    int a=10;
    public static void main(String[] args) {
        int local;
        local = 10;
        System.out.println(local);

        final float PI = 3.14f;
        // PI = 3.13f; This is final in nature.
        System.out.println(PI);
    }
}
