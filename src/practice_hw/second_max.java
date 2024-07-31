package practice_hw;

public class second_max {
    public static void main(String[] args) {

        int[] salary = {7, 10, 4, 13, 25, 18, 9, 8, 17};

        int max1 = 0; // Considering salary shouldn't be zero
        int max2 =-1 ;//considering salary shouldn't be negative
        for ( int i = 0;i < (salary.length);i++) {
            if (salary[i] > max1) {
                max2 =max1;
                max1 = salary[i];
            } else if (salary[i] > max2 && salary[i] != max1) {
                max2 = salary[i];
            }


        }

        System.out.println("max salary1 is "+max1);
        System.out.println("max salary2 is "+max2);
    }
}
