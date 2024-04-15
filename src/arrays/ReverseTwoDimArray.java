package arrays;

import java.util.Arrays;

public class ReverseTwoDimArray {
    public static void main(String[] args) {
        int[][] tab = {{0, 0, 9, 9},
                        {1, 2, 3, 4},
                        {5, 6, 7, 8}};
        for (int i = 0; i < tab.length; i++) {

            int start = 0;
            int stop = tab[i].length - 1;
            while (start < stop) {

                int temp = tab[i][start];
                tab[i][start] = tab[i][stop];
                tab[i][stop] = temp;

                start++;
                stop--;
            }
        }
        for (int[] ints : tab) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");

            }
            System.out.println();
        }

        System.out.println("----");
        for (int i: tab[2]) {
            System.out.print(i + ", ");
        }


    }
}
