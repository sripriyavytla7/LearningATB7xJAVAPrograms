package July.ex_27072024;

import java.util.ArrayList;

public class Lab096_duplicatenumbers_in_array {
    public static void main(String[] args) {
        int [] arr ={6,1,1,6,1};

        ArrayList<Integer> duplicate = new ArrayList<>();
        for (int i=0;i<arr.length;i++ ){
            for(int j=i+1;j<arr.length;j++)
            {
               if (arr[i]==arr[j] && !duplicate.contains(arr[i])){
                   duplicate.add(arr[i]) ;
               }

            }

        }
        if(!duplicate.isEmpty()) {
            for (int ele :duplicate)
                System.out.println(ele);
        }
    }
}
