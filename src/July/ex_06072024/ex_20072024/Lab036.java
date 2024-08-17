package July.ex_06072024.ex_20072024;

import java.util.Scanner;

public class Lab036
{
    public static void main(String[] args) {

//execution
     // If we have more than 2 conditions then we can use switch
        //compare 3 numbers using scannaer and if else

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        System.out.println("Enter num3");
        int num3 = sc.nextInt();

        if (num1>=num2 && num1>=num3)
        {
            System.out.println("max number is " +num1);
        } else if (num2>=num3) {
            System.out.println("max number is " +num2);
        }
        else
        {
            System.out.println("max number is " +num3);
        }

    }
}
