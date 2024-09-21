package July.ex_27072024;

import java.util.Scanner;

public class Lab139_removeSpecialCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your string");
       String s1 = sc.nextLine();
        System.out.println(s1.replaceAll("[^A-Za-z0-9]",""));
        System.out.println(s1.replace("[^A-Za-z0-9]",""));

    }
}
