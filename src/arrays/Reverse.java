package arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5,6};
        int start = 0;
        int stop = tab.length - 1;
        while (start < stop) {

            int temp = tab[start];
            tab[start] = tab[stop];
            tab[stop] = temp;

            start++;
            stop--;
        }
        System.out.println(Arrays.toString(tab));
    }
}
