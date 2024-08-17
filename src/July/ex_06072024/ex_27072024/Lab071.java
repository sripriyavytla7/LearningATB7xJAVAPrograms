package July.ex_06072024.ex_27072024;

public class Lab071 {
    public static void main(String[] args) {
       //Max salary of the employee
        // Assume max salry as 0

        int[] salary = {20,15,25,8,12};

        int max1 = 0;
        for ( int i = 0;i < (salary.length);i++) {
            if (salary[i] > max1) {
                max1 = salary[i];
            }
        }
        int max2 =-1 ;//8
            for(int j = 0;j <(salary.length);j++)
            {
                if(max2<salary[j]&& max1>salary[j]){
                        max2 =salary[j];


                    System.out.println(j+"value is "+salary[j]);
                }
            }
        int max3 =-2 ;//8
        for(int j = 0;j <(salary.length);j++)
        {
            if(max3<salary[j]&& max1>salary[j]&&max2>salary[j]){
                max3 =salary[j];
                System.out.println(j+"value is "+salary[j]);
            }
        }

        System.out.println("max salary2 is "+max1);
        System.out.println("max salary2 is "+max2);
        System.out.println("max salary2 is "+max3);





    }
}
