import java.util.HashSet;

public class ques6 {

    // Function to find length of longest substring without repeating characters
    static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int start = 0;

        HashSet<Character> set = new HashSet<>();

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);

            // If character is already in set, shrink window from start
            while (set.contains(currentChar)) {
                set.remove(s.charAt(start));
                start++;
            }

            // Add current character to set
            set.add(currentChar);

            // Update maximum length
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }

    // Main method
    public static void main(String[] args) {
        String str = "abcabcbb";
        int result = lengthOfLongestSubstring(str);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}

