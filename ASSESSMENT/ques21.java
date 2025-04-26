public class ques21 {

    public static int countBits(int n) {
        int count = 0;

        for (int i = 0; i <= n; i++) {
            count += Integer.bitCount(i); 
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 5;  
        System.out.println("Total number of 1's in binary representation of numbers from 0 to " + n + ": " + countBits(n));
    }
}
// Time Complexity: O(n * log n) for counting bits in each number
// Space Complexity: O(1) as we are using a constant amount of space