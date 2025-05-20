package ex_15_stringBuffer_Builder_String;

public class Lab_01_InterviewQ_Reverse_WithoutUsing_Inbuilt {
    public static void main(String[] args) {
        String input = "Pramod";
        // domarP

        for (int i= input.length()-1;i>=0;i--)
        {
            System.out.print(input.charAt(i));
        }

        System.out.println("");

        StringBuffer sb = new StringBuffer(input);
        System.out.println(sb.reverse());

    }
}
