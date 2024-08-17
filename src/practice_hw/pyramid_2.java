package practice_hw;

public class pyramid_2 {
    public static void main(String[] args) {
       //     * -1
        //   *** - 3
        //  ***** - 5
        // ******* - 7
        //********* - 9

        //logic to print this one we need to take nested loops
        //To print 5 line we need to use on outer loop
        //To print stars we need to use inner loop
        int rows = 6;
for (int i=1;i<rows;i++)
{
   for(int j=1;j<rows-i;j++)
   {
       System.out.print(" ");
   }
   for (int k=1;k<=(2*i)-1;k++)
   {
       System.out.print("*");
   }
    System.out.println();
}

    }
}
