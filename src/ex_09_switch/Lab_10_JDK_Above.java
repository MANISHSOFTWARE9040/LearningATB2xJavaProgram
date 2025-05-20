package ex_09_switch;

public class Lab_10_JDK_Above {
    public static void main(String[] args) {
        // in JDK > 13
        int itemCode = 001;
        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
