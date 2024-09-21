package July.ex_27072024;

public class Lab099_stringConversion {
    public static void main(String[] args) {
        String name = "Praveena";
        String name2="";
        char [] name1 = name.toCharArray();
        for (char c :name1)
        {
            System.out.println(c);
           name2 =name2+c;
        }
        System.out.println(name2);
        System.out.println(name == name2);
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.toLowerCase().equals(name2.toLowerCase()));
        System.out.println(name.indexOf("eena"));
        System.out.println(name.indexOf("e"));
        System.out.println(name.charAt(1));
    }

}
