import java.util.*;

public class ques44 {

    // Function to return indices of two numbers that sum to target
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; // Return indices
            }

            // Store current number with its index
            map.put(nums[i], i);
        }

        return new int[] {}; // No solution found
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices of numbers that add up to " + target + ": " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }
}

