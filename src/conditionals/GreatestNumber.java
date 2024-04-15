package conditionals;

import java.util.Scanner;

public class GreatestNumber {
    static String greatestNumber(int firstNumber, int secondNumber, int thirdNumber){

        int greatest = 0;

        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber){
                greatest =  firstNumber;
            }
        } else if (secondNumber > thirdNumber) {
            greatest = secondNumber;
        }else {
            greatest = thirdNumber;
        }
        return "The greatest: " + greatest;
    }
    public static void main(String[] args) {
        /*
        Write a Java program that takes three numbers
        from the user and prints the greatest number.

        Test Data
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
        Expected Output :
        The greatest: 87
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int a = scanner.nextInt();

        System.out.print("Input the 2st number: ");
        int b = scanner.nextInt();

        System.out.print("Input the 3st number: ");
        int c = scanner.nextInt();

        System.out.println(greatestNumber(a, b, c));
    }
}
