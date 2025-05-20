package ex_5_TypeCasting;

public class Lab_4_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
//        short s = phone_no; // Narrowing - implicit
        short s = (short) phone_no; // Narrowing - Explicit
        int num=(int)phone_no;
        System.out.println(s); // 5866
        System.out.println(phone_no);
        System.out.println(num);
    }
}
