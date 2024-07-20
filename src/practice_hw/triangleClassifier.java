package practice_hw;

import java.util.Scanner;

public class triangleClassifier {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Side1 of the triangle");
        int side1 = sc.nextInt();
        System.out.println("Enter Side2 of the triangle");
        int side2 = sc.nextInt();
        System.out.println("Enter Side3 of the triangle");
        int side3 = sc.nextInt();

        // logic
        //compare side 1 -> Side 2 and Side 1->side 3   - > equilateral
        //compare side 1 -> Side 2 or Side 1->side 3 or Side2 = side 3 -> isosceles
        //else  scalene

        if (side1==side2 && side1==side3)
        {
            System.out.println("The triangle is equilateral.");
        } else if (side1==side2||side1==side3||side2==side3) {
            System.out.println("The triangle is isosceles.");
        }
        else {
            System.out.println("The triangle is scalene.");
        }
        sc.close();

    }
}
