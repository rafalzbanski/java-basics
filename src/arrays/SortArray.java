package arrays;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numericArray = {7, 4, 1, 0, 5, 8, -4, 3};
        sortNumericArray(numericArray);

        String[] literalString = {"Michal", "Iza", "Rafal", "Pawel"};
        sortLiteralArray(literalString);
    }
     static void sortNumericArray(int[] arr){
         System.out.println("Array before sort: ");
         for (int i: arr) {
             System.out.print(i + " ");
         }
         Arrays.sort(arr);

         System.out.println("\nArray after sort: ");
         for (int i : arr) {
             System.out.print(i + " ");
         }
     }

    static void sortLiteralArray(String[] arr){
        System.out.println("Array before sort: ");
        for (String i: arr) {
            System.out.print(i + " ");
        }
        Arrays.sort(arr);

        System.out.println("\nArray after sort: ");
        for (String i : arr) {
            System.out.print(i + " ");
        }
    }

}
