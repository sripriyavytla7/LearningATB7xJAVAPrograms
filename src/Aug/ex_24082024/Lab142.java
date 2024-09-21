package Aug.ex_24082024;

public class Lab142 {
    // Generic class that works with any type T that implements Comparable
    public static void main(String[] args) {
        // Create an instance of the Comparator class for Strings
        comparator<String> stringComparator = new comparator<>();

        // Compare two strings
        String str1 = "apple";
        String str2 = "apple1";
        stringComparator.compare(str1, str2);

        // Example with integers
        comparator<Integer> intComparator = new comparator<>();
        int num1 = 10;
        int num2 = 20;
        intComparator.compare(num1, num2);
    }

}
 class comparator <T extends Comparable<T>> {

    // Method to compare two objects of type T
    public  void compare(T obj1, T obj2) {
        // Check if the objects are exactly equal
        if (obj1.equals(obj2)) {
            System.out.println("The objects are exactly equal.");
        } else {
            System.out.println("The objects are not equal.");
        }

        // Lexicographical or numerical comparison
        int result = obj1.compareTo(obj2);

        if (result == 0) {
            System.out.println("The objects are lexicographically or numerically equal.");
        } else if (result < 0) {
            System.out.println("Object 1 (" + obj1 + ") is less than Object 2 (" + obj2 + ").");
        } else {
            System.out.println("Object 1 (" + obj1 + ") is greater than Object 2 (" + obj2 + ").");
        }
    }
}
