package practice_hw;

import java.util.Arrays;

public class secondMaxUsingSortFunction {
    public static void main(String[] args) {
        int [] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        int size = salaries.length;

        Arrays.sort(salaries);

        int second = salaries[size-2];

        System.out.println("2nd largest salary is ::"+ second);
    }

}
