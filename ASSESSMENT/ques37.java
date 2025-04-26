import java.util.*;

public class ques37 {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);  
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));  
            return;
        }
        if (target < 0) return;  

        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);  
            backtrack(candidates, target - candidates[i], i, current, result);  
            current.remove(current.size() - 1);  
        }
    }

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
// Time Complexity: O(2^n) for generating all combinations
// Space Complexity: O(n) for the recursion stack and storing combinations