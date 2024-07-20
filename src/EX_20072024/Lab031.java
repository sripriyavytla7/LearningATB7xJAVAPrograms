package EX_20072024;

import java.util.Locale;
import java.util.Scanner;

public class Lab031
{
    public static void main(String[] args) {

//execution
     // If we have more than 2 conditions then we can use switch
        //use break operator ->

     Scanner sc= new Scanner(System.in);
        System.out.println("Please enter number, ex: 003");
     int a = sc.nextInt();

        switch (a)
        {
            case 001,002,003 -> System.out.println("It is Electronic Gadget!");
            case 004,005,007 -> System.out.println("It is Mechinal Gadget!");
            default->System.out.println("not sure which it is");
        }

    }
}
