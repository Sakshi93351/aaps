public class ques16 {

    // Function to find the majority element
    public static int majorityElement(int[] nums) {
        int candidate = -1;
        int count = 0;

        // First pass: find a potential majority element
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

        // Second pass (optional): Verify the candidate appears more than n/2 times
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

    // Main method
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};

        try {
            System.out.println("Majority Element: " + majorityElement(nums));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

