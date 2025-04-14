class TrieNode {
    TrieNode[] children = new TrieNode[2]; // Two children for bit 0 and bit 1
}

public class ques18 {

    // Function to find the maximum XOR of two numbers in the array
    public static int findMaximumXOR(int[] nums) {
        TrieNode root = new TrieNode();
        int maxXor = 0;

        // Insert each number in binary format into the Trie
        for (int num : nums) {
            insert(root, num);
        }

        // Find the maximum XOR for each number
        for (int num : nums) {
            maxXor = Math.max(maxXor, findMaxXorForNum(root, num));
        }

        return maxXor;
    }

    // Function to insert a number into the Trie
    private static void insert(TrieNode root, int num) {
        TrieNode node = root;
        // We use 32 bits to represent the number
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1; // Extract the bit at the i-th position
            if (node.children[bit] == null) {
                node.children[bit] = new TrieNode();
            }
            node = node.children[bit];
        }
    }

    // Function to find the maximum XOR for a given number
    private static int findMaxXorForNum(TrieNode root, int num) {
        TrieNode node = root;
        int maxXor = 0;
        // Traverse each bit of the number
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            // Try to take the opposite bit (1 vs 0) to maximize the XOR
            int oppositeBit = bit ^ 1;
            if (node.children[oppositeBit] != null) {
                maxXor |= (1 << i);  // If opposite bit exists, set it in the result
                node = node.children[oppositeBit];
            } else {
                node = node.children[bit];
            }
        }
        return maxXor;
    }

    // Main method
    public static void main(String[] args) {
        int[] nums = {3, 10, 5, 25, 2, 8};

        System.out.println("Maximum XOR of two numbers in the array: " + findMaximumXOR(nums));
    }
}
