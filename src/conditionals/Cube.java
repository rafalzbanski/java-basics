package conditionals;

import java.util.Scanner;

public class Cube {
    static int cube(int number){

        int cubeValue = 1;

        for (int i = 0; i < 3; i++) {
            cubeValue *= number;

        }

        return  cubeValue;
    }
    static void printer(int number){

        int counter = number;

        while (counter > 0){
            System.out.println("Number is : " + counter + " and cube of " + counter + " is: " + cube(counter));

            counter --;

        }
    }
    public static void main(String[] args) {
        /*
        Write a Java program to display the cube of the given number up to an integer.

        Test Data
        Input number of terms : 4
        Expected Output :

        Number is : 1 and cube of 1 is : 1
        Number is : 2 and cube of 2 is : 8
        Number is : 3 and cube of 3 is : 27
        Number is : 4 and cube of 4 is : 64

         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number of terms : ");
        int number = scanner.nextInt();

        printer(number);


    }
}
