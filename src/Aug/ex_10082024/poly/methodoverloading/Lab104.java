package Aug.ex_10082024.poly.methodoverloading;

public class Lab104 {
    public static void main(String[] args) {
        MathOpertinos math = new MathOpertinos(); //calls the default constructor public MathOpertinos()
        System.out.println(math.add(2,4)); //public int add(int a, int b)
        System.out.println( math.add(2.5,3.5)); //public double add(double a,  double b)
        System.out.println( math.add(2,3.5)); //public double add(double a,  double b)
        System.out.println( math.add('a','b')); //public int add(char a, char b)
        System.out.println( math.add('a',3.5)); // public double add(double a,  double b)
        System.out.println( math.add("test",3)); //public String add(String a, int b)
        System.out.println( math.add(1,3,4)); //public int add(int a, int b, int c)
        MathOpertinos math1 = new MathOpertinos(1,7); //public MathOpertinos(int a, int b)
        MathOpertinos math2 = new MathOpertinos(1,7); //public MathOpertinos(double a, double b)
        MathOpertinos math3 = new MathOpertinos(1,7,"test"); // public MathOpertinos(int a, int b, String C)

    }
}
