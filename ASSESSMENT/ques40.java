import java.util.*;

public class ques40 {

    public static int findMaxFrequencyElement(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

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

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3, 3, 3};
        
        int result = findMaxFrequencyElement(arr);
        System.out.println("Element with maximum frequency: " + result);
    }
}
// Time Complexity: O(n) for traversing the array and O(n) for the frequency map
// Space Complexity: O(n) for the frequency map