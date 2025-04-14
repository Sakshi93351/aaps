class TrieNode {
    TrieNode[] children = new TrieNode[2];  // Two children, 0 or 1
}

public class ques23 {
    
    // Function to insert a number in the Trie
    private static void insert(TrieNode root, int num) {
        TrieNode node = root;
        // Insert each bit of the number
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (node.children[bit] == null) {
                node.children[bit] = new TrieNode();
            }
            node = node.children[bit];
        }
    }
    
    // Function to find the maximum XOR for a given number with the Trie
    private static int findMaxXOR(TrieNode root, int num) {
        TrieNode node = root;
        int maxXor = 0;
        // Traverse the Trie and try to get the maximum XOR
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            // Try to take the opposite bit to maximize XOR
            int oppositeBit = bit == 0 ? 1 : 0;
            if (node.children[oppositeBit] != null) {
                maxXor |= (1 << i);
                node = node.children[oppositeBit];
            } else {
                node = node.children[bit];
            }
        }
        return maxXor;
    }
    
    // Function to find the maximum XOR of two numbers in the array
    public static int findMaximumXOR(int[] nums) {
        TrieNode root = new TrieNode();
        int maxXor = 0;
        
        // Insert each number into the Trie
        for (int num : nums) {
            insert(root, num);
        }
        
        // For each number, find the maximum XOR with the numbers inserted so far
        for (int num : nums) {
            maxXor = Math.max(maxXor, findMaxXOR(root, num));
        }
        
        return maxXor;
    }
    
    // Main method
    public static void main(String[] args) {
        int[] nums = {3, 10, 5, 25, 2, 8};  // Example array
        
        System.out.println("Maximum XOR of two numbers in the array: " + findMaximumXOR(nums));
    }
}
