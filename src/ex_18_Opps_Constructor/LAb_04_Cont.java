package ex_18_Opps_Constructor;

public class LAb_04_Cont {
    public static void main(String[] args) {
        Car2 tesla = new Car2();
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        Car2 nano = new Car2("nano",2011);
        System.out.println(nano.model);
        System.out.println(nano.year);

        Car2 mghector = new Car2("mghector",2025);
        System.out.println(nano.model);
        System.out.println(nano.year);
    }
}

