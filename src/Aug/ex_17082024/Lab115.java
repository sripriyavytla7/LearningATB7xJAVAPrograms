package Aug.ex_17082024;

public class Lab115 {

        public static void main(String[] args) {
            A a = new A();
            A a2 = new A();

            a.age =  12;
            System.out.println(a.age);
            System.out.println(A.discount);// Static can call directly using class name
            a.m2();
            A.m1(); // Static can call directly using class name

            // Static don't need object ref. - True

        }

    }

class A{
    int age =10;
    static int discount = 199;
    static {
        System.out.println("Static block function - Should display when class is loaded for the first time");
    }
    {
        System.out.println("default constructor");
    }
    static void m1(){
        System.out.println("m1 - static method");
        // System.out.println(age); - Should not use non static param in static method
    }
    void m2(){
        System.out.println("m2 - Non static method");
        System.out.println(discount);
    }
    }

