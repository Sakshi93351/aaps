import java.util.*;

public class ques37 {

    // Function to find all unique combinations that sum to target
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);  // Optional: for optimization and pruning
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    // Backtracking helper function
    private static void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));  // Found a valid combination
            return;
        }
        if (target < 0) return;  // Exceeded target, no need to proceed

        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);  // Choose
            backtrack(candidates, target - candidates[i], i, current, result);  // Not i + 1 because we can reuse elements
            current.remove(current.size() - 1);  // Backtrack
        }
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = combinationSum(candidates, target);

        System.out.println("Combinations that sum to " + target + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
