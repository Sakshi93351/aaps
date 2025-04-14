public class ques17 {

    // Function to calculate the trapped water
    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0, right = height.length - 1;
        int left_max = 0, right_max = 0;
        int waterTrapped = 0;

        // Traverse the array from both ends
        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= left_max) {
                    left_max = height[left];  // Update the left_max
                } else {
                    waterTrapped += left_max - height[left];  // Water trapped on this bar
                }
                left++;
            } else {
                if (height[right] >= right_max) {
                    right_max = height[right];  // Update the right_max
                } else {
                    waterTrapped += right_max - height[right];  // Water trapped on this bar
                }
                right--;
            }
        }

        return waterTrapped;
    }

    // Main method
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println("Total water trapped: " + trap(height));
    }
}
