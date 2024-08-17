package July.ex_06072024.ex_20072024;

public class Lab033
{
    public static void main(String[] args) {

//execution
     // If we have more than 2 conditions then we can use switch
        //Use yield

        char code = 'B';

        int val =   switch (code) {
            case 'A':
                yield (65);
            case 'B':
                yield (66);

            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);

    }
}
