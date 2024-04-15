package conditionals;

import java.util.Scanner;

public class Multiplication {
    static void multiplication(int number){
        for (int i = 0; i < 11; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
    public static void main(String[] args) {
        /*
        Write a Java program to display the multiplication table of a given integer.

        Test Data
        Input the number (Table to be calculated) : Input number of terms : 5
        Expected Output :

        5 X 0 = 0
        5 X 1 = 5
        5 X 2 = 10
        5 X 3 = 15
        5 X 4 = 20
        5 X 5 = 25
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number (Table to be calculated) : Input number of terms :");
        int terms = scanner.nextInt();

        multiplication(terms);



    }
}
