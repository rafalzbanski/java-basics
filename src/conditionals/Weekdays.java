package conditionals;

import java.util.Scanner;

public class Weekdays {
    static String getWeekday(int dayNumber){

        String day = "";

        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid day range";
        }
        return day + " is " + dayNumber + " day of week";
    }
    public static void main(String[] args) {
        /*
        Write a Java program that takes a number from the user
        and generates an integer between 1 and 7. It displays the weekday name.

        Test Data
        Input number: 3
        Expected Output :
        Wednesday
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number of day in week: ");
        int number = scanner.nextInt();

        System.out.println(getWeekday(number));

    }
}
