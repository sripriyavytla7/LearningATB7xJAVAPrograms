package Aug.ex_11082024.abstractionexample;

 abstract class Engine extends GearBox {
    //Incomplete class

    void spark(){
        System.out.println("I am a concreate method in abstract calss");

    }
     abstract void startEngine();
    abstract void stopEngine();
}
