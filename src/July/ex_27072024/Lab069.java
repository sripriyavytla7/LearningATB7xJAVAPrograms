package July.ex_27072024;

public class Lab069 {
    public static void main(String[] args) {
//2D array
        int [][] array_2d = { {20,30},{40,50},{60,70}};



        int row = array_2d.length;

        for(int i=0; i<row; i++)

        {
            for (int j=0; j <array_2d[i].length; j++)

            {

                System.out.println(array_2d[i][j]);

                System.out.println(" ");

            }

            System.out.println("");

        }


    }
}