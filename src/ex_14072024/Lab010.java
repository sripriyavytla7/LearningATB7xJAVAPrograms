package ex_14072024;

public class Lab010 {
    public static void main(String[] args) {

String S1 = "Priya";
String S2 = "Priya";
String S3 = S2.toLowerCase();
        System.out.println(S1);
        System.out.println(S3);
        String S4 = "Pri"+"ya";
        String S5 = "Sri Priya";
        String S6 = "Sri ";
        String S7 = S6+S1;

        //2 strings in Scp - String constant pool- S1 and S3
        System.out.println(S1==S2);
        System.out.println(S1.equals(S2));
        System.out.println(S1==S4);
        System.out.println(S5==S7);
        System.out.println(S5.equals(S7));



        }
    }
