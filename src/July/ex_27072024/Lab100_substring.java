package July.ex_27072024;

public class Lab100_substring
{
    public static void main(String[] args) {
        String name  = "TestAcademy";
        System.out.println(name.substring(4));
        String s1 = name.substring(4,6);
        System.out.println(s1);
        CharSequence s2 = name.subSequence(4,6);
        System.out.println(s2);

    }
}
