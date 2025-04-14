public class ques22 {

    // Function to check if a number is a power of two
    public static boolean isPowerOfTwo(int n) {
        // A number is a power of two if it is greater than 0 and
        // n & (n - 1) == 0
        return n > 0 && (n & (n - 1)) == 0;
    }

    // Main method
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

