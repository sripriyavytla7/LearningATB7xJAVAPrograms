package July.ex_06072024.ex_27072024;

import java.util.Arrays;

public class Lab092_searchelementinarray {

    public static void main(String[] args) {

        //Search elemetn in any array if element is not found return -1 else return index of array
        //Store the search element in One variable
        //Use for  loop to access array
        //Use if condition compare the search variable with each element in array . if at any index element found then return index
        //else return -1
        int[] arr ={23,7,34,7};
        int search =7;
        int result = findElementwithoutfunction(arr,search);
        int result1 = findElementwithfunction(arr,search);
        System.out.println(search +" element found ata index " +result);
        System.out.println(search +" element found ata index " +result1);


    }
   static int  findElementwithoutfunction(int[] arr,int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println(i);
                return i;

            }
        }
        return -1;
    }
    static int findElementwithfunction(int[] arr,int element) {
       return  Arrays.binarySearch(arr,element);

    }
}
