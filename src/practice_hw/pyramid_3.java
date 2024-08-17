package practice_hw;

public class pyramid_3 {
    public static void main(String[] args) {

        //********* - 9
        // ******* - 7
        //  ***** - 5
        //   *** - 3
        //    * -1

        //logic to print this one we need to take nested loops
        //To print 5 line we need to use on outer loop
        //To print stars we need to use inner loop
        int rows = 6;
for (int i=1;i<rows;i++)
{
   for(int j=1;j<i;j++)
   {
       System.out.print(" ");
   }
   for (int k=rows-1;k>(2*i)-rows;k--)
   {
       System.out.print("*");
   }
    System.out.println();
}

    }
}
