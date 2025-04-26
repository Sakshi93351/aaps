public class ques22 {

    public static boolean isPowerOfTwo(int n) {
       
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int[] testNumbers = {1, 2, 3, 4, 5, 8, 16, 18, 32};

        for (int num : testNumbers) {
            if (isPowerOfTwo(num)) {
                System.out.println(num + " is a power of two.");
            } else {
                System.out.println(num + " is NOT a power of two.");
            }
        }
    }
}
// Time Complexity: O(1)
// Space Complexity: O(1)

