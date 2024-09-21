package July.ex_27072024;

import java.util.Scanner;

public class Lab136_reversestring_withoutfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your string");
        String s1 = sc.nextLine();
       String s2="" ;
       for (int i=0;i<s1.length();i++)
       {
           s2 = s1.charAt(i)+s2;
       }
        System.out.println(s2);
    }
}
