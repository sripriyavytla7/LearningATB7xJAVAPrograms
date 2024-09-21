package July.ex_27072024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lab097_duplicatenumbers_in_array {
    public static void main(String[] args) {
        int [] arr ={6,1,1,6,1};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++ ){
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> ele : map.entrySet())
        {
            if(ele.getValue()>1) {
                System.out.println("Element " + ele.getKey() + " is present " + ele.getValue() + " times in an array");
            }
        }

    }
}
