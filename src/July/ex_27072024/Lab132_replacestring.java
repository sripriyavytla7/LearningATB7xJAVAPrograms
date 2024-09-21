package July.ex_27072024;

import javax.xml.transform.Source;

public class Lab132_replacestring {
    public static void main(String[] args) {
        String s = "Test test";
        String s1 = "Test Test";
        String s2  = " test ";
        System.out.println(s.replace("Test","block"));
        System.out.println(s1.replace("Test","block"));
        System.out.println(s1.replace('T','v'));
        System.out.println(s1.replaceAll("Test","tutu"));
        System.out.println(s2.trim());
    }
}
