package ex_Daily_task_Work;

public class Lab4_Ternary_Age {
    public static void main(String[] args) {
        int age=180;
        String category = (age > 18) ? ((age > 65) ? "Senior" : "Adult") : "Minor";

        System.out.println("-You are a: " + category);
    }
}
