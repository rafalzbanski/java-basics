package basics;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        /*
         Write a Java program to convert temperature from Fahrenheit to basics.Celsius degrees.
         Test Data
         Input a degree in Fahrenheit: 212
         Expected Output:
         212.0 degree Fahrenheit is equal to 100.0 in basics.Celsius
         */

        // variables to store temperature
        int fahrenheit;
        double celsius;

        // scanner for read temperature from user
        Scanner scanner = new Scanner(System.in);

        // sore value from user in variable
        fahrenheit = scanner.nextInt();

        //calculate temperature
        celsius = (fahrenheit - 32) / 1.8;

        // print result
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in basics.Celsius");

    }
}
