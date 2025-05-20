package ex_Daily_task_Work;


import java.util.Scanner;

public class Lab_11_Print_Number_OfDay {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number Of Months");
        int months=scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        int days;

        switch (months){
            case 1:
                System.out.println("Jan");
                System.out.println("31");
                break;
            case 2:
                if ((months % 4 == 0 && months % 100 != 0) || (months % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                System.out.println("Feb");
                System.out.println("28");
                break;
            case 3:
                System.out.println("March");
                System.out.println("31");
                break;
            case 4:
                System.out.println("April");
                System.out.println("30");
                break;
            case 5:
                System.out.println("May");
                System.out.println("31");
                break;
            case 6:
                System.out.println("June");
                System.out.println("30");
                break;
            case 7:
                System.out.println("July");
                System.out.println("31");
                break;
            case 8:
                System.out.println("Agust");
                System.out.println("31");
                break;
            case 9:
                System.out.println("Sept");
                System.out.println("30");

                break;
            case 10:
                System.out.println("Oct");
                System.out.println("31");
                break;
            case 11:
                System.out.println("Nov");
                System.out.println("30");
                break;
            case 12:
                System.out.println("Dec");
                System.out.println("31");
        }

    }
}