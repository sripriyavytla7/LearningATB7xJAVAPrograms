package July.ex_27072024;

import java.util.Arrays;

public class Lab093_searchelementinarray {

    public static void main(String[] args) {

        //Search elemetn in any array if element is not found return -1 else return index of array
        //Store the search element in One variable
        //Use for  loop to access array
        //Use if condition compare the search variable with each element in array . if at any index element found then return index
        //else return -1
        int[] arr ={23,7,34,7};
        int search =7;
        int result =-1 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                result=i;

            }

        }
        System.out.println(result);


    }
}
