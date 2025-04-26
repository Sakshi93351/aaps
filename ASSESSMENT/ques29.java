public class ques29 {

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
      
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        int number = 121;  
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is NOT a palindrome.");
        }
    }
}
// Time Complexity: O(log n) where n is the number of digits in x
// Space Complexity: O(1) as we are using a constant amount of space
