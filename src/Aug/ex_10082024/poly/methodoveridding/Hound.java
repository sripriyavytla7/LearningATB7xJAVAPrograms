package Aug.ex_10082024.poly.methodoveridding;

public class Hound extends Dog {
//    Hound() {
//
//        System.out.println("parameterized constructor constructor of Hound");
//    } // If parent method is parametrized constructor and  when we are trying to create child constructor without calling parent constuctor then it is throwing error
     Hound() {
         super(2); // we need to call parent constructor in first line
        System.out.println("Default  constructor constructor of Hound");
    }

    @Override
    void bark(){
        System.out.println("I am Hound, i will Bark!!");
    }
}
