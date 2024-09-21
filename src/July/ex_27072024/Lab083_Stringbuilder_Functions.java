package July.ex_27072024;

public class Lab083_Stringbuilder_Functions {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        // Append a string
        sb.append(" World");
        System.out.println(sb); // Outputs: Hello World

        // Insert a string at a specified position
        sb.insert(5, ",");
        System.out.println(sb.toString()); // Outputs: Hello, World

        // Delete a substring
        sb.delete(5,7);
        System.out.println(sb.toString()); // Outputs: Hello World

        sb.replace(5,10,"gold");
        System.out.println(sb);

        // Reverse the sequence
        sb.reverse();
        System.out.println(sb.toString()); // Outputs: dlroW olleH

        // Convert to a String
        String finalString = sb.toString();
        System.out.println(finalString); // Outputs: dlroW olleH


        }

    }





