public class ques_10 {

    // Helper method to generate permutations
    public static void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                // Swap characters at index left and i
                str = swap(str, left, i);
                
                // Recurse for the rest
                permute(str, left + 1, right);
                
                // Backtrack
                str = swap(str, left, i);
            }
        }
    }

    // Method to swap characters in a string
    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    // Main method
    public static void main(String[] args) {
        String input = "ABC";
        System.out.println("Permutations of the string \"" + input + "\":");
        permute(input, 0, input.length() - 1);
    }
}

