public class ques16 {

    public static int majorityElement(int[] nums) {
        int candidate = -1;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        int countVerify = 0;
        for (int num : nums) {
            if (num == candidate) {
                countVerify++;
            }
        }

        if (countVerify > nums.length / 2) {
            return candidate;
        } else {
            throw new IllegalArgumentException("No majority element found.");
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};

        try {
            System.out.println("Majority Element: " + majorityElement(nums));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
// Time Complexity: O(n) for finding the majority element
// Space Complexity: O(1) for using constant space
