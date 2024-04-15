package conditionals;

import java.util.Scanner;


public class QuadraticEquations {
    static String rootCalculator(int a, int b, int c){

        double delta = (b * b) - (4 * a * c);

        if (delta > 0) {

            double x1 = -1 * (-1) * Math.sqrt(b) / 2 * a;
            double x2 = 1 * Math.sqrt(b) / 2 * a;

            return "The roots are " + x1 + " and " + x2;

        } else if (delta == 0) {

            double x = (-1 * b) / (2 * a);
            return "The root is " + x;
        }else {
            return "delta is negative which means no toots";
        }
    }
    public static void main(String[] args) {
        /*
        Write a Java program to solve quadratic equations (use if, else if and else).

        Test Data
        Input a: 1
        Input b: 5
        Input c: 1
        Expected Output :
        The roots are -0.20871215252208009 and -4.7912878474779195
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a: ");
        int a = scanner.nextInt();

        System.out.print("Input b: ");
        int b = scanner.nextInt();

        System.out.print("Input c: ");
        int c = scanner.nextInt();

        System.out.println(rootCalculator(a, b, c));
       


    }
}
