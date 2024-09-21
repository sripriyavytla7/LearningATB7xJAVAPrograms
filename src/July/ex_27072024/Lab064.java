package July.ex_27072024;

import java.util.Scanner;

public class Lab064 {
    public static void main(String[] args) {
       // take array value from scanner
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        float avg, sum=0 ;
        for (int i=0;i<marks.length;i++) {
            System.out.println("enter marks for  subject" + (i+1));
            marks[i] = sc.nextFloat();
            sum = sum + marks[i];
        }
        avg = sum /marks.length;
        System.out.println("avg is " +avg);
        sc.close();


    }
}
