    import java.util.Stack;

class ques28 {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public ques28() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push1(int x) {
        stack1.push(x);
    }

    public void push2(int x) {
        stack2.push(x);
    }

    public int pop1() {
        if (!stack1.isEmpty()) {
            return stack1.pop();
        } else {
            return -1;
        }
    }

    public int pop2() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        ques28 ts = new ques28();
        ts.push1(2);
        ts.push1(3);
        ts.push2(4);

        System.out.print(ts.pop1() + " ");
        System.out.print(ts.pop2() + " ");
        System.out.print(ts.pop2() + " ");
    }
}
// Time Complexity: O(1) for push and pop operations
// Space Complexity: O(n) for the two stacks