import java.util.*;

public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);
        return result;
    }

    // Backtracking helper function
    private static void backtrack(int[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length) {
            // Convert array to list and add to result
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);  // Swap the current index with i
            backtrack(nums, start + 1, result);  // Recurse on the next index
            swap(nums, start, i);  // Backtrack (undo the swap)
        }
    }

    // Swap function
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        List<List<Integer>> permutations = permute(nums);

        System.out.println("All permutations:");
        for (List<Integer> p : permutations) {
            System.out.println(p);
        }
    }
}
