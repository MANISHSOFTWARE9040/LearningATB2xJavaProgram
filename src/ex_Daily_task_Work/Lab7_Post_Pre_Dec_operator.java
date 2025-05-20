package ex_Daily_task_Work;

public class Lab7_Post_Pre_Dec_operator {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--;

        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);
    }
}
