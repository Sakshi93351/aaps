import java.util.*;

public class ques36 {

    // Function to generate all subsets of the given array using backtracking
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    // Backtracking helper function
    private static void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        // Add the current subset to the result
        result.add(new ArrayList<>(current));

        // Generate all possible subsets starting from the current position
        for (int i = start; i < nums.length; i++) {
            // Include the current element in the subset
            current.add(nums[i]);
            // Move forward to the next elements
            backtrack(nums, i + 1, current, result);
            // Backtrack, remove the current element from the subset
            current.remove(current.size() - 1);
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};  // Example array
        
        List<List<Integer>> result = subsets(nums);
        
        // Printing all subsets
        System.out.println("All subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
