package July.ex_06072024.ex_20072024;

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
