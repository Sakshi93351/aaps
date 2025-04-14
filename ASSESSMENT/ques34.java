import java.util.HashMap;

public class ques34 {

    // Function to find the number of subarrays with sum equal to K
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;
        int count = 0;

        // Initialize the map with sum 0, which means the sum of subarray from the start is 0
        map.put(0, 1);

        // Traverse the array
        for (int num : nums) {
            // Update the current sum
            currentSum += num;

            // Check if there is a prefix sum that equals currentSum - k
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);  // Add the frequency of (currentSum - k)
            }

            // Update the frequency of the current sum in the map
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};  // Example array
        int k = 2;  // Target sum
        
        int result = subarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }
}
