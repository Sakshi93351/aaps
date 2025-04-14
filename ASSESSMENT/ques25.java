import java.util.Stack;

public class ques25 {
    
    // Function to find the next greater element for each element in the array
    public static void nextGreaterElement(int[] arr) {
        // Create a stack to store the elements for which we are finding the NGE
        Stack<Integer> stack = new Stack<>();
        
        // Traverse the array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // While stack is not empty and top of stack is less than or equal to arr[i]
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            
            // If stack is empty, no greater element exists
            if (stack.isEmpty()) {
                System.out.println(arr[i] + " --> -1");
            } else {
                // Top of stack is the next greater element
                System.out.println(arr[i] + " --> " + stack.peek());
            }
            
            // Push the current element to the stack
            stack.push(arr[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};  // Example array
        System.out.println("Next greater element for each element:");
        nextGreaterElement(arr);
    }
}
