package ex_20072024;

import java.util.Scanner;

public class Lab037
{
    public static void main(String[] args) {

//execution
     // If we have more than 2 conditions then we can use switch
        //compare 3 numbers using scannaer and if else

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        char letter = sc.nextLine().charAt(0);


        if (letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
        {
            System.out.println(letter+ " is vowel");
        }
        else
        {
            System.out.println(letter+ " is consonant");
        }

    }
}
