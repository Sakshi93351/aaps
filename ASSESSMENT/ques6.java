import java.util.HashSet;

public class ques6 {
    static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int start = 0;

        HashSet<Character> set = new HashSet<>();

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            while (set.contains(currentChar)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(currentChar);
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        int result = lengthOfLongestSubstring(str);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}
//•	Time: O(n)
//	Space: O(n)


