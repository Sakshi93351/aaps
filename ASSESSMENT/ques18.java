class TrieNode {
    TrieNode[] children = new TrieNode[2]; 
}

public class ques18 {

    public static int findMaximumXOR(int[] nums) {
        TrieNode root = new TrieNode();
        int maxXor = 0;

        for (int num : nums) {
            insert(root, num);
        }

        for (int num : nums) {
            maxXor = Math.max(maxXor, findMaxXorForNum(root, num));
        }

        return maxXor;
    }

    private static void insert(TrieNode root, int num) {
        TrieNode node = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1; // Extract the bit at the i-th position
            if (node.children[bit] == null) {
                node.children[bit] = new TrieNode();
            }
            node = node.children[bit];
        }
    }

    private static int findMaxXorForNum(TrieNode root, int num) {
        TrieNode node = root;
        int maxXor = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int oppositeBit = bit ^ 1;
            if (node.children[oppositeBit] != null) {
                maxXor |= (1 << i);  
                node = node.children[oppositeBit];
            } else {
                node = node.children[bit];
            }
        }
        return maxXor;
    }

    public static void main(String[] args) {
        int[] nums = {3, 10, 5, 25, 2, 8};

        System.out.println("Maximum XOR of two numbers in the array: " + findMaximumXOR(nums));
    }
}
// Time Complexity: O(n * 32) = O(n) since we are inserting and searching in a trie of height 32 (for 32-bit integers)
// Space Complexity: O(n * 32) = O(n) for the trie structure, where n is the number of elements in the array