import java.util.HashMap;

public class ques34 {

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;
        int count = 0;

        map.put(0, 1);

        for (int num : nums) {
            currentSum += num;

            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);  
            }

            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};  
        int k = 2;  
        
        int result = subarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n) for the HashMap
