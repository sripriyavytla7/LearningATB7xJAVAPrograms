package Aug.ex_10082024.poly.methodoveridding;

public class Dog {
    Dog(int a) {
        System.out.println("parameterized constructor constructor of Dog");
    }

    void bark() {
        System.out.println("I am Dog, i will Bark!!");
    }
    void bark(int a) {
        System.out.println("I am Dog, i will Bark " +a+" times!!");
    }
}
