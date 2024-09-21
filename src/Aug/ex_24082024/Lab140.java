package Aug.ex_24082024;

public class Lab140 {
    public static void compareStrings(String str1, String str2) {
        // Check if the strings are exactly equal
        if (str1.equals(str2)) {
            System.out.println("The strings are exactly equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        // Lexicographical comparison
        int result = str1.compareTo(str2);

        if (result == 0) {
            System.out.println("The strings are lexicographically equal.");
        } else if (result < 0) {
            System.out.println("String 1 (\"" + str1 + "\") is lexicographically less than String 2 (\"" + str2 + "\").");
        } else {
            System.out.println("String 1 (\"" + str1 + "\") is lexicographically greater than String 2 (\"" + str2 + "\").");
        }
    }

    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "apple";

        compareStrings(str1, str2);
    }
}
