package exceptionHandling.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = scanner.nextInt();

        isOdd(number);


    }

    public static void isOdd(int number){
        try {
            if (number % 2 == 1) {
                throw new ArithmeticException(number + " is odd");
            } else {
                System.out.println("Number is even");
            }
        }catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
