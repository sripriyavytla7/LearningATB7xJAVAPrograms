package July.ex_27072024;

import javax.xml.transform.Source;

public class Lab058 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]); //By default it will save 0 in array if we not defined any value
        marks[0]=23;
        System.out.println(marks[0]);
        String[] cart = new String[3];
        System.out.println(cart.length);
        System.out.println(cart[0]); ////By default it will save 0 in array if we not defined any value
        cart[0]="milk";
        System.out.println(cart[0]);
    }
}
