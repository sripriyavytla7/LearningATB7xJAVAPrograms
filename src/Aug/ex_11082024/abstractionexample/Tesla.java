package Aug.ex_11082024.abstractionexample;


public class Tesla extends Car{
    public  void startDrive(){
        insertKey();
        spark(); //Concreate method present in Engine
        partGearBox();
        startEngine();
        stopEngine();
        removeKey();

    }
}
