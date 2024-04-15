package leetCode.top150.Problem27;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int size = nums.length;
        int counter = 0;

        for (int num : nums) {
            if (num != val) {
                counter++;
            }
        }
        return counter;
    }
}
