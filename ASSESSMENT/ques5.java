public class ques5 {

    static int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;

        if (n < k) {
            System.out.println("Invalid: Array size is smaller than K");
            return -1;
        }
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
        public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;

        int result = maxSubarraySum(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
}
//Time Complexity: O(n2)
//Auxiliary Space: O(1)
