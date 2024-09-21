package July.ex_20072024;

import java.util.Scanner;

public class Lab034
{
    public static void main(String[] args) {

//execution
     // If we have more than 2 conditions then we can use switch
        //ask details name ,age and salary

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your Salary");
        double salary = sc.nextDouble();

        System.out.println("Your details are " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your Salary is " + salary);


        sc.close();

    }
}
