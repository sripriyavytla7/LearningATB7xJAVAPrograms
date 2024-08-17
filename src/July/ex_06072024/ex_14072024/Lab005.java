package July.ex_06072024.ex_14072024;

public class Lab005 {
    public static void main(String[] args) {
        //widening
        char a = 'a';
        int b= a; // Implicit casting

        System.out.println(b);
        char f = 'a';
        int d= (int)f; // Explicit  casting

        System.out.println(b);

//narrowing - we will lost data
        int val = 502;
        byte c = (byte) val; //Explicit casting
        System.out.println(c);

    }


}
