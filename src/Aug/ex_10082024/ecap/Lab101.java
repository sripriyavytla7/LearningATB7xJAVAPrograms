package Aug.ex_10082024.ecap;

public class Lab101 {
    public static void main(String[] args) {
        ICICIBank priya = new ICICIBank("priya","100000");
        System.out.println(priya.getBalance());
        System.out.println(priya.getName());
        priya.setName("pravi");
        priya.setBalance("5443543",false);
        System.out.println(priya.getBalance());
        System.out.println(priya.getName());

        // Write a code to connect with mySQL
        //  Admin
        boolean are_you_admin = true;
        ICICIBank admin = new ICICIBank("priya","100000");
        priya.setBalance("500",true);
        System.out.println(priya.getBalance());
    }
}
