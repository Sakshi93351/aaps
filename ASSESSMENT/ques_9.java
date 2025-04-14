public class ques_9{

    // Function to find longest common prefix
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Start with the first string as the prefix
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix until it matches the start of the current string
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    // Main method
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(words);
        System.out.println("Longest common prefix is: \"" + result + "\"");
    }
}
