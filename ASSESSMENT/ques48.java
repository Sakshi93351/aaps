import java.util.Arrays;

public class ques48 {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;

        // Step 1: Find the first decreasing element from the end
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If such element is found, find next greater and swap
        if (i >= 0) {
            int j = n - 1;
            while (j >= i && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: Reverse the suffix from i+1 to end
        reverse(nums, i + 1, n - 1);
    }

    // Swap utility
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Reverse utility
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println("Next permutation: " + Arrays.toString(nums));
    }
}
