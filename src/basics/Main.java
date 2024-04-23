package basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] Argass) {
        // single line comment

        /**
         * document comment
         */

        /*
        multi line comment
         */

        System.out.println("Hello World!"); // printing "Hello World!" on screen

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        int reverser = 0;

        while (i != 0) {
            int digit = i % 10;
            if (digit != 0) {
                reverser = reverser * 10 + digit;
            }
            i /= 10;
        }
        System.out.println(reverser);


    }
}