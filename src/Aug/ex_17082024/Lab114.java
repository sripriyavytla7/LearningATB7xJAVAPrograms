package Aug.ex_17082024;

public class Lab114 {

        public static void main(String[] args) {
            Double d = 3.14; // HEAP
            double val = d.doubleValue(); // CM - continuous memory location
            System.out.println(d);
            System.out.println(val);

            String s1 = "pramod"; // SCP - String constant pool
            String s2 = new String("pramod"); // HEAP
    }
}
