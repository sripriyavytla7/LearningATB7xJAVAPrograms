package practice_hw;
public class fizzBuzz {
    public static void main(String[] args) {


        // logic
       //Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."
        //take a loop to print 100 numbers  (int i = 1; i<=100;i++)
        //Inside loop take if condition
        //if (i%3==0 && i%5 ==0) print FizzBuzz
        //elseif (i%3=0) print Frizz
        //elseif (i%5=0) print Buzz
        //else print number i
        for (int i=1; i<=100; i++)
        {
            if (i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }

        }





    }
}
