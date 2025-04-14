public class ques_8 {

    // Helper method to expand around center and return the palindrome length
    private static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;  // Actual length of the palindrome
    }

    // Method to find the longest palindromic substring
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);     // Odd length
            int len2 = expandFromCenter(s, i, i + 1); // Even length
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    // Main method
    public static void main(String[] args) {
        String str = "babad";
        String result = longestPalindrome(str);
        System.out.println("Longest palindromic substring is: " + result);
    }
}

