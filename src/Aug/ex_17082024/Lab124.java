package Aug.ex_17082024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab124 {
    public static void main(String[] args) {
// Checked exceptions - JVM knows before running the code only
        try {
            FileInputStream file = new FileInputStream("C://log.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // Checked exceptions - JVM knows before running the code only
        try {
            int a = 10;
            int c = a/0; // java.lang.ArithmeticException
            System.out.println("c");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("End of program");
    }
}
