package ex_21072024;

public class Lab051 {
    public static void main(String[] args) {
        //loops
        // For,while and do while loops
        //to perform action multiples
        //Continue - Skip and continue for loop execution
        for (int i = 1; i <=10; i++) {
            if(i%2==0) {
                System.out.println("Even ->" +i);
             continue;
            }
                System.out.println("odd -> " +i);
        }

    }
}
