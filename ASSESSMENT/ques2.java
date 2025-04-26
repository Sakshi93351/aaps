import java.util.Scanner;

public class ques2 {
    static int[] computePrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        return prefixSum;
    }

    static int rangeSum(int[] prefixSum, int L, int R) {
        if (L == 0) {
            return prefixSum[R];
        }
        return prefixSum[R] - prefixSum[L - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefixSum = computePrefixSum(arr);
        System.out.print("Enter range L and R (0-based index): ");
        int L = sc.nextInt();
        int R = sc.nextInt();
        System.out.println("Sum from index " + L + " to " + R + " is: " + rangeSum(prefixSum, L, R));
        sc.close();
    }
}
//Time Complexity: O(n)
//Auxiliary Space: O(n)

