package leetCode.top150.Problem88;

import java.util.ArrayList;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> sortedNumbers = new ArrayList<Integer>();


        for (int i = 0; i < m; i++) {
            sortedNumbers.add(nums1[i]);
        }

        for (int i = 0; i <n; i++) {
            sortedNumbers.add(nums2[i]);
        }

    }
}
