package Aug.ex_10082024.poly.methodoveridding;

public class Lab105 {
    public static void main(String[] args) {
        Hound h1 = new Hound(); //calls default constructor
        h1.bark();
        h1.bark(2);
        Dog d1 = new Dog(2); //calls default constructor
        d1.bark();
        d1.bark(2);
        Dog hd1 = new Hound(); //calls default constructor
        hd1.bark();
        hd1.bark(2);

            }

}
