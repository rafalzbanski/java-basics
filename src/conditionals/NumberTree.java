package conditionals;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class NumberTree {
    static void printTree(int row){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /*
        Write a Java program to display the pattern like a right angle triangle with a number.

        Test Data
        Input number of rows : 10
        Expected Output :

        1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Input number of rows :");
        int rows = scanner.nextInt();

        printTree(rows);

    }

}
