import java.util.*;

public class ques31 {
    
    // Function to find the maximum in every sliding window of size K
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return new int[0];
        }

        // Deque to store indices of array elements
        Deque<Integer> deque = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];

        // Iterate over the array
        for (int i = 0; i < nums.length; i++) {
            // Remove elements from deque that are out of the current window
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            
            // Remove all elements smaller than the current element (since they won't be the max)
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            
            // Add the current element's index to the deque
            deque.offerLast(i);
            
            // The first element in the deque is the max element for the current window
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        
        return result;
    }

    // Main method
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};  // Example array
        int k = 3;  // Window size
        
        int[] result = maxSlidingWindow(nums, k);
        
        // Print the result
        System.out.println("Maximum in every sliding window of size " + k + ":");
        System.out.println(Arrays.toString(result));
    }
}

