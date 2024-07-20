package EX_20072024;

import java.util.Scanner;

public class Lab022
{
    public static void main(String[] args) {

//Grade calculator
        //Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score");
        int score= sc.nextInt();
        System.out.println("User entered score is "+score);
        char grade ;


        if (score >=90 && score<=100)
        {
            grade = 'A';
        }
        else if(score >=80 && score<=89)
        {
            grade = 'B';
        }
        else if(score >=70 && score<=79)
        {
            grade = 'C';
        }
        else if(score >=60 && score<=69)
        {
            grade = 'D';
        }
        else if(score <=0 || score>=100)
        {
            grade = 'o';
            System.out.println("lol your god");

        }
        else
        {
            grade = 'F';
        }
        System.out.println("your grade is "+grade);
    }
}
