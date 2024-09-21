package July.ex_27072024;

public class Lab081 {
    public static void main(String[] args) {
        int a[] = {12,5,6,8};
        int temp=0;
        System.out.println("array length is "+a.length);
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i]=a[j];
                    a[j] =temp;
                }
            }
        }
        System.out.println("array after sorting it in ascending order");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

}



