package conditionals;

import java.util.Scanner;

public class RightAngleTriangle2 {
    public static void main(String[] args) {
        /*
        Write a Java program to make such a pattern like a right angle triangle
        with the number increased by 1.

        The pattern like :

        1
        2 3
        4 5 6
        7 8 9 10
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Size:");
        int size = scanner.nextInt();

        printTree(size);
    }

    static void printTree(int size){

        int counter = 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
