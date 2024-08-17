package Aug.ex_17082024;

public class Lab113 {
    public static void main(String[] args) {
        String num = "10";
        //int a = (int) num;
        Integer a = Integer.valueOf(num); //Converting string to integer
        System.out.println(a);
        int b1=a;  //Unboxing //Converting Integer to int
        System.out.println(b1);

        //String to primitive
        String b = "20";
        int a2=Integer.parseInt(b); //unboxing and ParseInt will use to convert sting to int or Integer
        System.out.println(b);
    }
}
