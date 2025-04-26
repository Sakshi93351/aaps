public class ques3 {
    static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        for (int i = 0; i < arr.length; i++) {
            if (leftSum == totalSum - leftSum - arr[i]) {
                return i;
            }
            leftSum += arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };

        int eqIndex = findEquilibriumIndex(arr);

        if (eqIndex != -1) {
            System.out.println("Equilibrium index is: " + eqIndex);
        } else {
            System.out.println("No equilibrium index found.");
        }
    }
}
//O(n) Time and O(1) Space

