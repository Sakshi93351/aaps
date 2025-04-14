import java.util.Stack;

public class ques32 {

    // Function to find the largest rectangle area in a histogram
    public static int largestRectangleArea(int[] heights) {
        // Stack to store indices of the histogram bars
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int index = 0;

        // Traverse the histogram
        while (index < heights.length) {
            // If the current bar is higher than the bar at the stack's top index, push it onto the stack
            if (stack.isEmpty() || heights[index] >= heights[stack.peek()]) {
                stack.push(index++);
            } else {
                // Calculate the area with the top of the stack as the smallest bar
                int topOfStack = stack.pop();
                int area = heights[topOfStack] * (stack.isEmpty() ? index : index - stack.peek() - 1);
                maxArea = Math.max(maxArea, area);
            }
        }

        // Process the remaining bars in the stack
        while (!stack.isEmpty()) {
            int topOfStack = stack.pop();
            int area = heights[topOfStack] * (stack.isEmpty() ? index : index - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};  // Example histogram heights
        System.out.println("The largest rectangle area is: " + largestRectangleArea(heights));
    }
}
