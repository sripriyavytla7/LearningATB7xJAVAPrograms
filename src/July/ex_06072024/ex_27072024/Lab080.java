package July.ex_06072024.ex_27072024;

public class Lab080 {
    public static void main(String[] args) {
        int a[] = {12,5,6,8};
        int temp=0;
        System.out.println("array length is "+a.length);
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[1]);
        System.out.println("array after sorting it in descending order");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

}



