package July.ex_06072024.ex_27072024;

public class Lab094_searchelementinarray {

    public static void main(String[] args) {

        //Search elemetn in any array if element is not found return -1 else return index of array
        //Store the search element in One variable
        //Use for  loop to access array
        //Use if condition compare the search variable with each element in array . if at any index element found then return index
        //else return -1
        int[] arr ={23,7,34,7};
        int search =70;
        boolean flag =false ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println(i);
                flag=true;

            }

        }
        if(flag==false){
            System.out.println(-1);
        }



    }
}
