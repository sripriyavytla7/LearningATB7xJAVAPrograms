package July.ex_27072024;

public class Lab095_duplicatenumber_in_array {
    public static void main(String[] args) {
        int [] arr ={6,1,1,6};
        int duplicate=-1;
        for (int i=0;i<arr.length;i++ ){
            for(int j=i+1;j<arr.length;j++)
            {
               if (arr[i]==arr[j]){
                   duplicate = arr[i];
                   break;
               }

            }
            if(duplicate!=-1)
            {
                break;
            }
        }
        System.out.println(duplicate);
    }
}
