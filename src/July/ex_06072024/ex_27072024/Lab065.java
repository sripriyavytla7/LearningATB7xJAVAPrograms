package July.ex_06072024.ex_27072024;

import java.util.Scanner;

public class Lab065 {
    public static void main(String[] args) {
       // take array value from scanner

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        int i =0;
        float avg, sum=0 ;
        while(i<marks.length) {
//use while loop
            System.out.println("enter marks for  subject" + (i+1));
            marks[i] = sc.nextFloat();
            sum = sum + marks[i];
            i++;
        }
        avg = sum /marks.length;
        System.out.println("avg is " +avg);
        sc.close();


    }
}
