package July.ex_27072024;

import java.util.Arrays;

public class Lab091_maxinarray {
    public static void main(String[] args) {
        int[] arr = {12,8,9,4,5};
        Arrays.sort(arr);
        System.out.println("Max number in the array is "+arr[arr.length-1]);
        System.out.println("2nd max number in array is "+arr[arr.length-2]);

    }
}
