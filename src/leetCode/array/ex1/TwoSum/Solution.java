package leetCode.array.ex1.TwoSum;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers
 * such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int complement = target - nums[i];

            // Check if the complement is in the remaining part of the array
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == complement) {
                    // If found, return the indices of the two numbers
                    return new int[]{i, j};
                }
            }
        }

        // If no solution is found, return an empty array or handle it as needed
        return new int[0];
    }

}
