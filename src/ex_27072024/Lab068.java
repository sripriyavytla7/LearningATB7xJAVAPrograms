package ex_27072024;

public class Lab068 {
    public static void main(String[] args) {
//Single dimension array
        int[] num = {1,2,3};
        int[] num1= new int[3];


//2D array
        int[][] num2 = {{1,2},{3,4}};
        System.out.println(num2[0][0]);
        System.out.println(num2[0][1]);
        System.out.println(num2[1][0]);
        System.out.println(num2[1][1]);
        System.out.println(num2.length);//2
        int[][] num3 = new int[2][2];
        System.out.println(num3[1][1]);
        System.out.println(num3[0][1]);
        System.out.println(num3[0][0]);
        System.out.println(num3[1][0]);
        System.out.println(num3.length);//2
        num3[1][1] = 20;
        System.out.println(num3[1][1]);


    }
}