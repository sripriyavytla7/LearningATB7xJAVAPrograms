package July.ex_27072024;
import java.util.Scanner;

public class Lab073 {
    public static void main(String[] args) {
        System.out.println("program to check whether input is digit or not");

        Scanner SC = new Scanner(System.in);

        System.out.println("Enter the value");

        char value = SC.next().charAt(0);

        if (value >= '0' && value <= '9') {

            System.out.println("The value is a digit");

        } else {

            System.out.println("The value is not a digit");

        }
    }
}

