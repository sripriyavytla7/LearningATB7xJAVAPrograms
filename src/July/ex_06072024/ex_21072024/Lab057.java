package July.ex_06072024.ex_21072024;

public class Lab057 {
    public static void main(String[] args) {
        //Functions
        // Piece of code we can reuse
        // We have predefine and user define functions
//Two components of the function
        //1.Define
        //Call the function
//We have 4 different types of functions
        // Function with parameters and return type
        //function with parameters and without return type
        //Function without parameters and with return type
        //Function without parameters and without return type
   //call the function
        String fun1 = function1("test");
        System.out.println(fun1);
        function2(2);
        String fun3 = function3();
        System.out.println(fun3);
        function4();



    }
    //Define - User define function
    static String function1(String priya)
    {
        System.out.println("Function with parameters and with return type");
        return priya;
    }
    static void function2(int a)
    {
        System.out.println("Function with parameters and without return type");
        System.out.println(a);
    }
    static String function3()
    {
        System.out.println("Function without parameters and with return type");
        return "priya";
    }
    static void function4()
    {
        System.out.println("Function without parameters and without return type");
    }
};
