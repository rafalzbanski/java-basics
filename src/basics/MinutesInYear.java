package basics;

import java.util.Scanner;

public class MinutesInYear {
    public static void main(String[] args) {
        /*
        Write a Java program to convert minutes into years and days.

        Test Data
        Input the number of minutes: 3456789
        Expected Output :
        3456789 minutes is approximately 6 years and 210 days
         */

        Scanner scanner = new Scanner(System.in);

        double minutes;
        double years;
        double days;

        System.out.print("Input the number of minutes: ");
        minutes = scanner.nextInt();

        years =  (int) (minutes / 525600);
        days = (int)((minutes / 1440) % 365);
        System.out.print(minutes + " minutes is approximately " + years + " years and " + days +"  days");

    }
}
