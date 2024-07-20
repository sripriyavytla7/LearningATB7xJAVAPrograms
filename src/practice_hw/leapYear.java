package practice_hw;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {


        // logic
       // A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the year, Ex: 2003");
        int year = sc.nextInt();
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year +" leap year.");
            }
           else
           {
               System.out.println(year +" is not a leap year.");
           }

    }
}
