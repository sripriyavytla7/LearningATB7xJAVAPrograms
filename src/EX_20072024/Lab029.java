package EX_20072024;

import java.util.Locale;
import java.util.Scanner;

public class Lab029
{
    public static void main(String[] args) {

//execution
     // If we have more than 2 conditions then we can use switch
        //vowels

  char letter = 'c';

        switch (letter)
        {
            case 'a','e','i','o','u' -> System.out.println("vowel");

            default -> System.out.println("consonant");

        }

    }
}
