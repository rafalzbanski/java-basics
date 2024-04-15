package leetCode.top150.Problem27;

public class Main {


        public static int removeElement(int[] nums, int val) {
            int k = 0; // Count of elements not equal to val

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[k] = nums[i];
                    k++;
                }
            }

            return k;
        }

        public static void main(String[] args) {
            // Example
            int[] nums = {3, 2, 2, 3};
            int val = 3;

            int result = removeElement(nums, val);

            // Print the modified array and the count of elements not equal to val
            System.out.print("Modified Array: ");
            for (int i = 0; i < result; i++) {
                System.out.print(nums[i] + " ");
            }

            System.out.println("\nCount of elements not equal to " + val + ": " + result);
        }


}
