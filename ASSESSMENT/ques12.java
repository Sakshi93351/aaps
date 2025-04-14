import java.util.Arrays;

public class ques12 {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find the first decreasing element from the end
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If such element is found, find element just larger than it to the right
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Swap nums[i] and nums[j]
            swap(nums, i, j);
        }

        // Step 3: Reverse the suffix starting at i+1
        reverse(nums, i + 1, n - 1);
    }

    // Helper method to reverse part of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    // Helper method to swap two elements
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Main method
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        System.out.println("Original array: " + Arrays.toString(nums));
        nextPermutation(nums);
        System.out.println("Next permutation: " + Arrays.toString(nums));
    }
}

