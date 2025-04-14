public class ques4 {

    static boolean canSplit(int[] arr) {
        int totalSum = 0;

        // Step 1: Calculate total sum
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        // Step 2: Traverse array to check for split point
        for (int i = 0; i < arr.length - 1; i++) {
            leftSum += arr[i];
            int rightSum = totalSum - leftSum;

            if (leftSum == rightSum) {
                return true;
            }
        }

        return false;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};

        if (canSplit(arr)) {
            System.out.println("The array can be split into two parts with equal sum.");
        } else {
            System.out.println("The array cannot be split into two parts with equal sum.");
        }
    }
}
