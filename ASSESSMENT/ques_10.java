public class ques_10 {

    public static void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                
                permute(str, left + 1, right);
                
                str = swap(str, left, i);
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String input = "ABC";
        System.out.println("Permutations of the string \"" + input + "\":");
        permute(input, 0, input.length() - 1);
    }
}
// Time Complexity: O(n! * n) for generating all permutations and printing them
// Space Complexity: O(n) for the recursion stack and string manipulation
