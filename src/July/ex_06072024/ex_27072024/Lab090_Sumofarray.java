package July.ex_06072024.ex_27072024;

public class Lab090_Sumofarray {
    public static void main(String[] args) {
       int[] arr = {2,9,5,6};
       int sum =0;
       for (int ele : arr){
           sum=ele+sum;
       }
        System.out.println("Sum of the elements in array are "+sum);
    }
}
