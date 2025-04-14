public class ques29 {

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int x) {
        // If the number is negative or ends with 0 but is not 0, it's not a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reversedHalf = 0;
        // Reverse the second half of the number
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        
        // If the number has an odd number of digits, we remove the middle digit
        // (by dividing reversedHalf by 10) before comparison
        return x == reversedHalf || x == reversedHalf / 10;
    }

    // Main method
    public static void main(String[] args) {
        int number = 121;  // Example number
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is NOT a palindrome.");
        }
    }
}

