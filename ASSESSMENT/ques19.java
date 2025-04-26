public class ques19 {

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max_ending_here = nums[0];
        int min_ending_here = nums[0];
        int max_so_far = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = max_ending_here;
                max_ending_here = min_ending_here;
                min_ending_here = temp;
            }

            max_ending_here = Math.max(nums[i], max_ending_here * nums[i]);
            min_ending_here = Math.min(nums[i], min_ending_here * nums[i]);

            max_so_far = Math.max(max_so_far, max_ending_here);
        }

        return max_so_far;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};

        System.out.println("Maximum product of a subarray: " + maxProduct(nums));
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)