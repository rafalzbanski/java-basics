package arrays;

import java.util.Scanner;
import java.util.Random;

public class SumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i=0; i < array.length; i++) {
            array[i] = rand.nextInt(101);
        }

        printArray(array);
        System.out.println("\nSum of numbers in array: " + sumOfArray(array));

    }
    static void printArray(int[] arr){
        System.out.println("Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static int sumOfArray(int[] arr){
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        return sum;
    }
}
