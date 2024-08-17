package practice_hw;

public class pyramid_4 {
    public static void main(String[] args) {
        //1    * -1
        //2   *** - 3
        //3  ***** - 5
        //4 ******* - 7
        //5********* - 9
        //6 ******* - 7
        //7  ***** - 5
        //8   *** - 3
        //9    * -1

        //logic to print this one we need to take nested loops
        //To print 5 line we need to use on outer loop
        //To print stars we need to use inner loop
        int rows = 3;
for (int i=1;i<=rows;i++)
{
   for(int j=1;j<=rows-i;j++)
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
