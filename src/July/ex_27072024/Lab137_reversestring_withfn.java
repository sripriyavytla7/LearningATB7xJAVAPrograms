package July.ex_27072024;

import java.util.Scanner;

public class Lab137_reversestring_withfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your string");
       String s1 = sc.nextLine();
       StringBuilder sb = new StringBuilder(s1);
        System.out.println(sb.reverse().toString());

    }
}
