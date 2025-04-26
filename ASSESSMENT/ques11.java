public class ques11 {

    public static void findTwoSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + " + " + arr[right] + " = " + target);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("No pair found that adds up to the target.");
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11, 15};
        int target = 9;

        findTwoSum(arr, target);
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)

