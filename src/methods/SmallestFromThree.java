package methods;

import java.util.Scanner;

public class SmallestFromThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers");
        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number " + (i + 1) + " :");
            array[i] = scanner.nextInt();
        }

        System.out.println("The smallest number is: " + smallest(array));
    }

    public static int smallest(int[] arr) {
        int smallest = arr[0];
        for (int j : arr) {
            if (j < smallest) {
                smallest = j;
            }
        }

        return smallest;
    }
}