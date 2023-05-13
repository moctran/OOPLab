package Week1;
import java.util.*;
public class DaysOfAMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the month and year
        System.out.print("Enter the month (e.g. January, Jan., Jan, 1): ");
        String monthString = input.nextLine().toLowerCase();
        System.out.print("Enter the year (e.g. 1999): ");
        int year = input.nextInt();
        int days = 0;
        // Validate the user input for the year
        while (year < 0) {
            System.out.print("Invalid input. Please enter a non-negative number for the year: ");
            year = input.nextInt();
        }

        // Determine the month number based on the user input
        int month = 0;
        if (monthString.equals("january") || monthString.equals("jan.") || monthString.equals("jan") || monthString.equals("1")) {
            month = 1;
        } else if (monthString.equals("february") || monthString.equals("feb.") || monthString.equals("feb") || monthString.equals("2")) {
            month = 2;
        } else if (monthString.equals("march") || monthString.equals("mar.") || monthString.equals("mar") || monthString.equals("3")) {
            month = 3;
        } else if (monthString.equals("april") || monthString.equals("apr.") || monthString.equals("apr") || monthString.equals("4")) {
            month = 4;
        } else if (monthString.equals("may") || monthString.equals("5")) {
            month = 5;
        } else if (monthString.equals("june") || monthString.equals("jun") || monthString.equals("6")) {
            month = 6;
        } else if (monthString.equals("july") || monthString.equals("jul") || monthString.equals("7")) {
            month = 7;
        } else if (monthString.equals("august") || monthString.equals("aug.") || monthString.equals("aug") || monthString.equals("8")) {
            month = 8;
        } else if (monthString.equals("september") || monthString.equals("sep.") || monthString.equals("sep") || monthString.equals("9")) {
            month = 9;
        } else if (monthString.equals("october") || monthString.equals("oct.") || monthString.equals("oct") || monthString.equals("10")) {
            month = 10;
        } else if (monthString.equals("november") || monthString.equals("nov.") || monthString.equals("nov") || monthString.equals("11")) {
            month = 11;
        } else if (monthString.equals("december") || monthString.equals("dec.") || monthString.equals("dec") || monthString.equals("12")) {
            month = 12;
        }
        switch (month) {
            case 2:
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
                break;
        }
        System.out.println(days);
    }
}
