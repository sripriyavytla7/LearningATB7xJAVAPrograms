package Aug.ex_04082024.Vehicle;

 public class Car {
    private static  Engine engine;
    private static Wheel wheels[];

     public Car(){
       System.out.println("constructed called while creating car object");
        engine = new Engine();
       System.out.println("engine object created");
        wheels = new Wheel[4];
        for (int i=0;i<4;i++)
        {
            wheels[i] = new Wheel();
            System.out.println(wheels[i]+" object created");
        }

    }
public static void startCar()
{
    System.out.println("executing startCar method");
    System.out.println("start engine method called");
    engine.start();

    for (Wheel wheel : wheels) {
        System.out.println("rotate wheel  method called");
        wheel.rotate();
    }
    System.out.println("Car is moving");
}

}
