public class ques21 {

    // Function to count the number of 1's in binary representation of all numbers from 0 to n
    public static int countBits(int n) {
        int count = 0;

        // Iterate through each number from 0 to n
        for (int i = 0; i <= n; i++) {
            count += Integer.bitCount(i); // Count the number of 1s in the binary representation of i
        }

        return count;
    }

    // Main method
    public static void main(String[] args) {
        int n = 5;  // Example: Count the number of 1s in binary representation of numbers from 0 to 5
        System.out.println("Total number of 1's in binary representation of numbers from 0 to " + n + ": " + countBits(n));
    }
}
