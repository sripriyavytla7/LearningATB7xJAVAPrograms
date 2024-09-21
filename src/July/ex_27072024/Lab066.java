package July.ex_27072024;

import java.util.Scanner;

public class Lab066 {
    public static void main(String[] args) {
       //Max salary of the employee
        // Assume max salry as 0

        int[] salary = {7,12,15,20,16,6};

        int max =0;
        int min = salary[0];
        for ( int i = 0;i < (salary.length);i++)
        {
            if (salary[i]>max)
            {
                max = salary[i];
            }
            if(salary[i]<min)
            {
                min = salary[i];
            }
        }
        System.out.println("max salary is "+max);
        System.out.println("min salary is "+min);




    }
}
