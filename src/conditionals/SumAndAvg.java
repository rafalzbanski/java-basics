package conditionals;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SumAndAvg {
    static double sum(int[] tab){

        double sumOfDigits = 0;

        for (int i: tab) {
            sumOfDigits += i;
        }

        return sumOfDigits;
    }

    static double avg(int[] tab){

        return sum(tab) / tab.length;
    }
    public static void main(String[] args) {
        /*
        Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

        Test Data
        Input the 5 numbers : 1 2 3 4 5
        Expected Output :
        Input the 5 numbers :
        1
        2
        3
        4
        5
        The sum of 5 no is : 15
        The Average is : 3.0
         */

        Scanner scanner = new Scanner(System.in);

        int[] number = new int[5];

        System.out.println("Input the 5 numbers: ");
        for (int i = 0; i < number.length; i++) {

            number[i] = scanner.nextInt();
        }

        System.out.println("The sum of 5 numbers is: " + sum(number));
        System.out.println("The Average is: " + avg(number));

    }
}
