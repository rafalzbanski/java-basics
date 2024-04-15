package basics;

import java.util.Scanner;

public class Inches {
    public static void main(String[] args) {
        /*
        Write a Java program that reads a number in inches and converts it to meters.
        Note: One inch is 0.0254 meter.
        Test Data
        Input a value for inch: 1000
        Expected Output :
        1000.0 inch is 25.4 meters
         */

        // variable to store values
        int inches;
        double meters;

        // scanner to read users input
        Scanner scanner = new Scanner(System.in);

        // read input
        inches = scanner.nextInt();

        // calculate meters
        meters = inches * 0.0254;

        //output result
        System.out.println(inches + " inch is " + meters + " meters.");
    }
}
