package July.ex_06072024.ex_21072024;

import java.util.Scanner;

public class Lab054 {
    public static void main(String[] args) {
        //loops
        // For,while and do while loops
        //Find factorial valie of given number
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number ");
        int n = sc.nextInt();
        long fact  = 1 ;
        for (int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        System.out.println("factorial of number " +n +" is "+fact);

    }
}
