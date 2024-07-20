package ex_20072024;

import java.util.Locale;
import java.util.Scanner;

public class Lab028
{
    public static void main(String[] args) {

//execution
     // If we have more than 2 conditions then we can use switch
        //Which  day it is  1 - sunday, 2- mon day ---

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter day ");
        String browsername  = sc.next();
        browsername = browsername.toLowerCase(Locale.ROOT);

        switch (browsername)
        {
            case "chrome" :
                System.out.println("execute chrome");
                break;
            case "ie" :
                System.out.println("execute ie");
                break;
            case "edge" :
                System.out.println("execute edge");
                break;
            case "firefox" :
                System.out.println("execute firefox");
                break;
            case "safari" :
                System.out.println("execute safari");
                break;
            default:
                System.out.println("not sure which it is");
                break;

        }

    }
}
