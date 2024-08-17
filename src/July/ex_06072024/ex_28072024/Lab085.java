package July.ex_06072024.ex_28072024;

public class Lab085 {

    public static void main(String[] args) {
        BuldingBP dlf = new BuldingBP(); // here we are creating object for the class dlf
        //here dlf is reference variable where object memory reference id will store .
        // In Java, a reference variable is a type of variable that holds the memory address of an object
        //It acts as a pointer to the object's location in memory, allowing you to access & manipulate the object's data & behavior.
        // Reference variables are essential for working with objects & creating dynamic, flexible programs
        //new BuldingBP() is the object we are creating and it will allocate memory in heap area

        //Execution step- Jvm will do below activities
        //1. BuldingBP class will load
        //2. Later new BuldingBP()  object will create in heap area
        //3. memory reference will store in dlf reference variable
        System.out.println(dlf);
        //Now here using obj reference we will call attributes in parent class
        dlf.name="DLF pvt limited";
        dlf.no_of_rooms = 100;

        dlf.uselift();

    }
}
