package ex_27072024;

import java.util.Scanner;

public class Lab063 {
    public static void main(String[] args) {
       // take array value from scanner

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("enter marks for 1st subject");
        marks[0]= sc.nextFloat();
        System.out.println("enter marks for 2nd subject");
        marks[1]= sc.nextFloat();
        System.out.println("enter marks for 3rd subject");
        marks[2]= sc.nextFloat();
        System.out.println("enter marks for 4th subject");
        marks[3]= sc.nextFloat();
        System.out.println("enter marks for 5th subject");
        marks[4]= sc.nextFloat();

        float avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/ marks.length;
        System.out.println(avg);
        sc.close();


    }
}
