package Aug.ex_10082024.poly.methodoverloading;

public class MathOpertinos {
    //Overloading example with constructor
    public MathOpertinos() {
        System.out.println("this is default constructor");
    }

    public MathOpertinos(int a, int b) {
        System.out.println("this is Parameterized constructor with 2 integer parameters");
    }

    public MathOpertinos(double a, double b) {
        System.out.println("this is Parameterized constructor with 2 integer parameters");
    }

    public MathOpertinos(int a, int b, String C) {
        System.out.println("this is Parameterized constructor with 2 integer parameters and 1 string");
    }

    // here in above all constructors we are using same method MathOpertinos but only difference we are doing is changing argument count and data type
    //Method overloading example with methods
    public int add(int a, int b) {
        return a + b;
    }

    ;

    public int add(int a, int b, int c) {
        c = a + b;
        return c;
    }

    ;

    public double add(double a,  double b) {
        return a + b;
    }

    ;

    public int add(char a, char b) {
        return a + b;
    }

    ;

    //    public char add(char a, char b){
//        return a;
//    }; // Eventhough we changes the return type to char still it will throw compile error  as
    // " add(char, char)' is already defined in 'Aug.ex_10082024.poly.methodoverloading.MathOpertinos'"
    public String add(String a, String b) {
        return a + b;
    }

    ;

    public String add(String a, int b) {
        return a + b;
    }

    ;
}
