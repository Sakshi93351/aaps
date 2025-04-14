public class ques19 {

    // Function to find the maximum product subarray
    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max_ending_here = nums[0];
        int min_ending_here = nums[0];
        int max_so_far = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is negative, swap max and min
            if (nums[i] < 0) {
                int temp = max_ending_here;
                max_ending_here = min_ending_here;
                min_ending_here = temp;
            }

            // Update max_ending_here and min_ending_here
            max_ending_here = Math.max(nums[i], max_ending_here * nums[i]);
            min_ending_here = Math.min(nums[i], min_ending_here * nums[i]);

            // Update the global maximum product
            max_so_far = Math.max(max_so_far, max_ending_here);
        }

        return max_so_far;
    }

    // Main method
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};

        System.out.println("Maximum product of a subarray: " + maxProduct(nums));
    }
}
