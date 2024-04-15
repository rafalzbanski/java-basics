package conditionals;

import java.util.Scanner;

public class OddNumbers {
    static int sum(int[] tab){

        int sumOfDigits = 0;

        for (int i : tab) {
            sumOfDigits += i;
        }

        return sumOfDigits;
    }
    static void storeNumbers(int term){
        int[] tab = new int[5];

        int counter = 0;
        int step = 1;
        while (counter < 5) {
            if (step % 2 == 1){
                System.out.println(step);
                tab[counter] = step;
                counter ++;

            }
            step ++;
        }

        System.out.println("The Sum of odd Natural Number upto " + term + " terms is: " + sum(tab));
    }
    public static void main(String[] args) {
        /*
         Write a Java program that displays the sum of n odd natural numbers.

        Test Data
        Input number of terms is: 5
        Expected Output :

        The odd numbers are :
        1
        3
        5
        7
        9
        The Sum of odd Natural Number upto 5 terms is: 25
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number of terms is: ");
        int term = scanner.nextInt();

        storeNumbers(term);



    }
}
