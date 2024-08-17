package July.ex_06072024.ex_27072024;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Lab079 {
    public static void main(String[] args) {
        day();
    }

public static void day() {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter date (day month year):");

    int date = sc.nextInt();
    int month = sc.nextInt();
    int year = sc.nextInt();

    Calendar calendar = Calendar.getInstance();
    calendar.set(year, month - 1, date); // Months are zero-based

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("Formatted date: " + sdf.format(calendar.getTime()));




}


        }


