import java.util.Stack;

public class ques25 {
    
    public static void nextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            
            if (stack.isEmpty()) {
                System.out.println(arr[i] + " --> -1");
            } else {
                System.out.println(arr[i] + " --> " + stack.peek());
            }
            
            stack.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};  
        System.out.println("Next greater element for each element:");
        nextGreaterElement(arr);
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n) for the stack