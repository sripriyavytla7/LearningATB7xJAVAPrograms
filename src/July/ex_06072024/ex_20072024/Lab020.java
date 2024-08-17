package July.ex_06072024.ex_20072024;

import java.util.Scanner;

public class Lab020
{
    public static void main(String[] args) {


       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1");
        int user_input1 = sc.nextInt();
        System.out.println("User entered number1 is "+user_input1);
        System.out.println("Enter a number2");
        int user_input2 = sc.nextInt();
        System.out.println("User entered number1 is "+user_input2);

        if (user_input1 > user_input2)
        {
            System.out.println(user_input1 +" is max number ");
        }
        else
        {
            System.out.println(user_input2 +" is max number ");
        }
    }
}
