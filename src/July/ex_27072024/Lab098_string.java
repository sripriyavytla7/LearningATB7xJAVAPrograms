package July.ex_27072024;

public class Lab098_string {
    public static void main(String[] args) {
        String name = "prav";
        String name1 = new String("sri");
        System.out.println(name.concat("eena"));
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        String s4 = s1+s2;
        String s5 = "hello";
        String s7 = "Helloworld";
        String s6 = s1.concat("world");
        System.out.println(s1==s5);
        System.out.println(s3 ==s4);
        System.out.println(s6==s4);
        System.out.println(s3==s7);
        System.out.println(s3.equals(s4));
    }

}
