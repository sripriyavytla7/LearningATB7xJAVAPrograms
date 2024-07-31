package practice_hw;

public class leftTriangle {
    public static void main(String[] args) {
        //*****
        //****
        //***
        //**
        //*

        //logic to print this one we need to take nested loops
        //To print 5 line we need to use on outer loop
        //To print stars we need to use inner loop
        int n=5;
        for(int i = 0;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
