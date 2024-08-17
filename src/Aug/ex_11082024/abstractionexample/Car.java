package Aug.ex_11082024.abstractionexample;

public class Car extends Engine {

    @Override
    void startEngine() {
        System.out.println("start the engine of the car");

    }

    @Override
    void stopEngine() {
        System.out.println("stop the engine of the car");

    }

    @Override
    void partGearBox() {
        System.out.println("Start the Gears");

    }

    @Override
    void insertKey() {
        System.out.println("Start the engine using keys");
    }

    @Override
    void removeKey() {
        System.out.println("Stop the engine using keys");
    }
}
