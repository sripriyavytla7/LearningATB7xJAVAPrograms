package ex_20072024;

import java.util.Scanner;

public class Lab027
{
    public static void main(String[] args) {

//execution
     // If we have more than 2 conditions then we can use switch
        //Which  day it is  1 - sunday, 2- mon day ---

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter day ");
        int day = sc.nextInt();

        switch (day)
        {
            case 1 :
                System.out.println("Mon day");
                break;
            case 2 :
                System.out.println("Tue day");
                break;
            case 3 :
                System.out.println("Wed day");
                break;
            case 4 :
                System.out.println("Thur day");
                break;
            case 5 :
                System.out.println("Fri day");
                break;
            case 6:
                System.out.println("Sat day");
                break;
            case 7:
                System.out.println("Sun day");
                break;
            default:
                System.out.println("not sure which it is");
                break;

        }

    }
}
