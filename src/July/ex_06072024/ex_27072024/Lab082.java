package July.ex_06072024.ex_27072024;

import java.util.Scanner;

public class Lab082 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some text:");
        String word = scanner.next(); // Reads the first word
        System.out.println("Using next(): " + word);

        scanner.nextLine(); // Consume the remaining newline character

        System.out.println("Enter some text:");
        String line = scanner.nextLine(); // Reads the entire line
        System.out.println("Using nextLine(): " + line);

        }

    }





