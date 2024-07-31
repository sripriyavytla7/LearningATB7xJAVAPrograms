package ex_27072024;

public class Lab061 {
    public static void main(String[] args) {
        final int num[] = new int[4]; //Final value is for length  not for array values
        num[3] = 78;
        System.out.println(num[3]);


        final int num1[]= {0,1,2,3};
        num1[1]=20;
        System.out.println(num1[1]);
        System.out.println(num1.length);
        num1[5]=20;
        System.out.println(num1.length);


    }
}
