import java.util.*;

public class ques35 {

    // Function to find the k-most frequent elements in an array
    public static List<Integer> topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each element using a hash map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a priority queue (min-heap) to store the k most frequent elements
        // The comparator is based on frequency: the least frequent elements will be at the top of the heap
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                return entry1.getValue() - entry2.getValue();
            }
        });

        // Step 3: Add elements to the heap, keeping only the k most frequent elements
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();  // Remove the element with the smallest frequency
            }
        }

        // Step 4: Extract the k most frequent elements from the heap
        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll().getKey());
        }

        // Return the result
        return result;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};  // Example array
        int k = 2;  // Find the 2 most frequent elements
        
        List<Integer> result = topKFrequent(nums, k);
        
        System.out.println("The " + k + " most frequent elements are: " + result);
    }
}
