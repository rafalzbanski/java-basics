package conditionals;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        /*
        Write a program in Java to make such a pattern like a right angle triangle
        with a number which repeats a number in a row.

        The pattern is as follows :

        1
        22
        333
        4444
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Input number of rows :");
        int rows = scanner.nextInt();

        printTree(rows);


    }
    static void printTree(int size){

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
