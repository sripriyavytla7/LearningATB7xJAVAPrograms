package Aug.ex_10082024.superthiskeyword;

public class Lab106 {
    // super()
    //1. Use of super with Variables
    //2. Use of super with Methods
    //3. Use of super with constructors

    // super keyword in Java is a reference variable that allows
    // a subclass - child class
    // to refer to its parent class.
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
        car.message();
    }
}
class Car extends Vehicle{
    int max_speed = 280;
    Car(){
        super(10); // Constructor Chaining
        System.out.println("DC Car");

    }

    public void display(){
        System.out.println("Car speed is -> "+ this.max_speed);
        System.out.println("Vehicle speed is -> "+ super.max_speed);
        super.message();
        this.message();

    }

    @Override
    void message() {
        System.out.println("Hello Vehicle");
    }
}
class Vehicle{
     int max_speed = 180;
     Vehicle()
    {
        System.out.println("DC Vehicle");
    }
    public Vehicle(int a)
    {
        System.out.println("PC Vehicle");
    }
    void message(){
        System.out.println("Hello Vehicle");
    }
    void message(int a ){
        System.out.println("Hello Vehicle");
    }
        }
