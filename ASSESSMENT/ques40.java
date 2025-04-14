import java.util.*;

public class ques40 {

    // Function to find the element with maximum frequency
    public static int findMaxFrequencyElement(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        // Step 1: Count frequencies
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find the element with the highest frequency
        int maxFreq = 0;
        int maxFreqElement = arr[0];
        
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxFreqElement = entry.getKey();
            }
        }

        return maxFreqElement;
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3, 3, 3};
        
        int result = findMaxFrequencyElement(arr);
        System.out.println("Element with maximum frequency: " + result);
    }
}

