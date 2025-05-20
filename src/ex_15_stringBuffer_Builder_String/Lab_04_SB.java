package ex_15_stringBuffer_Builder_String;

public class Lab_04_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);

        String s1 = "PRamod";
        s1 = s1+ "Dutta";
        System.out.println(s1);
    }
}
