package conditionals;

import java.util.Scanner;

public class CenterAngleTriangle {
    public static void main(String[] args) {
        /*
         Write a Java program to make such a pattern like a pyramid
         with a number that repeats in the same row.

                       1
                      2 2
                     3 3 3
                    4 4 4 4

         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of rows: ");
        int size = scanner.nextInt();

        printTree(size);
    }
    static void printTree(int size){

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= size-i; k++) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
